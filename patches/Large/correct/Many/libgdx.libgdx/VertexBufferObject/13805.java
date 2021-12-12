diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/VertexBufferObject.java b/gdx/src/com/badlogic/gdx/graphics/glutils/VertexBufferObject.java
index 16be058..fc013a7 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/VertexBufferObject.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/VertexBufferObject.java
@@ -64,12 +64,12 @@
 		if( Gdx.app.getType() == ApplicationType.Android && Gdx.app.getVersion() < 5 ) {
 			byteBuffer = ByteBuffer.allocate(this.attributes.vertexSize * numVertices);
 			byteBuffer.order(ByteOrder.nativeOrder());
-			isDirect = true;
+			isDirect = false;
 		}
 		else {
 			byteBuffer = ByteBuffer.allocateDirect(this.attributes.vertexSize * numVertices);
 			byteBuffer.order(ByteOrder.nativeOrder());
-			isDirect = false;
+			isDirect = true;
 		}		
 		buffer = byteBuffer.asFloatBuffer();
 		bufferHandle = createBufferObject();
