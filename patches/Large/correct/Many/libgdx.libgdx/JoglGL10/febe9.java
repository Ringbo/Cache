diff --git a/gdx-backend-desktop/src/com/badlogic/gdx/backends/desktop/JoglGL10.java b/gdx-backend-desktop/src/com/badlogic/gdx/backends/desktop/JoglGL10.java
index bd06ee4..6852610 100644
--- a/gdx-backend-desktop/src/com/badlogic/gdx/backends/desktop/JoglGL10.java
+++ b/gdx-backend-desktop/src/com/badlogic/gdx/backends/desktop/JoglGL10.java
@@ -46,21 +46,21 @@
 	public JoglGL10( javax.media.opengl.GL gl )
 	{
 		this.gl = gl;
-		ByteBuffer buffer = ByteBuffer.allocateDirect( 200000 * 4 * 4 );		
+		ByteBuffer buffer = ByteBuffer.allocateDirect( 20000 * 4 * 4 );		
 		buffer.order(ByteOrder.nativeOrder());
 		colorBuffer = buffer.asFloatBuffer();
 		
-		buffer = ByteBuffer.allocateDirect( 200000 * 4 * 3 );
+		buffer = ByteBuffer.allocateDirect( 20000 * 4 * 3 );
 		buffer.order(ByteOrder.nativeOrder());
 		normalBuffer = buffer.asFloatBuffer();
 		
-		buffer = ByteBuffer.allocateDirect( 200000 * 4 * 4 );
+		buffer = ByteBuffer.allocateDirect( 20000 * 4 * 4 );
 		buffer.order(ByteOrder.nativeOrder());
 		vertexBuffer = buffer.asFloatBuffer();
 		
 		for( int i = 0; i < texCoordBuffer.length; i++ )
 		{
-			buffer = ByteBuffer.allocateDirect( 200000 * 4 * 4 );
+			buffer = ByteBuffer.allocateDirect( 20000 * 4 * 4 );
 			buffer.order(ByteOrder.nativeOrder());		
 			texCoordBuffer[i] = buffer.asFloatBuffer();
 		}
