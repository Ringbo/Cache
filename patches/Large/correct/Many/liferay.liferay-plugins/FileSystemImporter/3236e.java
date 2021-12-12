diff --git a/webs/resources-importer-web/docroot/WEB-INF/src/com/liferay/resourcesimporter/util/FileSystemImporter.java b/webs/resources-importer-web/docroot/WEB-INF/src/com/liferay/resourcesimporter/util/FileSystemImporter.java
index 79136d2..ffbef25 100644
--- a/webs/resources-importer-web/docroot/WEB-INF/src/com/liferay/resourcesimporter/util/FileSystemImporter.java
+++ b/webs/resources-importer-web/docroot/WEB-INF/src/com/liferay/resourcesimporter/util/FileSystemImporter.java
@@ -863,7 +863,7 @@
 					userId, groupId, 0, 0, 0, journalArticleId, false,
 					JournalArticleConstants.VERSION_DEFAULT,
 					getMap(articleDefaultLocale, title), descriptionMap,
-					content, "general", ddmStructureKey, ddmTemplateKey,
+					content, ddmStructureKey, ddmTemplateKey,
 					StringPool.BLANK, 1, 1, 2010, 0, 0, 0, 0, 0, 0, 0, true, 0,
 					0, 0, 0, 0, true, indexable, smallImage, smallImageURL,
 					null, new HashMap<String, byte[]>(), StringPool.BLANK,
@@ -875,7 +875,7 @@
 						userId, groupId, 0, journalArticleId,
 						journalArticle.getVersion(),
 						getMap(articleDefaultLocale, title), descriptionMap,
-						content, "general", ddmStructureKey, ddmTemplateKey,
+						content, ddmStructureKey, ddmTemplateKey,
 						StringPool.BLANK, 1, 1, 2010, 0, 0, 0, 0, 0, 0, 0, true,
 						0, 0, 0, 0, 0, true, indexable, smallImage,
 						smallImageURL, null, new HashMap<String, byte[]>(),
