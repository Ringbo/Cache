diff --git a/actor-sdk/sdk-core/runtime/runtime-se/src/main/java/im/actor/runtime/se/JavaSeHttpProvider.java b/actor-sdk/sdk-core/runtime/runtime-se/src/main/java/im/actor/runtime/se/JavaSeHttpProvider.java
index 1041ea9..2695a5f 100644
--- a/actor-sdk/sdk-core/runtime/runtime-se/src/main/java/im/actor/runtime/se/JavaSeHttpProvider.java
+++ b/actor-sdk/sdk-core/runtime/runtime-se/src/main/java/im/actor/runtime/se/JavaSeHttpProvider.java
@@ -38,7 +38,7 @@
             public void onFailure(Request request, IOException e) {
                 Log.d(TAG, "Downloading part error: " + request.toString());
                 e.printStackTrace();
-                callback.onDownloadFailure();
+                callback.onDownloadFailure(0, 0);
             }
 
             @Override
@@ -47,7 +47,7 @@
                 if (response.code() == 206) {
                     callback.onDownloaded(response.body().bytes());
                 } else {
-                    callback.onDownloadFailure();
+                    callback.onDownloadFailure(0, 0);
                 }
             }
         });
@@ -65,7 +65,7 @@
             public void onFailure(Request request, IOException e) {
                 Log.d(TAG, "Uploading part error: " + request.toString());
                 e.printStackTrace();
-                callback.onUploadFailure();
+                callback.onUploadFailure(0, 0);
             }
 
             @Override
@@ -74,7 +74,7 @@
                 if (response.code() == 200) {
                     callback.onUploaded();
                 } else {
-                    callback.onUploadFailure();
+                    callback.onUploadFailure(0, 0);
                 }
             }
         });
