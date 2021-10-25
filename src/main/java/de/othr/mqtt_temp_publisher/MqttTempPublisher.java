package de.othr.mqtt_temp_publisher;

import de.othr.mqtt_kpi_publisher.kpi.Kpi;
import de.othr.mqtt_kpi_publisher.kpi.Unit;
import de.othr.mqtt_kpi_publisher.publisher.MqttKpiPublisher;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;

/*
Copyright 2021 Thomas Pilz

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/**
 * Simple MQTT Publisher which generates a temperature and publishes that temperature to a MQTT message broker
 * @author Thomas Pilz
 */
public class MqttTempPublisher {
    public static void main(String[] args) {
        // start framework, which will do everything (logging, networking, signal handling etc.) but fetching the KPI
        MqttKpiPublisher.runMqttKpiCollector(() -> {
            int decPlaces = 2;
            // generate random temperature from 30 to 60 degrees
            var tempDouble = new Random().nextDouble() * 30 + 30;
            // use exact value (up to decPlaces count) as indicated in "Effective Java" by Joshua Bloch
            var temp = new BigDecimal(tempDouble).setScale(decPlaces, RoundingMode.HALF_UP);
            // return list of KPIs
            return List.of(new Kpi("engineTemp", Unit.DEGREE_CELCIUS, temp.doubleValue()));
        });
        /*
        Note: we are not supplying the mandatory parameters MQTT client ID, message broker URL and topic here, so this must be done
        using environment variables
         */
    }
}
