diff --git a/demo/src/main/java/com/google/android/exoplayer/demo/full/player/DashVodRendererBuilder.java b/demo/src/main/java/com/google/android/exoplayer/demo/full/player/DashVodRendererBuilder.java
index e892b3e..4d50825 100644
--- a/demo/src/main/java/com/google/android/exoplayer/demo/full/player/DashVodRendererBuilder.java
+++ b/demo/src/main/java/com/google/android/exoplayer/demo/full/player/DashVodRendererBuilder.java
@@ -153,7 +153,7 @@
           // HD streams require L1 security.
           videoRepresentations = getSdRepresentations(videoRepresentations);
         }
-      } catch (UnsupportedSchemeException e) {
+      } catch (Exception e) {
         callback.onRenderersError(e);
         return;
       }
