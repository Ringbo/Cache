diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java
index d83ad7d..74903e0 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/util/DanmakuUtils.java
@@ -42,7 +42,7 @@
             return true;
         }
 
-        if (d1.isTimeOut()) {
+        if (d1.isTimeOut() || d2.isTimeOut()) {
             return false;
         }
 
