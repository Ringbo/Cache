diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCursor.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCursor.java
index f07b187..a4ae201 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCursor.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCursor.java
@@ -80,7 +80,7 @@
 			}
 
 			lwjglCursor = new org.lwjgl.input.Cursor(pixmap.getWidth(), pixmap.getHeight(), xHotspot, pixmap.getHeight() - yHotspot
-				- 4, 1, IntBuffer.wrap(pixelsARGBflipped), null);
+				- 1, 1, IntBuffer.wrap(pixelsARGBflipped), null);
 		} catch (LWJGLException e) {
 			throw new GdxRuntimeException("Could not create cursor image.", e);
 		}
