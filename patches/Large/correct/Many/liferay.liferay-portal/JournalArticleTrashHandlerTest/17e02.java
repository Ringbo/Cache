diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/trash/JournalArticleTrashHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/journal/trash/JournalArticleTrashHandlerTest.java
index 4db8c63..57eefe4 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/trash/JournalArticleTrashHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/trash/JournalArticleTrashHandlerTest.java
@@ -227,7 +227,7 @@
 
 		return JournalTestUtil.updateArticle(
 			article, "Content: Enterprise. Open Source. For Life.",
-			article.getContent());
+			article.getContent(), serviceContext);
 	}
 
 	private static final int _FOLDER_NAME_MAX_LENGTH = 100;
