diff --git a/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java b/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java
index 812cd29..6eb9abf 100644
--- a/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java
+++ b/jiaozivideoplayer/src/main/java/cn/jzvd/JZVideoPlayer.java
@@ -383,7 +383,7 @@
     }
 
     public void setUp(String url, int screen, Object... objects) {
-        setUp(new JZDataSource(url), 0, screen, objects);
+        setUp(new JZDataSource(url), screen, objects);
     }
 
     public void setUp(JZDataSource jzDataSource, int screen, Object... objects) {
