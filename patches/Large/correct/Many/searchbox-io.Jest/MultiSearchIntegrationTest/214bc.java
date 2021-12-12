diff --git a/jest/src/test/java/io/searchbox/core/MultiSearchIntegrationTest.java b/jest/src/test/java/io/searchbox/core/MultiSearchIntegrationTest.java
index a68cce9..16a0946 100644
--- a/jest/src/test/java/io/searchbox/core/MultiSearchIntegrationTest.java
+++ b/jest/src/test/java/io/searchbox/core/MultiSearchIntegrationTest.java
@@ -42,7 +42,7 @@
         SearchResult complexSearchResult = complexSearchResponse.searchResult;
         assertTrue(complexSearchResult.isSucceeded());
         assertNull(complexSearchResult.getErrorMessage());
-        assertEquals(Integer.valueOf(2), complexSearchResult.getTotal());
+        assertEquals(Long.valueOf(2), complexSearchResult.getTotal());
         List<SearchResult.Hit<Comment, Void>> complexSearchHits = complexSearchResult.getHits(Comment.class);
         assertEquals(2, complexSearchHits.size());
 
@@ -52,7 +52,7 @@
         SearchResult simpleSearchResult = simpleSearchResponse.searchResult;
         assertTrue(simpleSearchResult.isSucceeded());
         assertNull(simpleSearchResult.getErrorMessage());
-        assertEquals(Integer.valueOf(3), simpleSearchResult.getTotal());
+        assertEquals(Long.valueOf(3), simpleSearchResult.getTotal());
         List<SearchResult.Hit<Comment, Void>> simpleSearchHits = simpleSearchResult.getHits(Comment.class);
         assertEquals(3, simpleSearchHits.size());
     }
