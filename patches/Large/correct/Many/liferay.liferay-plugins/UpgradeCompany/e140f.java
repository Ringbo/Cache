diff --git a/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java b/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java
index df00a60..ac20efe 100644
--- a/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java
+++ b/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java
@@ -230,7 +230,7 @@
 
 		JournalArticle journalArticle =
 			JournalArticleLocalServiceUtil.addArticle(
-				userId, groupId, 0, 0, StringPool.BLANK, true,
+				userId, groupId, 0, 0, 0, StringPool.BLANK, true,
 				JournalArticleConstants.VERSION_DEFAULT, titleMap, null,
 				content, "general", structureId, templateId, StringPool.BLANK,
 				1, 1, 2008, 0, 0, 0, 0, 0, 0, 0, true, 0, 0, 0, 0, 0, true,
