diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PCollectionView.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PCollectionView.java
index 457e78a..a351723 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PCollectionView.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PCollectionView.java
@@ -49,7 +49,7 @@
    *     obtain that information via a package-private channel.
    */
   @Deprecated
-  public TupleTag<Iterable<WindowedValue<?>>> getTagInternal();
+  TupleTag<Iterable<WindowedValue<?>>> getTagInternal();
 
   /**
    * @deprecated this method will be removed entirely. The {@link ViewFn} for a side input is an
@@ -57,7 +57,7 @@
    *     obtain this specification via a package-private channel.
    */
   @Deprecated
-  public ViewFn<Iterable<WindowedValue<?>>, T> getViewFn();
+  ViewFn<Iterable<WindowedValue<?>>, T> getViewFn();
 
   /**
    * @deprecated this method will be removed entirely. The {@link PCollection} underlying a side
@@ -66,7 +66,7 @@
    *     channel.
    */
   @Deprecated
-  public WindowingStrategy<?, ?> getWindowingStrategyInternal();
+  WindowingStrategy<?, ?> getWindowingStrategyInternal();
 
   /**
    * @deprecated this method will be removed entirely. The {@link PCollection} underlying a side
@@ -74,5 +74,5 @@
    *     ParDo} transform, which will obtain that information via a package-private channel.
    */
   @Deprecated
-  public Coder<Iterable<WindowedValue<?>>> getCoderInternal();
+  Coder<Iterable<WindowedValue<?>>> getCoderInternal();
 }
