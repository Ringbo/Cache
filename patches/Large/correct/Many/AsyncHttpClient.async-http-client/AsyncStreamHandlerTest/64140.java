diff --git a/api/src/test/java/org/asynchttpclient/async/AsyncStreamHandlerTest.java b/api/src/test/java/org/asynchttpclient/async/AsyncStreamHandlerTest.java
index 610f521..b38319e 100644
--- a/api/src/test/java/org/asynchttpclient/async/AsyncStreamHandlerTest.java
+++ b/api/src/test/java/org/asynchttpclient/async/AsyncStreamHandlerTest.java
@@ -347,7 +347,7 @@
             c.prepareGet("http://google.com/").execute(new AsyncHandlerAdapter() {
 
                 public STATE onStatusReceived(HttpResponseStatus status) throws Exception {
-                    assertEquals(301, status.getStatusCode());
+                    assertEquals(302, status.getStatusCode());
                     return STATE.CONTINUE;
                 }
 
