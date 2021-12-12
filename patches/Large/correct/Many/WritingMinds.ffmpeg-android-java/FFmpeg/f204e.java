diff --git a/FFmpegAndroid/src/main/java/com/github/hiteshsondhi88/libffmpeg/FFmpeg.java b/FFmpegAndroid/src/main/java/com/github/hiteshsondhi88/libffmpeg/FFmpeg.java
index 08a73ee..601f8c1 100644
--- a/FFmpegAndroid/src/main/java/com/github/hiteshsondhi88/libffmpeg/FFmpeg.java
+++ b/FFmpegAndroid/src/main/java/com/github/hiteshsondhi88/libffmpeg/FFmpeg.java
@@ -97,12 +97,12 @@
 
     @Override
     public boolean isFFmpegCommandRunning() {
-        return ffmpegExecuteAsyncTask != null && ffmpegExecuteAsyncTask.isProcessCompleted();
+        return ffmpegExecuteAsyncTask != null && !ffmpegExecuteAsyncTask.isProcessCompleted();
     }
 
     @Override
     public boolean killRunningProcesses() {
-        return Util.killAsync(ffmpegLoadLibraryAsyncTask) && Util.killAsync(ffmpegExecuteAsyncTask);
+        return Util.killAsync(ffmpegLoadLibraryAsyncTask) || Util.killAsync(ffmpegExecuteAsyncTask);
     }
 
     @Override
