diff --git a/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/DirectByteBufferTest.java b/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/DirectByteBufferTest.java
index d578f80..f7a9b8e 100644
--- a/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/DirectByteBufferTest.java
+++ b/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/DirectByteBufferTest.java
@@ -186,7 +186,7 @@
         test("unalignedWriteSnippet", (byte) -3, (short) 17, 42, 0x3FC30A25644B7130L, 84.72, 1.23f);
     }
 
-    private ByteBuffer makeDirect(byte[] bytes, ByteOrder byteOrder) {
+    private static ByteBuffer makeDirect(byte[] bytes, ByteOrder byteOrder) {
         int length = bytes.length;
         ByteBuffer buffer = ByteBuffer.allocateDirect(length).order(byteOrder);
         buffer.put(bytes);
@@ -194,7 +194,7 @@
         return buffer;
     }
 
-    private ByteBuffer makeDirect(int length, ByteOrder byteOrder) {
+    private static ByteBuffer makeDirect(int length, ByteOrder byteOrder) {
         ByteBuffer buffer = ByteBuffer.allocateDirect(length).order(byteOrder);
         buffer.position(0);
         return buffer;
