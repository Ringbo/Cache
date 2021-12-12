diff --git a/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java b/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java
index 0c1a19f..9fbfeff 100644
--- a/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java
+++ b/backends/gdx-backend-lwjgl3/src/com/badlogic/gdx/backends/lwjgl3/LwjglGL20.java
@@ -383,7 +383,7 @@
 	}
 
 	public void glGetBufferParameteriv (int target, int pname, IntBuffer params) {
-		GL15.glGetBufferParameter(target, pname, params);
+		GL15.glGetBufferParameteriv(target, pname, params);
 	}
 
 	public int glGetError () {
@@ -391,15 +391,15 @@
 	}
 
 	public void glGetFloatv (int pname, FloatBuffer params) {
-		GL11.glGetFloat(pname, params);
+		GL11.glGetFloatv(pname, params);
 	}
 
 	public void glGetFramebufferAttachmentParameteriv (int target, int attachment, int pname, IntBuffer params) {
-		EXTFramebufferObject.glGetFramebufferAttachmentParameterEXT(target, attachment, pname, params);
+		EXTFramebufferObject.glGetFramebufferAttachmentParameterivEXT(target, attachment, pname, params);
 	}
 
 	public void glGetIntegerv (int pname, IntBuffer params) {
-		GL11.glGetInteger(pname, params);
+		GL11.glGetIntegerv(pname, params);
 	}
 
 	public String glGetProgramInfoLog (int program) {
@@ -417,11 +417,11 @@
 	}
 
 	public void glGetProgramiv (int program, int pname, IntBuffer params) {
-		GL20.glGetProgram(program, pname, params);
+		GL20.glGetProgramiv(program, pname, params);
 	}
 
 	public void glGetRenderbufferParameteriv (int target, int pname, IntBuffer params) {
-		EXTFramebufferObject.glGetRenderbufferParameterEXT(target, pname, params);
+		EXTFramebufferObject.glGetRenderbufferParameterivEXT(target, pname, params);
 	}
 
 	public String glGetShaderInfoLog (int shader) {
@@ -443,7 +443,7 @@
 	}
 
 	public void glGetShaderiv (int shader, int pname, IntBuffer params) {
-		GL20.glGetShader(shader, pname, params);
+		GL20.glGetShaderiv(shader, pname, params);
 	}
 
 	public String glGetString (int name) {
@@ -451,11 +451,11 @@
 	}
 
 	public void glGetTexParameterfv (int target, int pname, FloatBuffer params) {
-		GL11.glGetTexParameter(target, pname, params);
+		GL11.glGetTexParameterfv(target, pname, params);
 	}
 
 	public void glGetTexParameteriv (int target, int pname, IntBuffer params) {
-		GL11.glGetTexParameter(target, pname, params);
+		GL11.glGetTexParameteriv(target, pname, params);
 	}
 
 	public int glGetUniformLocation (int program, String name) {
@@ -463,11 +463,11 @@
 	}
 
 	public void glGetUniformfv (int program, int location, FloatBuffer params) {
-		GL20.glGetUniform(program, location, params);
+		GL20.glGetUniformfv(program, location, params);
 	}
 
 	public void glGetUniformiv (int program, int location, IntBuffer params) {
-		GL20.glGetUniform(program, location, params);
+		GL20.glGetUniformiv(program, location, params);
 	}
 
 	public void glGetVertexAttribPointerv (int index, int pname, Buffer pointer) {
@@ -475,11 +475,11 @@
 	}
 
 	public void glGetVertexAttribfv (int index, int pname, FloatBuffer params) {
-		GL20.glGetVertexAttrib(index, pname, params);
+		GL20.glGetVertexAttribfv(index, pname, params);
 	}
 
 	public void glGetVertexAttribiv (int index, int pname, IntBuffer params) {
-		GL20.glGetVertexAttrib(index, pname, params);
+		GL20.glGetVertexAttribiv(index, pname, params);
 	}
 
 	public void glHint (int target, int mode) {
@@ -616,7 +616,7 @@
 	}
 
 	public void glTexParameterfv (int target, int pname, FloatBuffer params) {
-		GL11.glTexParameter(target, pname, params);
+		GL11.glTexParameterfv(target, pname, params);
 	}
 
 	public void glTexParameteri (int target, int pname, int param) {
@@ -624,7 +624,7 @@
 	}
 
 	public void glTexParameteriv (int target, int pname, IntBuffer params) {
-		GL11.glTexParameter(target, pname, params);
+		GL11.glTexParameteriv(target, pname, params);
 	}
 
 	public void glTexSubImage2D (int target, int level, int xoffset, int yoffset, int width, int height, int format, int type,
@@ -649,11 +649,11 @@
 	}
 
 	public void glUniform1fv (int location, int count, FloatBuffer v) {
-		GL20.glUniform1(location, v);
+		GL20.glUniform1fv(location, v);
 	}
 
 	public void glUniform1fv (int location, int count, float[] v, int offset) {
-		GL20.glUniform1(location, toFloatBuffer(v, offset, count));
+		GL20.glUniform1fv(location, toFloatBuffer(v, offset, count));
 	}
 
 	public void glUniform1i (int location, int x) {
@@ -661,12 +661,12 @@
 	}
 
 	public void glUniform1iv (int location, int count, IntBuffer v) {
-		GL20.glUniform1(location, v);
+		GL20.glUniform1iv(location, v);
 	}
 
 	@Override
 	public void glUniform1iv (int location, int count, int[] v, int offset) {
-		GL20.glUniform1(location, toIntBuffer(v, offset, count));
+		GL20.glUniform1iv(location, toIntBuffer(v, offset, count));
 	}
 
 	public void glUniform2f (int location, float x, float y) {
@@ -674,11 +674,11 @@
 	}
 
 	public void glUniform2fv (int location, int count, FloatBuffer v) {
-		GL20.glUniform2(location, v);
+		GL20.glUniform2fv(location, v);
 	}
 
 	public void glUniform2fv (int location, int count, float[] v, int offset) {
-		GL20.glUniform2(location, toFloatBuffer(v, offset, count << 1));
+		GL20.glUniform2fv(location, toFloatBuffer(v, offset, count << 1));
 	}
 
 	public void glUniform2i (int location, int x, int y) {
@@ -686,11 +686,11 @@
 	}
 
 	public void glUniform2iv (int location, int count, IntBuffer v) {
-		GL20.glUniform2(location, v);
+		GL20.glUniform2iv(location, v);
 	}
 
 	public void glUniform2iv (int location, int count, int[] v, int offset) {
-		GL20.glUniform2(location, toIntBuffer(v, offset, count << 1));
+		GL20.glUniform2iv(location, toIntBuffer(v, offset, count << 1));
 	}
 
 	public void glUniform3f (int location, float x, float y, float z) {
@@ -698,11 +698,11 @@
 	}
 
 	public void glUniform3fv (int location, int count, FloatBuffer v) {
-		GL20.glUniform3(location, v);
+		GL20.glUniform3fv(location, v);
 	}
 
 	public void glUniform3fv (int location, int count, float[] v, int offset) {
-		GL20.glUniform3(location, toFloatBuffer(v, offset, count * 3));
+		GL20.glUniform3fv(location, toFloatBuffer(v, offset, count * 3));
 	}
 
 	public void glUniform3i (int location, int x, int y, int z) {
@@ -710,11 +710,11 @@
 	}
 
 	public void glUniform3iv (int location, int count, IntBuffer v) {
-		GL20.glUniform3(location, v);
+		GL20.glUniform3iv(location, v);
 	}
 
 	public void glUniform3iv (int location, int count, int[] v, int offset) {
-		GL20.glUniform3(location, toIntBuffer(v, offset, count * 3));
+		GL20.glUniform3iv(location, toIntBuffer(v, offset, count * 3));
 	}
 
 	public void glUniform4f (int location, float x, float y, float z, float w) {
@@ -722,11 +722,11 @@
 	}
 
 	public void glUniform4fv (int location, int count, FloatBuffer v) {
-		GL20.glUniform4(location, v);
+		GL20.glUniform4fv(location, v);
 	}
 
 	public void glUniform4fv (int location, int count, float[] v, int offset) {
-		GL20.glUniform4(location, toFloatBuffer(v, offset, count << 2));
+		GL20.glUniform4fv(location, toFloatBuffer(v, offset, count << 2));
 	}
 
 	public void glUniform4i (int location, int x, int y, int z, int w) {
@@ -734,35 +734,35 @@
 	}
 
 	public void glUniform4iv (int location, int count, IntBuffer v) {
-		GL20.glUniform4(location, v);
+		GL20.glUniform4iv(location, v);
 	}
 
 	public void glUniform4iv (int location, int count, int[] v, int offset) {
-		GL20.glUniform4(location, toIntBuffer(v, offset, count << 2));
+		GL20.glUniform4iv(location, toIntBuffer(v, offset, count << 2));
 	}
 
 	public void glUniformMatrix2fv (int location, int count, boolean transpose, FloatBuffer value) {
-		GL20.glUniformMatrix2(location, transpose, value);
+		GL20.glUniformMatrix2fv(location, transpose, value);
 	}
 
 	public void glUniformMatrix2fv (int location, int count, boolean transpose, float[] value, int offset) {
-		GL20.glUniformMatrix2(location, transpose, toFloatBuffer(value, offset, count << 2));
+		GL20.glUniformMatrix2fv(location, transpose, toFloatBuffer(value, offset, count << 2));
 	}
 
 	public void glUniformMatrix3fv (int location, int count, boolean transpose, FloatBuffer value) {
-		GL20.glUniformMatrix3(location, transpose, value);
+		GL20.glUniformMatrix3fv(location, transpose, value);
 	}
 
 	public void glUniformMatrix3fv (int location, int count, boolean transpose, float[] value, int offset) {
-		GL20.glUniformMatrix3(location, transpose, toFloatBuffer(value, offset, count * 9));
+		GL20.glUniformMatrix3fv(location, transpose, toFloatBuffer(value, offset, count * 9));
 	}
 
 	public void glUniformMatrix4fv (int location, int count, boolean transpose, FloatBuffer value) {
-		GL20.glUniformMatrix4(location, transpose, value);
+		GL20.glUniformMatrix4fv(location, transpose, value);
 	}
 
 	public void glUniformMatrix4fv (int location, int count, boolean transpose, float[] value, int offset) {
-		GL20.glUniformMatrix4(location, transpose, toFloatBuffer(value, offset, count << 4));
+		GL20.glUniformMatrix4fv(location, transpose, toFloatBuffer(value, offset, count << 4));
 	}
 
 	public void glUseProgram (int program) {
