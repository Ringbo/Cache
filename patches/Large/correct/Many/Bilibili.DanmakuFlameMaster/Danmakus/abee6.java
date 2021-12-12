diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/Danmakus.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/Danmakus.java
index 3bac848..07387c5 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/Danmakus.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/Danmakus.java
@@ -99,7 +99,7 @@
     }
 
     @Override
-    public void addItem(BaseDanmaku item) {
+    public synchronized void addItem(BaseDanmaku item) {
         if (items != null) {
             try {
                 if (items.add(item))
@@ -111,7 +111,7 @@
     }
 
     @Override
-    public void removeItem(BaseDanmaku item) {
+    public synchronized void removeItem(BaseDanmaku item) {
         if (item == null) {
             return;
         }
@@ -184,7 +184,7 @@
     }
 
     @Override
-    public void clear() {
+    public synchronized void clear() {
         if (items != null){
             items.clear();
             mSize = 0;
