diff --git a/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java b/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java
index 474b7fb..9dc5457 100644
--- a/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java
+++ b/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java
@@ -446,7 +446,7 @@
                     } finally {
                         instream.close();
                     }
-                    responseBody = buffer.buffer();
+                    responseBody = buffer.toByteArray();
                 } catch (OutOfMemoryError e) {
                     System.gc();
                     throw new IOException("File too large to fit into available memory");
