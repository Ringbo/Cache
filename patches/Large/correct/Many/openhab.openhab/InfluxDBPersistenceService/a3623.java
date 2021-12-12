diff --git a/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java b/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java
index 4ac6fab..17f9e35 100644
--- a/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java
+++ b/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java
@@ -317,7 +317,7 @@
     Object convertedValue;
     if (value.scale() == 0) {
       logger.trace("found no fractional part");
-      convertedValue = value.doubleValue();
+      convertedValue = value.toBigInteger();
     } else {
       logger.trace("found fractional part");
       convertedValue = value.doubleValue();
