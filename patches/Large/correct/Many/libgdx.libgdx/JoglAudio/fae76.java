diff --git a/backends/gdx-backend-jogl/src/com/badlogic/gdx/backends/jogl/JoglAudio.java b/backends/gdx-backend-jogl/src/com/badlogic/gdx/backends/jogl/JoglAudio.java
index 83241ad..eeddeb1 100644
--- a/backends/gdx-backend-jogl/src/com/badlogic/gdx/backends/jogl/JoglAudio.java
+++ b/backends/gdx-backend-jogl/src/com/badlogic/gdx/backends/jogl/JoglAudio.java
@@ -121,7 +121,7 @@
 		try {
 			JoglMusic music = new JoglMusic(((JoglFileHandle)file));
 			return music;
-		} catch (Exception e) {
+		} catch (Throwable e) {
 			throw new GdxRuntimeException("Couldn't create Music instance from file '" + file + "'", e);
 		}
 	}
