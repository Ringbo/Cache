diff --git a/src/main/java/com/google/devtools/build/lib/buildtool/BuildTool.java b/src/main/java/com/google/devtools/build/lib/buildtool/BuildTool.java
index 8a7477f..ed4f6c9 100644
--- a/src/main/java/com/google/devtools/build/lib/buildtool/BuildTool.java
+++ b/src/main/java/com/google/devtools/build/lib/buildtool/BuildTool.java
@@ -206,7 +206,7 @@
       if (needsExecutionPhase(request.getBuildOptions())) {
         runtime.getSkyframeExecutor().injectTopLevelContext(request.getTopLevelArtifactContext());
         executionTool.executeBuild(request.getId(), analysisResult, result,
-            configurations, transformPackageRoots(loadingResult.getPackageRoots()));
+            configurations, transformPackageRoots(analysisResult.getPackageRoots()));
       }
 
       String delayedErrorMsg = analysisResult.getError();
