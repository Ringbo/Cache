diff --git a/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java b/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java
index 73ce9ad..64e1113 100644
--- a/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java
+++ b/portal-impl/src/com/liferay/portlet/journal/util/JournalArticleIndexer.java
@@ -638,8 +638,8 @@
 		for (JournalArticle curArticle : articles) {
 			if (!curArticle.isIndexable() ||
 				((latestIndexableArticle != null) &&
-				 (curArticle.getArticleId() ==
-					latestIndexableArticle.getArticleId()))) {
+				 (curArticle.getResourcePrimKey() ==
+					latestIndexableArticle.getResourcePrimKey()))) {
 
 				continue;
 			}
