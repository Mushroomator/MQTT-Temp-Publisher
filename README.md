![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)
[![Create and publish Docker image](https://github.com/Mushroomator/MQTT-Temp-Publisher/actions/workflows/createAndPushDockerImage.yaml/badge.svg)](https://github.com/Mushroomator/MQTT-Temp-Publisher/actions/workflows/createAndPushDockerImage.yaml)

# MQTT Temp Publisher
Simple MQTT publisher which collects dummy temperature data and publishes it to a MQTT message broker. This serves as a demonstration on how to use the [MQTT KPI Publisher](https://github.com/Mushroomator/MQTT-Temp-Publisher) mini-framework and as a test container to show the application stack defined in [MQTT KPI Collection Project](https://github.com/Mushroomator/MQTT-KPI-Collection-Project) working.

> This repository is part of the [MQTT KPI Collection Project](https://github.com/Mushroomator/MQTT-KPI-Collection-Project).

## Table of Contents
- [MQTT Temp Publisher](#mqtt-temp-publisher)
  - [Table of Contents](#table-of-contents)
  - [Getting started](#getting-started)
  - [More information](#more-information)
  - [License](#license)

## Getting started
There is a Docker image available to start the *MQTT Temp Publisher* which you can run with one simple command:
```bash
docker run -d thomaspilz/mqtt-temp-publisher:$COMMIT_SHA \
  -e MQTT_MSG_BROKER_URL=tcp://mosquitto:1883 \
  -e MQTT_CLIENT_ID=mqtt-temp-publisher \
  -e MQTT_TOPIC=/kpi/temperature
```
`$COMMIT_SHA` must be replaced with the first seven characters of the corresponding Github commit hash.
Details on the environment variables (-e option) can be found in the README of the [MQTT KPI Publisher](https://github.com/Mushroomator/MQTT-Temp-Publisher).

## More information
This application makes use of [MQTT KPI Publisher](https://github.com/Mushroomator/MQTT-Temp-Publisher). 
For more information on the implementation, environment variables etc. please check out the documentation there.

## License
Copyright 2021 Thomas Pilz

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.