diff --git a/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java b/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
index e06cfba..5fcb430 100644
--- a/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
+++ b/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
@@ -110,7 +110,7 @@
         return (int) (dpValue * scale + 0.5f);
     }
 
-    public static void saveProgress(Context context, String url, int progress) {
+    public static void saveProgress(Context context, Object url, int progress) {
         if (!JZVideoPlayer.SAVE_PROGRESS) return;
         Log.i(TAG, "saveProgress: " + progress);
         if (progress < 6000) {
@@ -119,7 +119,7 @@
         SharedPreferences spn = context.getSharedPreferences("JZVD_PROGRESS",
                 Context.MODE_PRIVATE);
         SharedPreferences.Editor editor = spn.edit();
-        editor.putInt(url, progress);
+        editor.putInt(url.toString(), progress);
         editor.apply();
     }
 
