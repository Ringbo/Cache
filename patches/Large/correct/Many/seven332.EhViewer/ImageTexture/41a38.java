diff --git a/app/src/main/java/com/hippo/gl/glrenderer/ImageTexture.java b/app/src/main/java/com/hippo/gl/glrenderer/ImageTexture.java
index d46cbce..85f46bb 100644
--- a/app/src/main/java/com/hippo/gl/glrenderer/ImageTexture.java
+++ b/app/src/main/java/com/hippo/gl/glrenderer/ImageTexture.java
@@ -327,7 +327,7 @@
                 mImageBusy = false;
             }
 
-            if (interrupted || mNeedRecycle.get() || frameCount < 1) {
+            if (interrupted || mNeedRecycle.get() || frameCount <= 1) {
                 return;
             }
 
@@ -470,7 +470,7 @@
 
         mTiles = list.toArray(new Tile[list.size()]);
 
-        if (!mImage.isCompleted() || mImage.getFrameCount() >= 1) {
+        if (!mImage.isCompleted() || mImage.getFrameCount() > 1) {
             Thread thread = sThreadFactory.newThread(new AnimateRunnable());
             mAnimateThread.lazySet(thread);
             thread.start();
@@ -497,7 +497,7 @@
 
     @Override
     public void start() {
-        if (mImage.isRecycled() || (mImage.isCompleted() && mImage.getFrameCount() < 1)) {
+        if (mImage.isRecycled() || (mImage.isCompleted() && mImage.getFrameCount() <= 1)) {
             return;
         }
 
@@ -511,7 +511,7 @@
 
     @Override
     public void stop() {
-        if (!mImage.isRecycled() && (mImage.isCompleted() && mImage.getFrameCount() >= 1)) {
+        if (!mImage.isRecycled() && (mImage.isCompleted() && mImage.getFrameCount() > 1)) {
             Thread thread = mAnimateThread.getAndSet(null);
             if (null != thread) {
                 thread.interrupt();
