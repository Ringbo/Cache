diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayerManager.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayerManager.java
index e36667d..5a8ac9f 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayerManager.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayerManager.java
@@ -46,7 +46,7 @@
 //    }
 
     public static void completeAll() {
-        if (SECOND_FLOOR != null) {
+        if (SECOND_FLOOR != null && SECOND_FLOOR.get() != null) {
             SECOND_FLOOR.get().onCompletion();
         }
         if (getCurrentJcvdOnFirtFloor() != null) {
