diff --git a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
index a52b44c..93bc0f7 100644
--- a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
+++ b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
@@ -308,7 +308,7 @@
                             public void run() {
                                 if (ret.isCancelled() || ret.isDone())
                                     return;
-                                progressHandler.onProgress(downloaded, total);
+                                uploadProgressHandler.onProgress(downloaded, total);
                             }
                         });
                     }
