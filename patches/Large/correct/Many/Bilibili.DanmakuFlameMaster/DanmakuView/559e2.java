diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java
index 255cce0..57bdb2a 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java
@@ -53,7 +53,7 @@
     
     private boolean mShowFps;
 
-    private boolean mDanmakuVisibile = true;
+    private boolean mDanmakuVisible = true;
 
     protected int mDrawingThreadType = THREAD_TYPE_NORMAL_PRIORITY;
 
@@ -165,7 +165,7 @@
 
     private void prepare() {
         if (handler == null)
-            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisibile);
+            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisible);
     }
 
     @Override
@@ -221,7 +221,7 @@
     }
 
     private void lockCanvas() {
-        if(mDanmakuVisibile == false) {
+        if(mDanmakuVisible == false) {
             return;
         }
         postInvalidateCompat();
@@ -230,7 +230,7 @@
                 try {
                     mDrawMonitor.wait(200);
                 } catch (InterruptedException e) {
-                    if (mDanmakuVisibile == false || handler == null || handler.isStop()) {
+                    if (mDanmakuVisible == false || handler == null || handler.isStop()) {
                         break;
                     } else {
                         Thread.currentThread().interrupt();
@@ -367,7 +367,7 @@
     
     @Override
     public void showAndResumeDrawTask(Long position) {
-        mDanmakuVisibile = true;
+        mDanmakuVisible = true;
         mClearFlag = false;
         if (handler == null) {
             return;
@@ -377,7 +377,7 @@
 
     @Override
     public void hide() {
-        mDanmakuVisibile = false;
+        mDanmakuVisible = false;
         if (handler == null) {
             return;
         }
@@ -386,7 +386,7 @@
     
     @Override
     public long hideAndPauseDrawTask() {
-        mDanmakuVisibile = false;
+        mDanmakuVisible = false;
         if (handler == null) {
             return 0;
         }
@@ -398,7 +398,7 @@
         if (!isViewReady()) {
             return;
         }
-        if (!mDanmakuVisibile) {
+        if (!mDanmakuVisible) {
             mClearFlag = true;
             postInvalidateCompat();
         } else {
