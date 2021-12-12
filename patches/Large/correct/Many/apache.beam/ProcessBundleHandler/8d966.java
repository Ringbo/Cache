diff --git a/sdks/java/harness/src/main/java/org/apache/beam/fn/harness/control/ProcessBundleHandler.java b/sdks/java/harness/src/main/java/org/apache/beam/fn/harness/control/ProcessBundleHandler.java
index 68f5d16..2336aa8 100644
--- a/sdks/java/harness/src/main/java/org/apache/beam/fn/harness/control/ProcessBundleHandler.java
+++ b/sdks/java/harness/src/main/java/org/apache/beam/fn/harness/control/ProcessBundleHandler.java
@@ -146,7 +146,7 @@
       ProcessBundleDescriptor processBundleDescriptor,
       SetMultimap<String, String> pCollectionIdsToConsumingPTransforms,
       ListMultimap<String, FnDataReceiver<WindowedValue<?>>> pCollectionIdsToConsumers,
-      HashSet<String> processedPTransformIds,
+      Set<String> processedPTransformIds,
       Consumer<ThrowingRunnable> addStartFunction,
       Consumer<ThrowingRunnable> addFinishFunction,
       BundleSplitListener splitListener)
