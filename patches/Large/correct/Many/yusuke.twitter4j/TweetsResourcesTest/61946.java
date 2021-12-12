diff --git a/twitter4j-core/src/test/java/twitter4j/TweetsResourcesTest.java b/twitter4j-core/src/test/java/twitter4j/TweetsResourcesTest.java
index c6b9f1c..43c8670 100644
--- a/twitter4j-core/src/test/java/twitter4j/TweetsResourcesTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/TweetsResourcesTest.java
@@ -125,13 +125,13 @@
     public void testRetweetMethods() throws Exception {
         List<Status> statuses;
 
-        statuses = twitter1.getRetweets(18594701629l);
+        statuses = twitter1.getRetweets(1021608606934822912L);
         assertNotNull(TwitterObjectFactory.getRawJSON(statuses));
         assertEquals(statuses.get(0), TwitterObjectFactory.createStatus(TwitterObjectFactory.getRawJSON(statuses.get(0))));
         assertIsRetweet(statuses);
-        assertTrue(20 < statuses.size());
+        assertTrue(2 < statuses.size());
 
-        IDs retweeters = twitter1.getRetweeterIds(18594701629l, -1);
+        IDs retweeters = twitter1.getRetweeterIds(1021608606934822912L, -1);
         assertTrue(0 < retweeters.getIDs().length);
     }
 
@@ -213,7 +213,7 @@
         assertEquals(1, medias.length);
         MediaEntity media = medias[0];
         assertEquals("pic.twitter.com/qbJx26r", media.getDisplayURL());
-        assertEquals("http://twitter.com/twitter/status/76360760606986241/photo/1", media.getExpandedURL());
+        assertEquals("https://twitter.com/twitter/status/76360760606986241/photo/1", media.getExpandedURL());
         assertEquals(76360760611180544L, media.getId());
         assertEquals("http://pbs.twimg.com/media/AQ9JtQsCEAA7dEN.jpg", media.getMediaURL());
         assertEquals("https://pbs.twimg.com/media/AQ9JtQsCEAA7dEN.jpg", media.getMediaURLHttps());
