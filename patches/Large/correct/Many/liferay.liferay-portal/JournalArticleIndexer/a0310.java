diff --git a/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java b/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java
index 64e1113..14621e5 100644
--- a/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java
+++ b/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java
@@ -638,8 +638,7 @@
 		for (JournalArticle curArticle : articles) {
 			if (!curArticle.isIndexable() ||
 				((latestIndexableArticle != null) &&
-				 (curArticle.getResourcePrimKey() ==
-					latestIndexableArticle.getResourcePrimKey()))) {
+				 (curArticle.getId() == latestIndexableArticle.getId()))) {
 
 				continue;
 			}
