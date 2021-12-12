diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAudio.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAudio.java
index 3105e66..81312ec 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAudio.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAudio.java
@@ -115,7 +115,7 @@
 		try {
 			LwjglMusic music = new LwjglMusic(((LwjglFileHandle)file));
 			return music;
-		} catch (Exception e) {
+		} catch (Throwable e) {
 			throw new GdxRuntimeException("Couldn't create Music instance from file '" + file + "'", e);
 		}
 	}
