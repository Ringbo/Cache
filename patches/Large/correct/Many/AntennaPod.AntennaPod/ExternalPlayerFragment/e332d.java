diff --git a/app/src/main/java/de/danoeh/antennapod/fragment/ExternalPlayerFragment.java b/app/src/main/java/de/danoeh/antennapod/fragment/ExternalPlayerFragment.java
index fdb128f..1679051 100644
--- a/app/src/main/java/de/danoeh/antennapod/fragment/ExternalPlayerFragment.java
+++ b/app/src/main/java/de/danoeh/antennapod/fragment/ExternalPlayerFragment.java
@@ -55,7 +55,7 @@
             public void onClick(View v) {
                 Log.d(TAG, "layoutInfo was clicked");
 
-                if (controller.getMedia() != null) {
+                if (controller != null && controller.getMedia() != null) {
                     startActivity(PlaybackService.getPlayerActivityIntent(
                             getActivity(), controller.getMedia()));
                 }
@@ -192,7 +192,7 @@
 
     private boolean loadMediaInfo() {
         Log.d(TAG, "Loading media info");
-        if (controller.serviceAvailable()) {
+        if (controller != null && controller.serviceAvailable()) {
             Playable media = controller.getMedia();
             if (media != null) {
                 txtvTitle.setText(media.getEpisodeTitle());
