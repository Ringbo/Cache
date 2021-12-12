diff --git a/api/src/test/java/org/asynchttpclient/ws/CloseCodeReasonMessageTest.java b/api/src/test/java/org/asynchttpclient/ws/CloseCodeReasonMessageTest.java
index 9792329..182c778 100644
--- a/api/src/test/java/org/asynchttpclient/ws/CloseCodeReasonMessageTest.java
+++ b/api/src/test/java/org/asynchttpclient/ws/CloseCodeReasonMessageTest.java
@@ -162,7 +162,7 @@
         }
     }
 
-    @Test(timeOut = 60000, expectedExceptions = { IllegalArgumentException.class } )
+    @Test(timeOut = 60000, expectedExceptions = { IllegalStateException.class } )
     public void wrongProtocolCode() throws Throwable {
         try (AsyncHttpClient c = getAsyncHttpClient(null)) {
             final CountDownLatch latch = new CountDownLatch(1);
