diff --git a/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildRunner.java b/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildRunner.java
index fe03b5e..a92a57f 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildRunner.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildRunner.java
@@ -219,7 +219,7 @@
           final boolean added = fileSet.add(file);
           if (added) {
             final BuildTargetType<?> targetType = descriptor.getTarget().getTargetType();
-            if (targetTypesToForceBuild.contains(targetType) || (forceBuildAllModuleBasedTargets && targetType instanceof ModuleInducedTargetType)) {
+            if (targetTypesToForceBuild.contains(targetType) || (forceBuildAllModuleBasedTargets && targetType instanceof ModuleBasedBuildTargetType)) {
               pd.fsState.markDirty(null, file, descriptor, timestamps, false);
             }
           }
