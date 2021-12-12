diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java
index 0f6c4d6..d83ad7d 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java
@@ -42,7 +42,7 @@
             return true;
         }
 
-        if (d1.isOutside()) {
+        if (d1.isTimeOut()) {
             return false;
         }
 
