diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObject.java b/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObject.java
index b6eec62..b758ac0 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObject.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/IndexBufferObject.java
@@ -139,12 +139,12 @@
 	 * 
 	 * @param indices the vertex data
 	 * @param offset the offset to start copying the data from
-	 * @param count the number of floats to copy
+	 * @param count the number of shorts to copy
 	 */
 	public void setIndices (short[] indices, int offset, int count) {
 		isDirty = true;
 		buffer.clear();
-		buffer.put(indices);
+		buffer.put(indices, offset, count);
 		buffer.flip();
 		byteBuffer.position(0);
 		byteBuffer.limit(count << 1);
