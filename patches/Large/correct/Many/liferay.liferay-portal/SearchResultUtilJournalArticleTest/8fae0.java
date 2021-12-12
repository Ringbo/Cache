diff --git a/modules/apps/journal/journal-test/test/unit/com/liferay/journal/search/SearchResultUtilJournalArticleTest.java b/modules/apps/journal/journal-test/test/unit/com/liferay/journal/search/SearchResultUtilJournalArticleTest.java
index 1a16b99..9d195e4 100644
--- a/modules/apps/journal/journal-test/test/unit/com/liferay/journal/search/SearchResultUtilJournalArticleTest.java
+++ b/modules/apps/journal/journal-test/test/unit/com/liferay/journal/search/SearchResultUtilJournalArticleTest.java
@@ -102,7 +102,7 @@
 		Assert.assertEquals(_DOCUMENT_VERSION, versions.get(0));
 		Assert.assertEquals(1, versions.size());
 
-		assertEmptyCommentRelatedResults(searchResult);
+		assertEmptyCommentRelatedSearchResults(searchResult);
 		assertEmptyFileEntryRelatedSearchResults(searchResult);
 	}
 
