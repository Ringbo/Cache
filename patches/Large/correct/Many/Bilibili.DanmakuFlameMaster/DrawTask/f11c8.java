diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/controller/DrawTask.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/controller/DrawTask.java
index 2eb303d..e274c8d 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/controller/DrawTask.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/controller/DrawTask.java
@@ -134,7 +134,7 @@
         synchronized (danmakuList) {
             added = danmakuList.addItem(item);
         }
-        if (!subAdded) {
+        if (!subAdded || !added) {
             mLastBeginMills = mLastEndMills = 0;
         }
         if (added && mTaskListener != null) {
