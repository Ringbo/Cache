diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java
index 81dda26..a528c44 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuSurfaceView.java
@@ -171,7 +171,7 @@
         stopDraw();
     }
 
-    private void stopDraw() {
+    private synchronized void stopDraw() {
         if (handler != null) {
             handler.quit();
             handler = null;
@@ -188,7 +188,7 @@
         }
     }
     
-    protected Looper getLooper(int type){
+    protected synchronized Looper getLooper(int type){
         if (mHandlerThread != null) {
             mHandlerThread.quit();
             mHandlerThread = null;
