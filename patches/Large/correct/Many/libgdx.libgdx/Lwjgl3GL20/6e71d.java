diff --git a/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/Lwjgl3GL20.java b/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/Lwjgl3GL20.java
index 536c5af..76cb133 100644
--- a/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/Lwjgl3GL20.java
+++ b/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/Lwjgl3GL20.java
@@ -56,7 +56,7 @@
 
 	private IntBuffer toIntBuffer (int v[], int offset, int count) {
 		ensureBufferCapacity(count << 2);
-		floatBuffer.clear();
+		intBuffer.clear();
 		com.badlogic.gdx.utils.BufferUtils.copy(v, count, offset, intBuffer);
 		return intBuffer;
 	}
