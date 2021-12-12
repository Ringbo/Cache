diff --git a/modules/apps/staging/staging-test/src/testIntegration/java/com/liferay/staging/test/StagingLocalizationTest.java b/modules/apps/staging/staging-test/src/testIntegration/java/com/liferay/staging/test/StagingLocalizationTest.java
index 99e7ac8..0b71414 100644
--- a/modules/apps/staging/staging-test/src/testIntegration/java/com/liferay/staging/test/StagingLocalizationTest.java
+++ b/modules/apps/staging/staging-test/src/testIntegration/java/com/liferay/staging/test/StagingLocalizationTest.java
@@ -165,7 +165,7 @@
 
 		Map<String, String[]> parameterMap =
 			ExportImportConfigurationParameterMapFactoryUtil.
-				buildParameterMap();
+				buildFullPublishParameterMap();
 
 		Map<String, Serializable> publishLayoutLocalSettingsMap =
 			ExportImportConfigurationSettingsMapFactoryUtil.
