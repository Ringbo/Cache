diff --git a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowProfilingOptions.java b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowProfilingOptions.java
index ae8801b..092c17a 100644
--- a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowProfilingOptions.java
+++ b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowProfilingOptions.java
@@ -44,6 +44,6 @@
   /**
    * Configuration the for profiling agent.
    */
-  public static class DataflowProfilingAgentConfiguration extends HashMap<String, Object> {
+  class DataflowProfilingAgentConfiguration extends HashMap<String, Object> {
   }
 }
