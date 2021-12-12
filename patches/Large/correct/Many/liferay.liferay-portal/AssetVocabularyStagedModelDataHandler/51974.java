diff --git a/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularyStagedModelDataHandler.java b/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularyStagedModelDataHandler.java
index e6631db..b67965d 100644
--- a/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularyStagedModelDataHandler.java
+++ b/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularyStagedModelDataHandler.java
@@ -120,7 +120,7 @@
 			PortletDataContext portletDataContext, AssetVocabulary vocabulary)
 		throws Exception {
 
-		Locale locale = PortalUtil.getSiteDefaultLocale(
+		Locale locale = _portal.getSiteDefaultLocale(
 			portletDataContext.getScopeGroupId());
 
 		Element vocabularyElement = portletDataContext.getExportDataElement(
@@ -263,7 +263,7 @@
 		long[] groupIds =
 			new long[] {portletDataContext.getCompanyGroupId(), groupId};
 
-		Locale locale = PortalUtil.getSiteDefaultLocale(groupId);
+		Locale locale = _portal.getSiteDefaultLocale(groupId);
 
 		AssetVocabularySettingsImportHelper
 			assetVocabularySettingsImportHelper =
