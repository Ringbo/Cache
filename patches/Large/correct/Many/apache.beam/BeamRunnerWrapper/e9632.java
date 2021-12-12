diff --git a/sdks/java/extensions/euphoria/euphoria-core/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/translate/BeamRunnerWrapper.java b/sdks/java/extensions/euphoria/euphoria-core/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/translate/BeamRunnerWrapper.java
index 8b5cc0a..07e3cbb 100644
--- a/sdks/java/extensions/euphoria/euphoria-core/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/translate/BeamRunnerWrapper.java
+++ b/sdks/java/extensions/euphoria/euphoria-core/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/translate/BeamRunnerWrapper.java
@@ -65,7 +65,12 @@
     return new BeamRunnerWrapper(options).withAllowedLateness(java.time.Duration.ofHours(1));
   }
 
-  /** Blocks until a given {@link Flow} is executed. */
+  /**
+   * Execute {@link Flow} flow and wait for result.
+   *
+   * @param flow flow to execute
+   * @return result
+   */
   public Result executeSync(Flow flow) {
     final Pipeline pipeline;
     if (flow instanceof BeamFlow && ((BeamFlow) flow).hasPipeline()) {
@@ -81,6 +86,12 @@
     return new Result(result);
   }
 
+  /**
+   * Execute {@link Flow} flow asynchronously..
+   *
+   * @param flow flow to execute
+   * @return result future
+   */
   public CompletableFuture<Result> executeAsync(Flow flow) {
     return CompletableFuture.supplyAsync(() -> executeSync(flow), submitExecutor);
   }
@@ -90,7 +101,7 @@
 
     private final PipelineResult result;
 
-    public Result(PipelineResult result) {
+    Result(PipelineResult result) {
       this.result = result;
     }
 
