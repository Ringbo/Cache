diff --git a/okhttp/src/main/java/okhttp3/internal/http2/Http2Connection.java b/okhttp/src/main/java/okhttp3/internal/http2/Http2Connection.java
index 7b7610d..c304398 100644
--- a/okhttp/src/main/java/okhttp3/internal/http2/Http2Connection.java
+++ b/okhttp/src/main/java/okhttp3/internal/http2/Http2Connection.java
@@ -301,7 +301,7 @@
   }
 
   void writeSynResetLater(final int streamId, final ErrorCode errorCode) {
-    executor.submit(new NamedRunnable("OkHttp %s stream %d", hostname, streamId) {
+    executor.execute(new NamedRunnable("OkHttp %s stream %d", hostname, streamId) {
       @Override public void execute() {
         try {
           writeSynReset(streamId, errorCode);
