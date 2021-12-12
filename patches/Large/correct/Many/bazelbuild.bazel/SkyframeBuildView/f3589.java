diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeBuildView.java b/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeBuildView.java
index 3c6fd47..3a2334b 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeBuildView.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeBuildView.java
@@ -288,7 +288,8 @@
       if (someConfiguredTargetEvaluated
           || anyConfiguredTargetDeleted
           || !dirtiedConfiguredTargetKeys.isEmpty()
-          || !largestTopLevelKeySetCheckedForConflicts.containsAll(newKeys)) {
+          || !largestTopLevelKeySetCheckedForConflicts.containsAll(newKeys)
+          || !skyframeActionExecutor.badActions().isEmpty()) {
         largestTopLevelKeySetCheckedForConflicts = newKeys;
         // This operation is somewhat expensive, so we only do it if the graph might have changed in
         // some way -- either we analyzed a new target or we invalidated an old one or are building
