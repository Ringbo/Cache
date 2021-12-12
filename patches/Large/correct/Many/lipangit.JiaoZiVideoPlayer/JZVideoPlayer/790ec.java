diff --git a/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java b/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java
index 107833b..d814f61 100644
--- a/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java
+++ b/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java
@@ -698,7 +698,7 @@
         cancelProgressTimer();
         onStateAutoComplete();
 
-        if (currentScreen == SCREEN_WINDOW_FULLSCREEN) {
+        if (currentScreen == SCREEN_WINDOW_FULLSCREEN || currentScreen == SCREEN_WINDOW_TINY) {
             backPress();
         }
         JZMediaManager.instance().mediaPlayer.release();
