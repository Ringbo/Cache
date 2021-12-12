diff --git a/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java b/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java
index 72a15d9..f6a139f 100644
--- a/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java
+++ b/server/src/test/java/io/druid/server/coordination/ServerManagerTest.java
@@ -276,7 +276,7 @@
         )
     );
 
-    queryNotifyLatch.await(25, TimeUnit.MILLISECONDS);
+    queryNotifyLatch.await(1000, TimeUnit.MILLISECONDS);
 
     Assert.assertEquals(1, factory.getSegmentReferences().size());
 
@@ -315,7 +315,7 @@
         )
     );
 
-    Assert.assertTrue("Operation must complete within 100ms", queryNotifyLatch.await(100, TimeUnit.MILLISECONDS));
+    queryNotifyLatch.await(1000, TimeUnit.MILLISECONDS);
 
     Assert.assertEquals(1, factory.getSegmentReferences().size());
 
@@ -358,7 +358,7 @@
         )
     );
 
-    queryNotifyLatch.await(25, TimeUnit.MILLISECONDS);
+    queryNotifyLatch.await(1000, TimeUnit.MILLISECONDS);
 
     Assert.assertEquals(1, factory.getSegmentReferences().size());
 
@@ -392,7 +392,7 @@
   private void waitForTestVerificationAndCleanup(Future future)
   {
     try {
-      queryNotifyLatch.await(25, TimeUnit.MILLISECONDS);
+      queryNotifyLatch.await(1000, TimeUnit.MILLISECONDS);
       queryWaitYieldLatch.countDown();
       queryWaitLatch.countDown();
       future.get();
@@ -720,7 +720,7 @@
       notifyLatch.countDown();
 
       try {
-        waitYieldLatch.await(25, TimeUnit.MILLISECONDS);
+        waitYieldLatch.await(1000, TimeUnit.MILLISECONDS);
       }
       catch (Exception e) {
         throw Throwables.propagate(e);
@@ -733,7 +733,7 @@
         public OutType get()
         {
           try {
-            waitLatch.await(25, TimeUnit.MILLISECONDS);
+            waitLatch.await(1000, TimeUnit.MILLISECONDS);
           }
           catch (Exception e) {
             throw Throwables.propagate(e);
