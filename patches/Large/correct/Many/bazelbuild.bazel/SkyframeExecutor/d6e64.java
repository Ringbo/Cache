diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeExecutor.java b/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeExecutor.java
index cf22239..2428c02 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeExecutor.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeExecutor.java
@@ -399,7 +399,7 @@
             // We evaluate in keepGoing mode because in the case that the graph does not store its
             // edges, nokeepGoing builds are not allowed, whereas keepGoing builds are always
             // permitted.
-            EvaluationResult<ActionLookupValue> result = buildDriver.evaluate(
+            EvaluationResult<SkyValue> result = buildDriver.evaluate(
                 ImmutableList.of(key), true, ResourceUsage.getAvailableProcessors(),
                 errorEventListener);
             if (!result.hasError()) {
