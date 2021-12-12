diff --git a/sdk/src/main/java/com/google/cloud/dataflow/sdk/testing/TestDataflowPipelineRunner.java b/sdk/src/main/java/com/google/cloud/dataflow/sdk/testing/TestDataflowPipelineRunner.java
index 3201c2a..8dfb674 100644
--- a/sdk/src/main/java/com/google/cloud/dataflow/sdk/testing/TestDataflowPipelineRunner.java
+++ b/sdk/src/main/java/com/google/cloud/dataflow/sdk/testing/TestDataflowPipelineRunner.java
@@ -40,7 +40,8 @@
   public DataflowPipelineJob run(Pipeline pipeline) {
     DataflowPipelineJob state = super.run(pipeline);
     if (state.getState() != State.DONE) {
-      throw new AssertionError("The dataflow failed.");
+      // TODO: Get an exception from the remote service.
+      throw new IllegalStateException("The dataflow failed.");
     }
     return state;
   }
