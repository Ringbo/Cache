diff --git a/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java b/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
index 99b0dc5..00486fa 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
@@ -644,7 +644,7 @@
     public void resumePlaying() {
         if (!isPlaying()) {
             if (requestFocus()) {
-                if (isPlayerPrepared) {
+                if (isPlayerPrepared()) {
                     player.start();
                     playingNotificationHelper.updatePlayState(isPlaying());
                     MusicPlayerWidget.updateWidgetsPlayState(this, isPlaying());
@@ -669,7 +669,7 @@
 
     public void back(boolean force) {
         if (position != -1) {
-            if (getSongProgressMillis() > 2000) {
+            if (isPlayerPrepared() && getSongProgressMillis() > 2000) {
                 seekTo(0);
             } else {
                 playPreviousSong(force);
