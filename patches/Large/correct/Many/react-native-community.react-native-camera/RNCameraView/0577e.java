diff --git a/android/src/main/java/org/reactnative/camera/RNCameraView.java b/android/src/main/java/org/reactnative/camera/RNCameraView.java
index 96c79de..02c997a 100644
--- a/android/src/main/java/org/reactnative/camera/RNCameraView.java
+++ b/android/src/main/java/org/reactnative/camera/RNCameraView.java
@@ -92,10 +92,10 @@
         }
         final File cacheDirectory = mPictureTakenDirectories.remove(promise);
         if(Build.VERSION.SDK_INT >= 11/*HONEYCOMB*/) {
-          new ResolveTakenPictureAsyncTask(data, promise, options, cacheDirectory)
+          new ResolveTakenPictureAsyncTask(data, promise, options, cacheDirectory, RNCameraView.this)
                   .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
         } else {
-          new ResolveTakenPictureAsyncTask(data, promise, options, cacheDirectory)
+          new ResolveTakenPictureAsyncTask(data, promise, options, cacheDirectory, RNCameraView.this)
                   .execute();
         }
       }
