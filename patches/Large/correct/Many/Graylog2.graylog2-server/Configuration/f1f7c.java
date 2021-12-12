diff --git a/graylog2-server/src/main/java/org/graylog2/Configuration.java b/graylog2-server/src/main/java/org/graylog2/Configuration.java
index c99efeb..dff026d 100644
--- a/graylog2-server/src/main/java/org/graylog2/Configuration.java
+++ b/graylog2-server/src/main/java/org/graylog2/Configuration.java
@@ -68,7 +68,7 @@
     private int maxNumberOfIndices = 20;
 
     @Parameter(value = "output_batch_size", required = true, validator = PositiveIntegerValidator.class)
-    private int outputBatchSize = 25;
+    private int outputBatchSize = 1000;
 
     @Parameter(value = "output_flush_interval", required = true, validator = PositiveIntegerValidator.class)
     private int outputFlushInterval = 1;
