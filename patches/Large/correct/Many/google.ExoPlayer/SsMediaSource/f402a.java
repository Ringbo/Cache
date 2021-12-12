diff --git a/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/SsMediaSource.java b/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/SsMediaSource.java
index 03e8d60..f1b56ac 100644
--- a/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/SsMediaSource.java
+++ b/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/SsMediaSource.java
@@ -485,8 +485,12 @@
   @Override
   public void onLoadCanceled(ParsingLoadable<SsManifest> loadable, long elapsedRealtimeMs,
       long loadDurationMs, boolean released) {
-    eventDispatcher.loadCompleted(loadable.dataSpec, loadable.type, elapsedRealtimeMs,
-        loadDurationMs, loadable.bytesLoaded());
+    eventDispatcher.loadCanceled(
+        loadable.dataSpec,
+        loadable.type,
+        elapsedRealtimeMs,
+        loadDurationMs,
+        loadable.bytesLoaded());
   }
 
   @Override
