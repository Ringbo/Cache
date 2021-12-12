diff --git a/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java b/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java
index 16fe0f6..6a45924 100644
--- a/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java
+++ b/okhttp-tests/src/test/java/com/squareup/okhttp/internal/http/URLConnectionTest.java
@@ -2506,7 +2506,7 @@
 
   private void reusedConnectionFailsWithPost(TransferKind transferKind, int requestSize)
       throws Exception {
-    server.enqueue(new MockResponse().setBody("A").setSocketPolicy(SHUTDOWN_INPUT_AT_END));
+    server.enqueue(new MockResponse().setBody("A").setSocketPolicy(DISCONNECT_AT_END));
     server.enqueue(new MockResponse().setBody("B"));
     server.enqueue(new MockResponse().setBody("C"));
     server.play();
