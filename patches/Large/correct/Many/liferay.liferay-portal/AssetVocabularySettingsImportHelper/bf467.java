diff --git a/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularySettingsImportHelper.java b/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularySettingsImportHelper.java
index ee68623..4868ca7 100644
--- a/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularySettingsImportHelper.java
+++ b/modules/apps/web-experience/asset/asset-categories-admin-web/src/main/java/com/liferay/asset/categories/admin/web/internal/exportimport/data/handler/AssetVocabularySettingsImportHelper.java
@@ -159,7 +159,7 @@
 		}
 
 		if (_log.isWarnEnabled()) {
-			_log.warn("No class type found for " + className);
+			_log.warn("No class type found for " + classTypeName);
 		}
 
 		return AssetCategoryConstants.ALL_CLASS_TYPE_PK;
