diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL11.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL11.java
index cd6b62a..99f4296 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL11.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL11.java
@@ -127,7 +127,7 @@
 
 	public void glGenBuffers (int n, int[] buffers, int offset) {
 		for (int i = offset; i < offset + n; i++)
-			buffers[offset] = GL15.glGenBuffers();
+			buffers[i] = GL15.glGenBuffers();
 	}
 
 	public void glGenBuffers (int n, IntBuffer buffers) {
