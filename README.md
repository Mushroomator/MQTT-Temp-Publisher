![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)

# MQTT-Temp-Publisher
Simple MQTT publisher which collects dummy temperature data and publishes it to a MQTT message broker. This serves as a demonstration on how to use the [MQTT KPI Publisher](https://github.com/Mushroomator/MQTT-Temp-Publisher) mini-framework.

## Table of Contents
- [MQTT-Temp-Publisher](#mqtt-temp-publisher)
  - [Table of Contents](#table-of-contents)
  - [Getting started](#getting-started)
  - [Docker image](#docker-image)
  - [More information](#more-information)
  - [License](#license)

## Getting started
Make sure you have the .jar for the [MQTT KPI Publisher](https://github.com/Mushroomator/MQTT-Temp-Publisher) downloaded as this is a required dependency. Then add a dependency referencing the downloaded .jar to your pom.xml as follows:
```xml
<properties>
    <!-- Set path for .jar as a property -->
    <path-to-mqtt_kpi_publisher-jar>/home/tom/.m2/repository/de/othr/MqttKpiPublisher/0.1/MqttKpiPublisher-0.1-jar-with-dependencies.jar</path-to-mqtt_kpi_publisher-jar>
</properties>

<!-- use the property when defining the dependency -->
<dependency>
    <groupId>de.othr</groupId>
    <artifactId>MqttKpiPublisher</artifactId>
    <version>0.1</version>
    <scope>system</scope>
    <systemPath>${path-to-mqtt_kpi_publisher-jar}</systemPath>
</dependency>
```
You may want to run `mvn clean install` in your project root to let Maven build the project as a wholeif the IDE does not recognize the dependency immediately.

## Docker image

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