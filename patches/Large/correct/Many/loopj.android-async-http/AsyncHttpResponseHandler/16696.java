diff --git a/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java b/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java
index 9b08432..8cbddb2 100644
--- a/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java
+++ b/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java
@@ -376,7 +376,7 @@
                 if (contentLength > Integer.MAX_VALUE) {
                     throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                 }
-                int buffersize = (contentLength < 0) ? BUFFER_SIZE : (int) contentLength;
+                int buffersize = (contentLength <= 0) ? BUFFER_SIZE : (int) contentLength;
                 try {
                     ByteArrayBuffer buffer = new ByteArrayBuffer(buffersize);
                     try {
@@ -386,7 +386,7 @@
                         while ((l = instream.read(tmp)) != -1 && !Thread.currentThread().isInterrupted()) {
                             count += l;
                             buffer.append(tmp, 0, l);
-                            sendProgressMessage(count, (int) contentLength);
+                            sendProgressMessage(count, (int) (contentLength <= 0 ? 1 : contentLength));
                         }
                     } finally {
                         AsyncHttpClient.silentCloseInputStream(instream);
