diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/state/StateContext.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/state/StateContext.java
index 1d441a6..887a5f1 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/state/StateContext.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/state/StateContext.java
@@ -29,15 +29,15 @@
    * Returns the {@code PipelineOptions} specified with the
    * {@link org.apache.beam.sdk.runners.PipelineRunner}.
    */
-  public abstract PipelineOptions getPipelineOptions();
+  PipelineOptions getPipelineOptions();
 
   /**
    * Returns the value of the side input for the corresponding state window.
    */
-  public abstract <T> T sideInput(PCollectionView<T> view);
+  <T> T sideInput(PCollectionView<T> view);
 
   /**
    * Returns the window corresponding to the state.
    */
-  public abstract W window();
+  W window();
 }
