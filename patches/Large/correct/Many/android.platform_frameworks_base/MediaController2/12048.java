diff --git a/media/java/android/media/MediaController2.java b/media/java/android/media/MediaController2.java
index 6cf2be6..e9ffe60 100644
--- a/media/java/android/media/MediaController2.java
+++ b/media/java/android/media/MediaController2.java
@@ -424,7 +424,7 @@
      * @param extras Optional extras that can include extra information about the media item
      *               to be played.
      */
-    public void playFromUri(@NonNull String uri, @Nullable Bundle extras) {
+    public void playFromUri(@NonNull Uri uri, @Nullable Bundle extras) {
         mProvider.playFromUri_impl(uri, extras);
     }
 
