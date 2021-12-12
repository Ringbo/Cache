diff --git a/tool/src/main/java/org/apache/kylin/tool/JobDiagnosisInfoCLI.java b/tool/src/main/java/org/apache/kylin/tool/JobDiagnosisInfoCLI.java
index c8e144a..a0c8465 100644
--- a/tool/src/main/java/org/apache/kylin/tool/JobDiagnosisInfoCLI.java
+++ b/tool/src/main/java/org/apache/kylin/tool/JobDiagnosisInfoCLI.java
@@ -100,16 +100,16 @@
     protected void executeExtract(OptionsHelper optionsHelper, File exportDir) throws Exception {
         String kylinJobId = optionsHelper.getOptionValue(OPTION_JOB_ID);
         boolean includeCube = optionsHelper.hasOption(OPTION_INCLUDE_CUBE)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_CUBE))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_CUBE))
                 : true;
         boolean includeYarnLogs = optionsHelper.hasOption(OPTION_INCLUDE_YARN_LOGS)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_YARN_LOGS))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_YARN_LOGS))
                 : true;
         boolean includeClient = optionsHelper.hasOption(OPTION_INCLUDE_CLIENT)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_CLIENT))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_CLIENT))
                 : true;
         boolean includeConf = optionsHelper.hasOption(OPTION_INCLUDE_CONF)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_CONF))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_CONF))
                 : true;
 
         // dump job output
