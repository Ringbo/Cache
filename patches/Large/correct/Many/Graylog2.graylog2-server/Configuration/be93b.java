diff --git a/graylog2-server/src/main/java/org/graylog2/Configuration.java b/graylog2-server/src/main/java/org/graylog2/Configuration.java
index cbf2f9e..8761cc5 100644
--- a/graylog2-server/src/main/java/org/graylog2/Configuration.java
+++ b/graylog2-server/src/main/java/org/graylog2/Configuration.java
@@ -125,10 +125,10 @@
     @Parameter(value = "default_message_output_class")
     private String defaultMessageOutputClass = "";
 
-    @Parameter(value = "collector_expiration_threshold", validator = PositiveIntegerValidator.class)
+    @Parameter(value = "collector_expiration_threshold", validator = PositiveDurationValidator.class)
     private Duration collectorExpirationThreshold = Duration.days(14);
 
-    @Parameter(value = "collector_inactive_threshold", validator = PositiveIntegerValidator.class)
+    @Parameter(value = "collector_inactive_threshold", validator = PositiveDurationValidator.class)
     private Duration collectorInactiveThreshold = Duration.minutes(1);
 
     @Parameter(value = "dashboard_widget_default_cache_time", validator = PositiveDurationValidator.class)
