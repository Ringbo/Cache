diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java
index 3341469..8675205 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java
@@ -60,7 +60,7 @@
 
 	private IntBuffer toIntBuffer (int v[], int offset, int count) {
 		ensureBufferCapacity(count << 2);
-		floatBuffer.clear();
+		intBuffer.clear();
 		com.badlogic.gdx.utils.BufferUtils.copy(v, count, offset, intBuffer);
 		return intBuffer;
 	}
