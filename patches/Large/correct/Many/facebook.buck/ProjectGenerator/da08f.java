diff --git a/src/com/facebook/buck/apple/xcode/ProjectGenerator.java b/src/com/facebook/buck/apple/xcode/ProjectGenerator.java
index 44c273f..af1c442 100644
--- a/src/com/facebook/buck/apple/xcode/ProjectGenerator.java
+++ b/src/com/facebook/buck/apple/xcode/ProjectGenerator.java
@@ -390,7 +390,7 @@
     // TODO(Task #3772930): Go through all dependencies of the rule
     // and add any shell script rules here
     addRunScriptBuildPhasesForDependencies(rule, target);
-    addSourcesBuildPhase(
+    addSourcesAndHeadersBuildPhases(
         target,
         targetGroup,
         buildable.getSrcs(),
