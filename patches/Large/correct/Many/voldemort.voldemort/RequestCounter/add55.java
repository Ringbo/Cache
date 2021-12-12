diff --git a/src/java/voldemort/store/stats/RequestCounter.java b/src/java/voldemort/store/stats/RequestCounter.java
index 6c07f45..09f3776 100644
--- a/src/java/voldemort/store/stats/RequestCounter.java
+++ b/src/java/voldemort/store/stats/RequestCounter.java
@@ -139,18 +139,19 @@
         this.timeSensor =
                 metricsRepository.sensor(timeSensorName, metricConfig, timeParentSensors);
         if (useHistogram) {
+            // Percentiles timePercentiles = new Percentiles(400008, 10000, Percentiles.BucketSizing.CONSTANT,
             Percentiles timePercentiles = new Percentiles(40000, 10000, Percentiles.BucketSizing.LINEAR,
-                    new Percentile(timeSensorName + ".10thPercentile", 0.10),
-                    new Percentile(timeSensorName + ".50thPercentile", 0.50),
-                    new Percentile(timeSensorName + ".95thPercentile", 0.95),
-                    new Percentile(timeSensorName + ".99thPercentile", 0.99));
+                    new Percentile(timeSensorName + ".10thPercentile", 10),
+                    new Percentile(timeSensorName + ".50thPercentile", 50),
+                    new Percentile(timeSensorName + ".95thPercentile", 95),
+                    new Percentile(timeSensorName + ".99thPercentile", 99));
             Map<String, Metric> percentiles = this.timeSensor.add(timePercentiles);
             this.latency10thPercentile = percentiles.get(timeSensorName + ".10thPercentile");
             this.latency50thPercentile = percentiles.get(timeSensorName + ".50thPercentile");
             this.latency95thPercentile = percentiles.get(timeSensorName + ".95thPercentile");
             this.latency99thPercentile = percentiles.get(timeSensorName + ".99thPercentile");
         }
-        this.latencyMax = this.timeSensor.add(timeSensorName + ".max", new Max());
+        this.latencyMax = this.timeSensor.add(timeSensorName + ".max", new Max(0));
         this.latencyAverage = this.timeSensor.add(timeSensorName + ".avg", new Avg());
         // Sampled count, all-time count and throughput rate, piggy-backing off of the Time Sensor
         this.requestSampledCount = this.timeSensor.add(name + ".sampled-count", new SampledCount());
@@ -178,14 +179,14 @@
 
         String valueBytesSensorName = name + ".value-bytes";
         this.valueBytesSensor = metricsRepository.sensor(valueBytesSensorName, metricConfig, valueBytesParentSensors);
-        this.valueBytesMax = this.valueBytesSensor.add(valueBytesSensorName + ".max", new Max());
+        this.valueBytesMax = this.valueBytesSensor.add(valueBytesSensorName + ".max", new Max(0));
         this.valueBytesAverage = this.valueBytesSensor.add(valueBytesSensorName + ".avg", new Avg());
 
         // Key Bytes Sensor
 
         String keyBytesSensorName = name + ".key-bytes";
         this.keyBytesSensor = metricsRepository.sensor(keyBytesSensorName, metricConfig, keyBytesParentSensors);
-        this.keyBytesMax = this.keyBytesSensor.add(keyBytesSensorName + ".max", new Max());
+        this.keyBytesMax = this.keyBytesSensor.add(keyBytesSensorName + ".max", new Max(0));
         this.keyBytesAverage = this.keyBytesSensor.add(keyBytesSensorName + ".avg", new Avg());
 
         // Get All Keys Count Sensor
@@ -195,7 +196,7 @@
                 metricsRepository.sensor(getAllKeysCountSensorName, metricConfig, getAllKeysCountParentSensors);
         this.getAllKeysCountSampledTotal =
                 this.getAllKeysCountSensor.add(getAllKeysCountSensorName + ".sampled-total", new SampledTotal());
-        this.getAllKeysCountMax = this.getAllKeysCountSensor.add(getAllKeysCountSensorName + ".max", new Max());
+        this.getAllKeysCountMax = this.getAllKeysCountSensor.add(getAllKeysCountSensorName + ".max", new Max(0));
     }
 
     public long getCount() {
