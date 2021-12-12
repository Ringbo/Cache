diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
index 95b58ae..bc94091 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
@@ -165,7 +165,8 @@
                 return;
             }
             if (currentState == CURRENT_STATE_NORMAL || currentState == CURRENT_STATE_ERROR) {
-                if (!url.startsWith("file") && !JCUtils.isWifiConnected(getContext()) && !WIFI_TIP_DIALOG_SHOWED) {
+                if (!url.startsWith("file") && !url.startsWith("/") &&
+                        !JCUtils.isWifiConnected(getContext()) && !WIFI_TIP_DIALOG_SHOWED) {
                     showWifiDialog(JCUserActionStandard.ON_CLICK_START_ICON);
                     return;
                 }
