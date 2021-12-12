diff --git a/portal-impl/src/com/liferay/portlet/journal/service/persistence/JournalArticleFinderImpl.java b/portal-impl/src/com/liferay/portlet/journal/service/persistence/JournalArticleFinderImpl.java
index d8aa6c5..966033a 100644
--- a/portal-impl/src/com/liferay/portlet/journal/service/persistence/JournalArticleFinderImpl.java
+++ b/portal-impl/src/com/liferay/portlet/journal/service/persistence/JournalArticleFinderImpl.java
@@ -730,7 +730,8 @@
 		try {
 			session = openSession();
 
-			String sql = CustomSQLUtil.get(COUNT_BY_G_F, queryDefinition);
+			String sql = CustomSQLUtil.get(
+				COUNT_BY_G_F, queryDefinition, "JournalArticle");
 
 			if (inlineSQLHelper) {
 				sql = InlineSQLHelperUtil.replacePermissionCheck(
