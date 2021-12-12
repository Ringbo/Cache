diff --git a/twitter4j-core/src/test/java/twitter4j/FavoriteMethodsTest.java b/twitter4j-core/src/test/java/twitter4j/FavoriteMethodsTest.java
index 51787f4..17a06ec 100644
--- a/twitter4j-core/src/test/java/twitter4j/FavoriteMethodsTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/FavoriteMethodsTest.java
@@ -35,7 +35,7 @@
     }
 
     public void testFavoriteMethods() throws Exception {
-        Status status = twitter1.getHomeTimeline(new Paging().count(1)).get(0);
+        Status status = twitter1.getPublicTimeline().get(0);
         assertNotNull(DataObjectFactory.getRawJSON(status));
         assertEquals(status, DataObjectFactory.createStatus(DataObjectFactory.getRawJSON(status)));
         status = twitter2.createFavorite(status.getId());
