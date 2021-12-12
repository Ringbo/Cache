diff --git a/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java b/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java
index cecbdb8..5095fd3 100644
--- a/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java
+++ b/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java
@@ -2503,7 +2503,7 @@
 
   private void reusedConnectionFailsWithPost(TransferKind transferKind, int requestSize)
       throws Exception {
-    server.enqueue(new MockResponse().setBody("A").setSocketPolicy(SHUTDOWN_INPUT_AT_END));
+    server.enqueue(new MockResponse().setBody("A").setSocketPolicy(DISCONNECT_AT_END));
     server.enqueue(new MockResponse().setBody("B"));
     server.enqueue(new MockResponse().setBody("C"));
     server.play();
