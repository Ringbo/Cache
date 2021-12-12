diff --git a/src/com/facebook/buck/versions/VersionedTargetGraphCache.java b/src/com/facebook/buck/versions/VersionedTargetGraphCache.java
index a9b6a35..d501445 100644
--- a/src/com/facebook/buck/versions/VersionedTargetGraphCache.java
+++ b/src/com/facebook/buck/versions/VersionedTargetGraphCache.java
@@ -79,8 +79,7 @@
     }
     Preconditions.checkState(resolvedMode != VersionTargetGraphMode.EXPERIMENT);
     eventBus.post(
-        new ExperimentEvent(
-            "async_version_tg_builder", versionTargetGraphMode.toString(), "", null, null));
+        new ExperimentEvent("async_version_tg_builder", resolvedMode.toString(), "", null, null));
 
     if (resolvedMode == VersionTargetGraphMode.DISABLED) {
       return ParallelVersionedTargetGraphBuilder.transform(
