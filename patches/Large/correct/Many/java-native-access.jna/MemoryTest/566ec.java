diff --git a/jnalib/test/com/sun/jna/MemoryTest.java b/jnalib/test/com/sun/jna/MemoryTest.java
index a74d6e4..65edc0c 100644
--- a/jnalib/test/com/sun/jna/MemoryTest.java
+++ b/jnalib/test/com/sun/jna/MemoryTest.java
@@ -109,7 +109,7 @@
 
     public void testAvoidGCWithExtantBuffer() throws Exception {
         Memory m = new Memory(1024);
-        ByteBuffer b = m.getByteBuffer(0, m.getSize());
+        ByteBuffer b = m.getByteBuffer(0, m.size());
         WeakReference ref = new WeakReference(m);
         WeakReference bref = new WeakReference(b);
         m = null;
