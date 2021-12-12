diff --git a/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java b/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
index 5fcb430..6b631be 100644
--- a/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
+++ b/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
@@ -113,7 +113,7 @@
     public static void saveProgress(Context context, Object url, int progress) {
         if (!JZVideoPlayer.SAVE_PROGRESS) return;
         Log.i(TAG, "saveProgress: " + progress);
-        if (progress < 6000) {
+        if (progress < 5000) {
             progress = 0;
         }
         SharedPreferences spn = context.getSharedPreferences("JZVD_PROGRESS",
@@ -123,12 +123,12 @@
         editor.apply();
     }
 
-    public static int getSavedProgress(Context context, String url) {
+    public static int getSavedProgress(Context context, Object url) {
         if (!JZVideoPlayer.SAVE_PROGRESS) return 0;
         SharedPreferences spn;
         spn = context.getSharedPreferences("JZVD_PROGRESS",
                 Context.MODE_PRIVATE);
-        return spn.getInt(url, 0);
+        return spn.getInt(url.toString(), 0);
     }
 
     /**
