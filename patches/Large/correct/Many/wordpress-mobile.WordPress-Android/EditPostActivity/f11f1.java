diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
index 56dd401..acc6987 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
@@ -1885,7 +1885,7 @@
                 }
             }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mediaUri);
         } else {
-            queueFileForUpload(mediaUri, getContentResolver().getType(mediaUri));
+            addMedia(mediaUri);
         }
     }
 
