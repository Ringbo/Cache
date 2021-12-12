diff --git a/runners/direct-java/src/test/java/org/apache/beam/runners/direct/WatermarkManagerTest.java b/runners/direct-java/src/test/java/org/apache/beam/runners/direct/WatermarkManagerTest.java
index 8a27243..042abab 100644
--- a/runners/direct-java/src/test/java/org/apache/beam/runners/direct/WatermarkManagerTest.java
+++ b/runners/direct-java/src/test/java/org/apache/beam/runners/direct/WatermarkManagerTest.java
@@ -1452,7 +1452,7 @@
     return bundle.commit(BoundedWindow.TIMESTAMP_MAX_VALUE);
   }
 
-  private final CommittedResult result(
+  private CommittedResult result(
       AppliedPTransform<?, ?, ?> transform,
       @Nullable CommittedBundle<?> unprocessedBundle,
       Iterable<? extends CommittedBundle<?>> bundles) {
