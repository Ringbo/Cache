diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObjectSubData.java b/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObjectSubData.java
index 8a86c8c..e9ec82b 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObjectSubData.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObjectSubData.java
@@ -150,7 +150,7 @@
 	public void setIndices (short[] indices, int offset, int count) {
 		isDirty = true;
 		buffer.clear();
-		buffer.put(indices);
+		buffer.put(indices, offset, count);
 		buffer.flip();
 		byteBuffer.position(0);
 		byteBuffer.limit(count << 1);
