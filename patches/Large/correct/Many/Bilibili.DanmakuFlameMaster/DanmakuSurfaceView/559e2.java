diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java
index d076cac..5426ecd 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java
@@ -55,7 +55,7 @@
     
     private boolean mShowFps;
 
-    private boolean mDanmakuVisibile = true;
+    private boolean mDanmakuVisible = true;
 
     protected int mDrawingThreadType = THREAD_TYPE_NORMAL_PRIORITY;
 
@@ -190,7 +190,7 @@
 
     private void prepare() {
         if (handler == null)
-            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisibile);
+            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisible);
     }
 
     @Override
@@ -339,7 +339,7 @@
     
     @Override
     public void showAndResumeDrawTask(Long position) {
-        mDanmakuVisibile = true;
+        mDanmakuVisible = true;
         if (handler == null) {
             return;
         }
@@ -348,7 +348,7 @@
 
     @Override
     public void hide() {
-        mDanmakuVisibile = false;
+        mDanmakuVisible = false;
         if (handler == null) {
             return;
         }
@@ -357,7 +357,7 @@
     
     @Override
     public long hideAndPauseDrawTask() {
-        mDanmakuVisibile = false;
+        mDanmakuVisible = false;
         if (handler == null) {
             return 0;
         }
