diff --git a/media/java/android/media/MediaSession2.java b/media/java/android/media/MediaSession2.java
index ae2649a..943b827 100644
--- a/media/java/android/media/MediaSession2.java
+++ b/media/java/android/media/MediaSession2.java
@@ -502,7 +502,7 @@
 
         /**
          * Called when a controller requested to play a specific media item represented by a URI
-         * through {@link MediaController2#playFromUri(String, Bundle)}
+         * through {@link MediaController2#playFromUri(Uri, Bundle)}
          *
          * @param controller controller information
          * @param uri uri
@@ -510,7 +510,7 @@
          * @see #COMMAND_CODE_PLAY_FROM_URI
          */
         public void onPlayFromUri(@NonNull ControllerInfo controller,
-                @NonNull String uri, @Nullable Bundle extras) { }
+                @NonNull Uri uri, @Nullable Bundle extras) { }
 
         /**
          * Called when a controller requested to prepare for playing a specific mediaId through
