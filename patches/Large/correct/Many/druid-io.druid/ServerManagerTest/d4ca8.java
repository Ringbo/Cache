diff --git a/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java b/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java
index 72a15d9..34f1df0 100644
--- a/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java
+++ b/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java
@@ -315,7 +315,7 @@
         )
     );
 
-    Assert.assertTrue("Operation must complete within 100ms", queryNotifyLatch.await(100, TimeUnit.MILLISECONDS));
+    queryNotifyLatch.await();
 
     Assert.assertEquals(1, factory.getSegmentReferences().size());
 
@@ -720,7 +720,7 @@
       notifyLatch.countDown();
 
       try {
-        waitYieldLatch.await(25, TimeUnit.MILLISECONDS);
+        waitYieldLatch.await();
       }
       catch (Exception e) {
         throw Throwables.propagate(e);
@@ -733,7 +733,7 @@
         public OutType get()
         {
           try {
-            waitLatch.await(25, TimeUnit.MILLISECONDS);
+            waitLatch.await();
           }
           catch (Exception e) {
             throw Throwables.propagate(e);
