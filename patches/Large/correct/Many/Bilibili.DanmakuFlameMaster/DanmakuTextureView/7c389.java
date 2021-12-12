diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
index 1d206b3..8fe7319 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
@@ -45,8 +45,7 @@
 import master.flame.danmaku.danmaku.util.SystemClock;
 
 /**
- * DanmakuTextureView需要开启GPU加速才能显示弹幕
- * 很遗憾...经过测试TextureView没有提升绘制速度,也许哪里用的不对
+ * DanmakuTextureView  目前使用lockCanvas, 没有使用opengl硬件加速
  * @author ch
  *
  */
@@ -180,7 +179,7 @@
         stopDraw();
     }
 
-    private void stopDraw() {
+    private synchronized void stopDraw() {
         if (handler != null) {
             handler.quit();
             handler = null;
@@ -197,7 +196,7 @@
         }
     }
     
-    protected Looper getLooper(int type){
+    protected synchronized Looper getLooper(int type){
         if (mHandlerThread != null) {
             mHandlerThread.quit();
             mHandlerThread = null;
