diff --git a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/logging/DataflowWorkerLoggingInitializer.java b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/logging/DataflowWorkerLoggingInitializer.java
index ed9f214..69d5599 100644
--- a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/logging/DataflowWorkerLoggingInitializer.java
+++ b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/logging/DataflowWorkerLoggingInitializer.java
@@ -103,7 +103,7 @@
     String filepath = System.getProperty(filepathProperty, defaultFilePath);
     int filesizeMb = Integer.parseInt(System.getProperty(FILESIZE_MB_PROPERTY, "1024"));
     DataflowWorkerLoggingHandler handler =
-        new DataflowWorkerLoggingHandler(filepath, filesizeMb * 1024 * 1024);
+        new DataflowWorkerLoggingHandler(filepath, filesizeMb * 1024L * 1024L);
     handler.setLevel(Level.ALL);
     return handler;
   }
