diff --git a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowPipelineWorkerPoolOptions.java b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowPipelineWorkerPoolOptions.java
index 7d043c3..b6ec9c3 100644
--- a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowPipelineWorkerPoolOptions.java
+++ b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/options/DataflowPipelineWorkerPoolOptions.java
@@ -49,7 +49,7 @@
    * Type of autoscaling algorithm to use.
    */
   @Experimental(Experimental.Kind.AUTOSCALING)
-  public enum AutoscalingAlgorithmType {
+  enum AutoscalingAlgorithmType {
     /** Use numWorkers machines. Do not autoscale the worker pool. */
     NONE("AUTOSCALING_ALGORITHM_NONE"),
 
@@ -124,7 +124,7 @@
    * Returns the default Docker container image that executes Dataflow worker harness, residing in
    * Google Container Registry.
    */
-  public static class WorkerHarnessContainerImageFactory
+  class WorkerHarnessContainerImageFactory
       implements DefaultValueFactory<String> {
     @Override
     public String create(PipelineOptions options) {
@@ -196,7 +196,7 @@
    * @deprecated Dataflow Service will only support TEARDOWN_ALWAYS policy in the future.
    */
   @Deprecated
-  public enum TeardownPolicy {
+  enum TeardownPolicy {
     /**
      * All VMs created for a Dataflow job are deleted when the job finishes, regardless of whether
      * it fails or succeeds.
@@ -216,7 +216,7 @@
 
     private final String teardownPolicy;
 
-    private TeardownPolicy(String teardownPolicy) {
+    TeardownPolicy(String teardownPolicy) {
       this.teardownPolicy = teardownPolicy;
     }
 
