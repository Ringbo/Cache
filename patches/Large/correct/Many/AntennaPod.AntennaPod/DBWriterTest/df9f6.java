diff --git a/src/instrumentationTest/de/test/antennapod/storage/DBWriterTest.java b/src/instrumentationTest/de/test/antennapod/storage/DBWriterTest.java
index 0483a30..429903c 100644
--- a/src/instrumentationTest/de/test/antennapod/storage/DBWriterTest.java
+++ b/src/instrumentationTest/de/test/antennapod/storage/DBWriterTest.java
@@ -708,7 +708,7 @@
         }
     }
 
-    public void testMarkAllItemsReadSameFeed() {
+    public void testMarkAllItemsReadSameFeed() throws InterruptedException, ExecutionException, TimeoutException {
         final Context context = getInstrumentation().getTargetContext();
         final int NUM_ITEMS = 10;
         Feed feed = new Feed("url", new Date(), "title");
@@ -728,7 +728,7 @@
             assertTrue(item.getId() != 0);
         }
 
-        DBWriter.markAllItemsRead(context);
+        DBWriter.markAllItemsRead(context).get(TIMEOUT, TimeUnit.SECONDS);
         List<FeedItem> loadedItems = DBReader.getFeedItemList(context, feed);
         for (FeedItem item : loadedItems) {
             assertTrue(item.isRead());
