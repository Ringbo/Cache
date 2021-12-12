diff --git a/src/test/java/org/elasticsearch/search/aggregations/bucket/ChildrenTests.java b/src/test/java/org/elasticsearch/search/aggregations/bucket/ChildrenTests.java
index ff873e2..4b9b79b 100644
--- a/src/test/java/org/elasticsearch/search/aggregations/bucket/ChildrenTests.java
+++ b/src/test/java/org/elasticsearch/search/aggregations/bucket/ChildrenTests.java
@@ -48,7 +48,7 @@
     public void setupSuiteScopeCluster() throws Exception {
         assertAcked(
                 prepareCreate("test")
-                    .addMapping("article")
+                    .addMapping("article", "_id", "index=not_analyzed")
                     .addMapping("comment", "_parent", "type=article", "_id", "index=not_analyzed")
         );
 
