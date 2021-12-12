diff --git a/library/src/com/bumptech/glide/resize/request/BitmapRequest.java b/library/src/com/bumptech/glide/resize/request/BitmapRequest.java
index abef0d1..6716e18 100644
--- a/library/src/com/bumptech/glide/resize/request/BitmapRequest.java
+++ b/library/src/com/bumptech/glide/resize/request/BitmapRequest.java
@@ -168,7 +168,7 @@
             if (model != null && Log.isLoggable(TAG, Log.INFO)) {
                 Log.i(TAG, "Got null load task for model=" + model);
             }
-            setErrorPlaceholder();
+            onLoadFailed(null);
             return;
         }
 
