diff --git a/server/src/test/java/io/druid/client/client/BatchServerInventoryViewTest.java b/server/src/test/java/io/druid/client/client/BatchServerInventoryViewTest.java
index 3886482..a777222 100644
--- a/server/src/test/java/io/druid/client/client/BatchServerInventoryViewTest.java
+++ b/server/src/test/java/io/druid/client/client/BatchServerInventoryViewTest.java
@@ -198,7 +198,8 @@
   private void waitForSync() throws Exception
   {
     Stopwatch stopwatch = new Stopwatch().start();
-    while (Iterables.get(batchServerInventoryView.getInventory(), 0).getSegments().size() != testSegments.size()) {
+    while (!Iterables.isEmpty(batchServerInventoryView.getInventory())
+           && Iterables.get(batchServerInventoryView.getInventory(), 0).getSegments().size() != testSegments.size()) {
       Thread.sleep(500);
       if (stopwatch.elapsed(TimeUnit.MILLISECONDS) > 5000) {
         throw new ISE("BatchServerInventoryView is not updating");
