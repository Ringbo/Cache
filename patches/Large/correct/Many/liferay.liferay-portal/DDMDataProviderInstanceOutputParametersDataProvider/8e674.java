diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/DDMDataProviderInstanceOutputParametersDataProvider.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/DDMDataProviderInstanceOutputParametersDataProvider.java
index 306e75c..a95f1f6 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/DDMDataProviderInstanceOutputParametersDataProvider.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/DDMDataProviderInstanceOutputParametersDataProvider.java
@@ -57,7 +57,7 @@
 
 		Optional<Long> optionalDataProviderInstanceId =
 			ddmDataProviderRequest.getParameter(
-				"dataProviderInstanceId", Long.class);
+				"dataProviderInstanceId", String.class);
 
 		long dataProviderInstanceId = 0;
 
