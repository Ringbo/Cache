diff --git a/graylog2-server/src/main/java/org/graylog2/Configuration.java b/graylog2-server/src/main/java/org/graylog2/Configuration.java
index 478bc93..c61bc3f 100644
--- a/graylog2-server/src/main/java/org/graylog2/Configuration.java
+++ b/graylog2-server/src/main/java/org/graylog2/Configuration.java
@@ -78,10 +78,10 @@
     private int maxNumberOfIndices = 20;
 
     @Parameter(value = "output_batch_size", required = true, validator = PositiveIntegerValidator.class)
-    private int outputBatchSize = 5000;
+    private int outputBatchSize = 25;
 
     @Parameter(value = "outputbuffer_processors", required = true, validator = PositiveIntegerValidator.class)
-    private int outputBufferProcessors = 5;
+    private int outputBufferProcessors = 3;
     
     @Parameter(value = "outputbuffer_processor_threads_max_pool_size", required = true, validator = PositiveIntegerValidator.class)
     private int outputBufferProcessorThreadsMaxPoolSize = 30;
