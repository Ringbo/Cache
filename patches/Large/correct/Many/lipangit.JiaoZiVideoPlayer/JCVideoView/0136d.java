diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoView.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoView.java
index b36dd3e..8a828ed 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoView.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoView.java
@@ -482,7 +482,7 @@
     }
 
     private String stringForTime(int timeMs) {
-        if (timeMs <= 0) {
+        if (timeMs <= 0 || timeMs >= 24 * 60 * 60 * 1000) {
             return "00:00";
         }
         int totalSeconds = timeMs / 1000;
