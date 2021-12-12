diff --git a/tool/src/main/java/org/apache/kylin/tool/DiagnosisInfoCLI.java b/tool/src/main/java/org/apache/kylin/tool/DiagnosisInfoCLI.java
index d960f8f..9063e9e 100644
--- a/tool/src/main/java/org/apache/kylin/tool/DiagnosisInfoCLI.java
+++ b/tool/src/main/java/org/apache/kylin/tool/DiagnosisInfoCLI.java
@@ -122,23 +122,23 @@
     protected void executeExtract(final OptionsHelper optionsHelper, final File exportDir) throws IOException {
         final String projectInput = optionsHelper.getOptionValue(options.getOption("project"));
         final boolean includeConf = optionsHelper.hasOption(OPTION_INCLUDE_CONF)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_CONF))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_CONF))
                 : true;
         final boolean includeHBase = optionsHelper.hasOption(OPTION_INCLUDE_HBASE)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_HBASE))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_HBASE))
                 : true;
         final boolean includeClient = optionsHelper.hasOption(OPTION_INCLUDE_CLIENT)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_CLIENT))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_CLIENT))
                 : true;
         final boolean includeJob = optionsHelper.hasOption(OPTION_INCLUDE_JOB)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_INCLUDE_JOB))
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_INCLUDE_JOB))
                 : true;
         final int threadsNum = optionsHelper.hasOption(OPTION_THREADS)
-                ? Integer.valueOf(optionsHelper.getOptionValue(OPTION_THREADS))
+                ? Integer.parseInt(optionsHelper.getOptionValue(OPTION_THREADS))
                 : DEFAULT_PARALLEL_SIZE;
         final String projectNames = StringUtils.join(getProjects(projectInput), ",");
         final int period = optionsHelper.hasOption(OPTION_PERIOD)
-                ? Integer.valueOf(optionsHelper.getOptionValue(OPTION_PERIOD))
+                ? Integer.parseInt(optionsHelper.getOptionValue(OPTION_PERIOD))
                 : DEFAULT_PERIOD;
 
         logger.info("Start diagnosis info extraction in {} threads.", threadsNum);
