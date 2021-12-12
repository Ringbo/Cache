diff --git a/src/org/anddev/andengine/opengl/vertex/LineVertexBuffer.java b/src/org/anddev/andengine/opengl/vertex/LineVertexBuffer.java
index 3f6c96a..87beee6 100644
--- a/src/org/anddev/andengine/opengl/vertex/LineVertexBuffer.java
+++ b/src/org/anddev/andengine/opengl/vertex/LineVertexBuffer.java
@@ -48,7 +48,7 @@
 
 		final FastFloatBuffer buffer = this.getFloatBuffer();
 		buffer.position(0);
-		buffer.put(buffer);
+		buffer.put(bufferData);
 		buffer.position(0);
 
 		super.setHardwareBufferNeedsUpdate();
