diff --git a/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java b/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java
index 9fbfeff..7ab2b0e 100644
--- a/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java
+++ b/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java
@@ -353,18 +353,16 @@
 	}
 
 	public String glGetActiveAttrib (int program, int index, IntBuffer size, Buffer type) {
-		// FIXME this is less than ideal of course...
 		IntBuffer typeTmp = BufferUtils.createIntBuffer(2);
-		String name = GL20.glGetActiveAttrib(program, index, 256, typeTmp);
+		String name = GL20.glGetActiveAttrib(program, index, 256, size, typeTmp);
 		size.put(typeTmp.get(0));
 		if (type instanceof IntBuffer) ((IntBuffer)type).put(typeTmp.get(1));
 		return name;
 	}
 
 	public String glGetActiveUniform (int program, int index, IntBuffer size, Buffer type) {
-		// FIXME this is less than ideal of course...
 		IntBuffer typeTmp = BufferUtils.createIntBuffer(2);
-		String name = GL20.glGetActiveUniform(program, index, 256, typeTmp);
+		String name = GL20.glGetActiveUniform(program, index, 256, size, typeTmp);
 		size.put(typeTmp.get(0));
 		if (type instanceof IntBuffer) ((IntBuffer)type).put(typeTmp.get(1));
 		return name;
@@ -808,15 +806,15 @@
 	public void glVertexAttribPointer (int indx, int size, int type, boolean normalized, int stride, Buffer buffer) {
 		if (buffer instanceof ByteBuffer) {
 			if (type == GL_BYTE)				
-				GL20.glVertexAttribPointer(indx, size, false, normalized, stride, (ByteBuffer)buffer);
+				GL20.glVertexAttribPointer(indx, size, type, normalized, stride, (ByteBuffer)buffer);
 			else if (type == GL_UNSIGNED_BYTE)
-				GL20.glVertexAttribPointer(indx, size, true, normalized, stride, (ByteBuffer)buffer);
+				GL20.glVertexAttribPointer(indx, size, type, normalized, stride, (ByteBuffer)buffer);
 			else if (type == GL_SHORT)
-				GL20.glVertexAttribPointer(indx, size, false, normalized, stride, ((ByteBuffer)buffer).asShortBuffer());
+				GL20.glVertexAttribPointer(indx, size, type, normalized, stride, ((ByteBuffer)buffer).asShortBuffer());
 			else if (type == GL_UNSIGNED_SHORT)
-				GL20.glVertexAttribPointer(indx, size, true, normalized, stride, ((ByteBuffer)buffer).asShortBuffer());
+				GL20.glVertexAttribPointer(indx, size, type, normalized, stride, ((ByteBuffer)buffer).asShortBuffer());
 			else if (type == GL_FLOAT)
-				GL20.glVertexAttribPointer(indx, size, normalized, stride, ((ByteBuffer)buffer).asFloatBuffer());
+				GL20.glVertexAttribPointer(indx, size, type, normalized, stride, ((ByteBuffer)buffer).asFloatBuffer());
 			else
 				throw new GdxRuntimeException(
 					"Can't use "
@@ -826,7 +824,7 @@
 						+ " with this method. Use ByteBuffer and one of GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT or GL_FLOAT for type. Blame LWJGL");
 		} else if (buffer instanceof FloatBuffer) {
 			if (type == GL_FLOAT)
-				GL20.glVertexAttribPointer(indx, size, normalized, stride, (FloatBuffer)buffer);
+				GL20.glVertexAttribPointer(indx, size, type, normalized, stride, (FloatBuffer)buffer);
 			else
 				throw new GdxRuntimeException("Can't use " + buffer.getClass().getName() + " with type " + type
 					+ " with this method.");
