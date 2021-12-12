diff --git a/tool/src/main/java/org/apache/kylin/tool/CubeMetaExtractor.java b/tool/src/main/java/org/apache/kylin/tool/CubeMetaExtractor.java
index 652ae8a..5cf0350 100644
--- a/tool/src/main/java/org/apache/kylin/tool/CubeMetaExtractor.java
+++ b/tool/src/main/java/org/apache/kylin/tool/CubeMetaExtractor.java
@@ -166,16 +166,16 @@
     @Override
     protected void executeExtract(OptionsHelper optionsHelper, File exportDir) throws Exception {
         includeSegments = optionsHelper.hasOption(OPTION_INCLUDE_SEGMENTS)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_SEGMENTS))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_SEGMENTS))
                 : true;
         includeJobs = optionsHelper.hasOption(OPTION_INCLUDE_JOB)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_JOB))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_JOB))
                 : false;
         includeSegmentDetails = optionsHelper.hasOption(OPTION_INCLUDE_SEGMENT_DETAILS)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_SEGMENT_DETAILS))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_SEGMENT_DETAILS))
                 : false;
         onlyJobOutput = optionsHelper.hasOption(OPTION_INCLUDE_ONLY_JOB_OUTPUT)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_ONLY_JOB_OUTPUT))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_ONLY_JOB_OUTPUT))
                 : true;
         storageType = optionsHelper.hasOption(OPTION_STORAGE_TYPE) ? optionsHelper.getOptionValue(OPTION_STORAGE_TYPE)
                 : null;
