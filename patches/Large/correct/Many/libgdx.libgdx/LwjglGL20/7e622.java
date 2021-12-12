diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java
index fc81fec..f83b707 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglGL20.java
@@ -307,7 +307,7 @@
 		IntBuffer typeTmp = BufferUtils.createIntBuffer(2);
 		String name = GL20.glGetActiveUniform(program, index, 256, typeTmp);
 		size.put(typeTmp.get(0));
-		if (type instanceof IntBuffer) ((IntBuffer)type).put(typeTmp.get(0));
+		if (type instanceof IntBuffer) ((IntBuffer)type).put(typeTmp.get(1));
 		return name;
 	}
 
