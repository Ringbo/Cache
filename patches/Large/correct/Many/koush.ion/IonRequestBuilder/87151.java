diff --git a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
index a3af95a..6902666 100644
--- a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
+++ b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
@@ -286,7 +286,7 @@
                         request.getHandler().post(new Runnable() {
                             @Override
                             public void run() {
-                                if (isCancelled())
+                                if (isCancelled() || isDone())
                                     return;
                                 progressHandler.onProgress(totalBytesRead, total);
                             }
