diff --git a/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleLevelBuilder.java b/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleLevelBuilder.java
index c05d608..5b287cd 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleLevelBuilder.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleLevelBuilder.java
@@ -67,7 +67,7 @@
           final HashSet<File> affectedBeforeDif = new HashSet<File>(allAffectedFiles);
 
           final boolean incremental = globalMappings.differentiate(
-            delta, removedPaths, successfullyCompiled, allCompiledFiles, allAffectedFiles
+            delta, removedPaths, filesToCompile, allCompiledFiles, allAffectedFiles
           );
 
           if (LOG.isDebugEnabled()) {
