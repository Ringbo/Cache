diff --git a/src/test/java/org/elasticsearch/search/query/SimpleQueryStringTests.java b/src/test/java/org/elasticsearch/search/query/SimpleQueryStringTests.java
index 4fecc12..2cd0afc 100644
--- a/src/test/java/org/elasticsearch/search/query/SimpleQueryStringTests.java
+++ b/src/test/java/org/elasticsearch/search/query/SimpleQueryStringTests.java
@@ -73,7 +73,7 @@
         assertFirstHit(searchResponse, hasId("4"));
 
         searchResponse = client().prepareSearch().setQuery(
-                simpleQueryString("spaghetti").field("body", 10.0f).field("otherbody", 2.0f).queryName("myquery")).get();
+                simpleQueryString("spaghetti").field("body", 1000.0f).field("otherbody", 2.0f).queryName("myquery")).get();
         assertHitCount(searchResponse, 2l);
         assertFirstHit(searchResponse, hasId("5"));
         assertSearchHits(searchResponse, "5", "6");
