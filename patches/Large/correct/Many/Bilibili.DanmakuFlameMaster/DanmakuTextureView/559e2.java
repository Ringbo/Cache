diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
index a4e7ff2..d2dee1d 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
@@ -63,7 +63,7 @@
 
     private boolean mShowFps;
 
-    private boolean mDanmakuVisibile = true;
+    private boolean mDanmakuVisible = true;
     
     protected int mDrawingThreadType = THREAD_TYPE_NORMAL_PRIORITY;
 
@@ -199,7 +199,7 @@
 
     private void prepare() {
         if (handler == null)
-            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisibile);
+            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisible);
     }
 
     @Override
@@ -348,7 +348,7 @@
     
     @Override
     public void showAndResumeDrawTask(Long position) {
-        mDanmakuVisibile = true;
+        mDanmakuVisible = true;
         if (handler == null) {
             return;
         }
@@ -357,7 +357,7 @@
 
     @Override
     public void hide() {
-        mDanmakuVisibile = false;
+        mDanmakuVisible = false;
         if (handler == null) {
             return;
         }
@@ -366,7 +366,7 @@
     
     @Override
     public long hideAndPauseDrawTask() {
-        mDanmakuVisibile = false;
+        mDanmakuVisible = false;
         if (handler == null) {
             return 0;
         }
