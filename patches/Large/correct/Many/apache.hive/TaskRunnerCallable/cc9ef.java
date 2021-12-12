diff --git a/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/TaskRunnerCallable.java b/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/TaskRunnerCallable.java
index 157f9d3..5c95086 100644
--- a/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/TaskRunnerCallable.java
+++ b/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/TaskRunnerCallable.java
@@ -217,7 +217,7 @@
               serviceConsumerMetadata, envMap, startedInputsMap, taskReporter, executor,
               objectRegistry,
               pid,
-              executionContext, memoryAvailable);
+              executionContext, memoryAvailable, false);
         }
       }
       if (taskRunner == null) {
