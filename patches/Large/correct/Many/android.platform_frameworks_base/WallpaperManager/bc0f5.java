diff --git a/core/java/android/app/WallpaperManager.java b/core/java/android/app/WallpaperManager.java
index c40fe69..dbe080b 100644
--- a/core/java/android/app/WallpaperManager.java
+++ b/core/java/android/app/WallpaperManager.java
@@ -67,7 +67,7 @@
         Globals(Looper looper) {
             IBinder b = ServiceManager.getService(Context.WALLPAPER_SERVICE);
             mService = IWallpaperManager.Stub.asInterface(b);
-            mHandler = new Handler() {
+            mHandler = new Handler(looper) {
                 @Override
                 public void handleMessage(Message msg) {
                     switch (msg.what) {
