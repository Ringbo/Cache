diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
index 1d54f65..36df1d8 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
@@ -300,7 +300,7 @@
         int i = v.getId();
         if (i == R.id.start) {
             Log.i(TAG, "onClick start [" + this.hashCode() + "] ");
-            if (TextUtils.isEmpty(JCUtils.getCurrentUrlFromMap(urlMap, currentUrlMapIndex))) {
+            if (urlMap == null || TextUtils.isEmpty(JCUtils.getCurrentUrlFromMap(urlMap, currentUrlMapIndex))) {
                 Toast.makeText(getContext(), getResources().getString(R.string.no_url), Toast.LENGTH_SHORT).show();
                 return;
             }
