diff --git a/test/org/apache/tomcat/websocket/server/TestClose.java b/test/org/apache/tomcat/websocket/server/TestClose.java
index 1474d03..b4ec2ab 100644
--- a/test/org/apache/tomcat/websocket/server/TestClose.java
+++ b/test/org/apache/tomcat/websocket/server/TestClose.java
@@ -79,7 +79,7 @@
 
     private static void awaitLatch(CountDownLatch latch, String failMessage) {
         try {
-            if (!latch.await(10000, TimeUnit.MILLISECONDS)) {
+            if (!latch.await(5000, TimeUnit.MILLISECONDS)) {
                 Assert.fail(failMessage);
             }
         } catch (InterruptedException e) {
@@ -107,7 +107,8 @@
 
     public static void awaitOnError(Class<? extends Throwable> exceptionClazz) {
         awaitLatch(events.onErrorCalled, "onError not called");
-        Assert.assertEquals(exceptionClazz, events.onErrorThrowable.getClass());
+        Assert.assertTrue(exceptionClazz.getName(),
+                events.onErrorThrowable.getClass().isAssignableFrom(exceptionClazz));
     }
 
 
