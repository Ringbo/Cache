diff --git a/demo/src/main/java/com/google/android/exoplayer/demo/full/player/SmoothStreamingRendererBuilder.java b/demo/src/main/java/com/google/android/exoplayer/demo/full/player/SmoothStreamingRendererBuilder.java
index ea4dcce..50c7c96 100644
--- a/demo/src/main/java/com/google/android/exoplayer/demo/full/player/SmoothStreamingRendererBuilder.java
+++ b/demo/src/main/java/com/google/android/exoplayer/demo/full/player/SmoothStreamingRendererBuilder.java
@@ -113,7 +113,7 @@
       try {
         drmSessionManager = V18Compat.getDrmSessionManager(manifest.protectionElement.uuid, player,
             drmCallback);
-      } catch (UnsupportedSchemeException e) {
+      } catch (Exception e) {
         callback.onRenderersError(e);
         return;
       }
