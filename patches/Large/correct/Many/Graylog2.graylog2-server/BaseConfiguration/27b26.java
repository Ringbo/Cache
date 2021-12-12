diff --git a/graylog2-server/src/main/java/org/graylog2/plugin/BaseConfiguration.java b/graylog2-server/src/main/java/org/graylog2/plugin/BaseConfiguration.java
index 1492364..f68676d 100644
--- a/graylog2-server/src/main/java/org/graylog2/plugin/BaseConfiguration.java
+++ b/graylog2-server/src/main/java/org/graylog2/plugin/BaseConfiguration.java
@@ -71,7 +71,7 @@
     private boolean restEnableCors = true;
 
     @Parameter(value = "rest_enable_gzip")
-    private boolean restEnableGzip = false;
+    private boolean restEnableGzip = true;
 
     @Parameter(value = "rest_max_initial_line_length", required = true, validator = PositiveIntegerValidator.class)
     private int restMaxInitialLineLength = 4096;
