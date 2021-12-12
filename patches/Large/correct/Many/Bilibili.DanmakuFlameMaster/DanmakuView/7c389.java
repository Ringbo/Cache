diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java
index c7cba92..d2c93bf 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuView.java
@@ -153,7 +153,7 @@
         stopDraw();
     }
 
-    private void stopDraw() {
+    private synchronized void stopDraw() {
         DrawHandler handler = this.handler;
         this.handler = null;
         unlockCanvasAndPost();
@@ -172,7 +172,7 @@
         }
     }
     
-    protected Looper getLooper(int type){
+    protected synchronized Looper getLooper(int type) {
         if (mHandlerThread != null) {
             mHandlerThread.quit();
             mHandlerThread = null;
