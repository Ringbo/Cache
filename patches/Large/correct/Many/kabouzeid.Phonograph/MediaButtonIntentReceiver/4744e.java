diff --git a/app/src/main/java/com/kabouzeid/gramophone/service/MediaButtonIntentReceiver.java b/app/src/main/java/com/kabouzeid/gramophone/service/MediaButtonIntentReceiver.java
index c844021..51565d0 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/service/MediaButtonIntentReceiver.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/service/MediaButtonIntentReceiver.java
@@ -133,7 +133,7 @@
 
                         // The service may or may not be running, but we need to send it
                         // a command.
-                        if (keycode == KeyEvent.KEYCODE_HEADSETHOOK) {
+                        if (keycode == KeyEvent.KEYCODE_HEADSETHOOK || keycode == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE) {
                             if (eventTime - mLastClickTime >= DOUBLE_CLICK) {
                                 mClickCounter = 0;
                             }
