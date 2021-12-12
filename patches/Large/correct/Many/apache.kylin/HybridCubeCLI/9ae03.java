diff --git a/server-base/src/main/java/org/apache/kylin/rest/job/HybridCubeCLI.java b/server-base/src/main/java/org/apache/kylin/rest/job/HybridCubeCLI.java
index 443eba6..4e490c8 100644
--- a/server-base/src/main/java/org/apache/kylin/rest/job/HybridCubeCLI.java
+++ b/server-base/src/main/java/org/apache/kylin/rest/job/HybridCubeCLI.java
@@ -116,7 +116,7 @@
         String projectName = optionsHelper.getOptionValue(OPTION_PROJECT);
         String modelName = optionsHelper.getOptionValue(OPTION_MODEL);
         String cubeNamesStr = optionsHelper.getOptionValue(OPTION_CUBES);
-        boolean checkCubeSize = optionsHelper.hasOption(OPTION_CHECK) ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_CHECK)) : true;
+        boolean checkCubeSize = optionsHelper.hasOption(OPTION_CHECK) ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_CHECK)) : true;
 
         HybridInstance hybridInstance = hybridManager.getHybridInstance(hybridName);
 
