diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/BufferUtilsTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/BufferUtilsTest.java
index 3e73199..285df10 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/BufferUtilsTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/BufferUtilsTest.java
@@ -39,7 +39,7 @@
 	@Override
 	public void create () {
 		ByteBuffer bytebuffer = BufferUtils.newUnsafeByteBuffer(1000 * 1000);
-		BufferUtils.freeMemory(bytebuffer);
+		BufferUtils.disposeUnsafeByteBuffer(bytebuffer);
 
 		ByteBuffer bb = BufferUtils.newByteBuffer(8);
 		CharBuffer cb = BufferUtils.newCharBuffer(8);
