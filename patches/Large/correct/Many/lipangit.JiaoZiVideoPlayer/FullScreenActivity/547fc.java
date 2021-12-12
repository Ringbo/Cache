diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/FullScreenActivity.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/FullScreenActivity.java
index cb8e1e1..cd38e81 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/FullScreenActivity.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/FullScreenActivity.java
@@ -29,7 +29,7 @@
         context.startActivity(intent);
     }
 
-    public static void toActivity(Context context, String url, String thumb, String title) {
+    static void toActivity(Context context, String url, String thumb, String title) {
         STATE = JCVideoPlayer.CURRENT_STATE_NORMAL;
         URL = url;
         THUMB = thumb;
