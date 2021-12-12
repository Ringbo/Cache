diff --git a/jnalib/test/com/sun/jna/PointerTest.java b/jnalib/test/com/sun/jna/PointerTest.java
index 4244ee9..c65a674 100644
--- a/jnalib/test/com/sun/jna/PointerTest.java
+++ b/jnalib/test/com/sun/jna/PointerTest.java
@@ -33,7 +33,7 @@
     public void testByteBufferPutString() {
         final String MAGIC = "magic";
         Memory m = new Memory(1024);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         buf.put(MAGIC.getBytes()).put((byte) 0).flip();
         assertEquals("String not written to memory", MAGIC, 
                 m.getString(0, false));
@@ -41,7 +41,7 @@
     public void testByteBufferPutByte() {
         final byte MAGIC = (byte)0xED;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         buf.put(MAGIC).flip();
         assertEquals("Byte not written to memory", MAGIC, 
                 m.getByte(0));
@@ -49,7 +49,7 @@
     public void testByteBufferPutInt() {
         final int MAGIC = 0xABEDCF23;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         buf.putInt(MAGIC).flip();
         assertEquals("Int not written to memory", MAGIC, 
                 m.getInt(0));
@@ -57,7 +57,7 @@
     public void testByteBufferPutLong() {
         final long MAGIC = 0x1234567887654321L;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         buf.putLong(MAGIC).flip();
         assertEquals("Long not written to memory", MAGIC, 
                 m.getLong(0));
@@ -65,7 +65,7 @@
     public void testByteBufferGetByte() {
         final byte MAGIC = (byte)0xED;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         m.setByte(0, MAGIC);
         assertEquals("Byte not read from memory", MAGIC, 
                 buf.get(0));
@@ -73,7 +73,7 @@
     public void testByteBufferGetInt() {
         final int MAGIC = 0xABEDCF23;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         m.setInt(0, MAGIC);
         assertEquals("Int not read from memory", MAGIC, 
                 buf.getInt(0));
@@ -81,7 +81,7 @@
     public void testByteBufferGetLong() {
         final long MAGIC = 0x1234567887654321L;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         m.setLong(0, MAGIC);
         assertEquals("Long not read from memory", MAGIC, 
                 buf.getLong(0));
@@ -115,7 +115,7 @@
     public void testIntBufferPut() {
         final int MAGIC = 0xABEDCF23;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         IntBuffer ib = buf.asIntBuffer();
         ib.put(MAGIC).flip();
         assertEquals("Int not written to memory", MAGIC, 
@@ -124,7 +124,7 @@
     public void testLongBufferPut() {
         final long MAGIC = 0x1234567887654321L;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         LongBuffer lb = buf.asLongBuffer();
         lb.put(MAGIC).flip();
         assertEquals("Long not written to memory", MAGIC, 
@@ -133,7 +133,7 @@
     public void testFloatBufferPut() {
         final float MAGIC = 1234.5678f;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         FloatBuffer fb = buf.asFloatBuffer();
         fb.put(MAGIC).flip();
         assertEquals("Int not written to memory", MAGIC, 
@@ -142,7 +142,7 @@
     public void testDoubleBufferPut() {
         final double MAGIC = 1234.5678;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         DoubleBuffer db = buf.asDoubleBuffer();
         db.put(MAGIC).flip();
         assertEquals("Int not written to memory", MAGIC, 
@@ -151,7 +151,7 @@
     public void testIntBufferGet() {
         final int MAGIC = 0xABEDCF23;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         IntBuffer ib = buf.asIntBuffer();
         m.setInt(0, MAGIC);
         assertEquals("Int not read from memory", MAGIC, 
@@ -160,7 +160,7 @@
     public void testLongBufferGet() {
         final long MAGIC = 0x1234567887654321L;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         LongBuffer lb = buf.asLongBuffer();
         m.setLong(0, MAGIC);
         assertEquals("Long not read from memory", MAGIC, 
@@ -169,7 +169,7 @@
     public void testFloatBufferGet() {
         final float MAGIC = 1234.5678f;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         FloatBuffer fb = buf.asFloatBuffer();
         m.setFloat(0, MAGIC);
         assertEquals("Float not read from memory", MAGIC, 
@@ -178,7 +178,7 @@
     public void testDoubleBufferGet() {
         final double MAGIC = 1234.5678;
         Memory m = new Memory(8);
-        ByteBuffer buf = m.getByteBuffer(0, m.getSize()).order(ByteOrder.nativeOrder());
+        ByteBuffer buf = m.getByteBuffer(0, m.size()).order(ByteOrder.nativeOrder());
         DoubleBuffer db = buf.asDoubleBuffer();
         m.setDouble(0, MAGIC);
         assertEquals("Double not read from memory", MAGIC, 
