diff --git a/app/src/main/java/de/danoeh/antennapod/adapter/DefaultActionButtonCallback.java b/app/src/main/java/de/danoeh/antennapod/adapter/DefaultActionButtonCallback.java
index 54afde1..d8f324e 100644
--- a/app/src/main/java/de/danoeh/antennapod/adapter/DefaultActionButtonCallback.java
+++ b/app/src/main/java/de/danoeh/antennapod/adapter/DefaultActionButtonCallback.java
@@ -83,13 +83,13 @@
             } else { // media is downloaded
                 if (media.isCurrentlyPlaying()) {
                     new PlaybackServiceStarter(context, media)
-                            .startWhenPrepared(false)
+                            .startWhenPrepared(true)
                             .shouldStream(false)
                             .start();
                     context.sendBroadcast(new Intent(PlaybackService.ACTION_PAUSE_PLAY_CURRENT_EPISODE));
                 } else if (media.isCurrentlyPaused()) {
                     new PlaybackServiceStarter(context, media)
-                            .startWhenPrepared(false)
+                            .startWhenPrepared(true)
                             .shouldStream(false)
                             .start();
                     context.sendBroadcast(new Intent(PlaybackService.ACTION_RESUME_PLAY_CURRENT_EPISODE));
