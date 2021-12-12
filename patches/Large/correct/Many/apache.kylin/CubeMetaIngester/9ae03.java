diff --git a/tool/src/main/java/org/apache/kylin/tool/CubeMetaIngester.java b/tool/src/main/java/org/apache/kylin/tool/CubeMetaIngester.java
index bdd849c..a8e0ab3 100644
--- a/tool/src/main/java/org/apache/kylin/tool/CubeMetaIngester.java
+++ b/tool/src/main/java/org/apache/kylin/tool/CubeMetaIngester.java
@@ -94,11 +94,11 @@
         kylinConfig = KylinConfig.getInstanceFromEnv();
 
         if (optionsHelper.hasOption(OPTION_FORCE_INGEST)) {
-            forceIngest = Boolean.valueOf(optionsHelper.getOptionValue(OPTION_FORCE_INGEST));
+            forceIngest = Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_FORCE_INGEST));
         }
 
         if (optionsHelper.hasOption(OPTION_OVERWRITE_TABLES)) {
-            overwriteTables = Boolean.valueOf(optionsHelper.getOptionValue(OPTION_OVERWRITE_TABLES));
+            overwriteTables = Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_OVERWRITE_TABLES));
         }
 
         targetProjectName = optionsHelper.getOptionValue(OPTION_PROJECT);
