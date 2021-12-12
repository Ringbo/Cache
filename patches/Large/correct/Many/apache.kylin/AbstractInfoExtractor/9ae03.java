diff --git a/tool/src/main/java/org/apache/kylin/tool/AbstractInfoExtractor.java b/tool/src/main/java/org/apache/kylin/tool/AbstractInfoExtractor.java
index eb59d20..54f7604 100644
--- a/tool/src/main/java/org/apache/kylin/tool/AbstractInfoExtractor.java
+++ b/tool/src/main/java/org/apache/kylin/tool/AbstractInfoExtractor.java
@@ -85,9 +85,9 @@
     protected void execute(OptionsHelper optionsHelper) throws Exception {
         String exportDest = optionsHelper.getOptionValue(options.getOption("destDir"));
         boolean shouldCompress = optionsHelper.hasOption(OPTION_COMPRESS)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_COMPRESS)) : true;
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_COMPRESS)) : true;
         boolean isSubmodule = optionsHelper.hasOption(OPTION_SUBMODULE)
-                ? Boolean.valueOf(optionsHelper.getOptionValue(OPTION_SUBMODULE)) : false;
+                ? Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_SUBMODULE)) : false;
         packageType = optionsHelper.getOptionValue(OPTION_PACKAGETYPE);
 
         if (packageType == null)
