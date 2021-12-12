diff --git a/app/src/main/java/org/schabi/newpipe/player/playback/MediaSourceManager.java b/app/src/main/java/org/schabi/newpipe/player/playback/MediaSourceManager.java
index 8e5217c..ff139e9 100644
--- a/app/src/main/java/org/schabi/newpipe/player/playback/MediaSourceManager.java
+++ b/app/src/main/java/org/schabi/newpipe/player/playback/MediaSourceManager.java
@@ -273,7 +273,7 @@
      * If the play queue index already exists, then the insert is ignored.
      * */
     private void insert(final int queueIndex, final DeferredMediaSource source) {
-        if (queueIndex < 0) return;
+        if (queueIndex < 0 || queueIndex < sources.getSize()) return;
 
         sources.addMediaSource(queueIndex, source);
     }
