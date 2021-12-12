diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/runners/PipelineRunnerRegistrar.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/runners/PipelineRunnerRegistrar.java
index d72c44f..be95044 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/runners/PipelineRunnerRegistrar.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/runners/PipelineRunnerRegistrar.java
@@ -37,5 +37,5 @@
   /**
    * Get the set of {@link PipelineRunner PipelineRunners} to register.
    */
-  public Iterable<Class<? extends PipelineRunner<?>>> getPipelineRunners();
+  Iterable<Class<? extends PipelineRunner<?>>> getPipelineRunners();
 }
