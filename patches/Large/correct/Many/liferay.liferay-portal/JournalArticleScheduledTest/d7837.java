diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleScheduledTest.java b/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleScheduledTest.java
index 7867569..63aeb6f 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleScheduledTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleScheduledTest.java
@@ -132,7 +132,7 @@
 			JournalFolderConstants.DEFAULT_PARENT_FOLDER_ID,
 			JournalArticleConstants.CLASSNAME_ID_DEFAULT, 0, StringPool.BLANK,
 			true, JournalArticleConstants.VERSION_DEFAULT, titleMap,
-			descriptionMap, content, "general", ddmStructure.getStructureKey(),
+			descriptionMap, content, ddmStructure.getStructureKey(),
 			ddmTemplate.getTemplateKey(), null,
 			displayDateCalendar.get(Calendar.MONTH),
 			displayDateCalendar.get(Calendar.DAY_OF_MONTH),
