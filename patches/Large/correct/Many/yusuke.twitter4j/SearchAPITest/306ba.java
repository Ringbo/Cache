diff --git a/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java b/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java
index 27958a0..677c67e 100644
--- a/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java
+++ b/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java
@@ -65,7 +65,7 @@
     public void testSearch() throws Exception {
         String queryStr = "test";
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
-        String dateStr = format.format(new java.util.Date());
+        String dateStr = format.format(new java.util.Date(System.currentTimeMillis() - 24 * 3600 * 1000));
         Query query = new Query(queryStr).until(dateStr);
         QueryResult queryResult = unauthenticated.search(query);
         assertTrue("sinceId", -1 != queryResult.getSinceId());
