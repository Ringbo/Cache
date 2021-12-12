diff --git a/portal-impl/src/com/liferay/portlet/journal/service/persistence/impl/JournalArticleFinderImpl.java b/portal-impl/src/com/liferay/portlet/journal/service/persistence/impl/JournalArticleFinderImpl.java
index fe82e79..da52057 100644
--- a/portal-impl/src/com/liferay/portlet/journal/service/persistence/impl/JournalArticleFinderImpl.java
+++ b/portal-impl/src/com/liferay/portlet/journal/service/persistence/impl/JournalArticleFinderImpl.java
@@ -1362,7 +1362,7 @@
 
 			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);
 			sql = CustomSQLUtil.replaceOrderBy(
-				sql, queryDefinition.getOrderByComparator());
+				sql, queryDefinition.getOrderByComparator("JournalArticle"));
 
 			if (inlineSQLHelper) {
 				sql = InlineSQLHelperUtil.replacePermissionCheck(
