diff --git a/tool/src/main/java/org/apache/kylin/tool/MrJobInfoExtractor.java b/tool/src/main/java/org/apache/kylin/tool/MrJobInfoExtractor.java
index dab49b2..31c0a5c 100644
--- a/tool/src/main/java/org/apache/kylin/tool/MrJobInfoExtractor.java
+++ b/tool/src/main/java/org/apache/kylin/tool/MrJobInfoExtractor.java
@@ -151,7 +151,7 @@
     @Override
     protected void executeExtract(OptionsHelper optionsHelper, File exportDir) throws Exception {
         try {
-            boolean includeTaskDetails = optionsHelper.hasOption(OPTION_INCLUDE_DETAILS) ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_DETAILS)) : true;
+            boolean includeTaskDetails = optionsHelper.hasOption(OPTION_INCLUDE_DETAILS) ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_DETAILS)) : true;
             String mrJobId = optionsHelper.getOptionValue(OPTION_MR_JOB_ID);
             extractRestCheckUrl();
 
