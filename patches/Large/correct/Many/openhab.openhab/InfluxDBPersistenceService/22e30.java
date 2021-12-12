diff --git a/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java b/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java
index 04e3b8a..9b86925 100644
--- a/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java
+++ b/bundles/persistence/org.openhab.persistence.influxdb/java/org/openhab/persistence/influxdb/internal/InfluxDBPersistenceService.java
@@ -172,12 +172,12 @@
     }
 
     if (!isProperlyConfigured) {
-      logger.error("Configuration for influxdb not yet loaded or broken.");
+      logger.warn("Configuration for influxdb not yet loaded or broken.");
       return;
     }
 
     if (!isConnected()) {
-      logger.error("InfluxDB is not yet connected");
+      logger.warn("InfluxDB is not yet connected");
       return;
     }
 
@@ -210,7 +210,7 @@
       // e.g. raised by authentication errors
       logger
           .error(
-              "database connection error may be wrong password, username or dbname: {}",
+              "database error: {}",
               e.getMessage());
     }
   }
@@ -264,12 +264,12 @@
     logger.debug("got a query");
 
     if (!isProperlyConfigured) {
-      logger.error("Configuration for influxdb not yet loaded or broken.");
+      logger.warn("Configuration for influxdb not yet loaded or broken.");
       return Collections.emptyList();
     }
 
     if (!isConnected()) {
-      logger.error("InfluxDB is not yet connected");
+      logger.warn("InfluxDB is not yet connected");
       return Collections.emptyList();
     }
 
