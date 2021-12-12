diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
index ec14b4f..999137e 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/ui/widget/DanmakuTextureView.java
@@ -255,7 +255,7 @@
     @Override
     public void pause() {
         if (handler != null)
-            handler.quit();
+            handler.pause();
     }
 
     @Override
