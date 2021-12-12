diff --git a/lucene/core/src/java/org/apache/lucene/codecs/lucene41/ForUtil.java b/lucene/core/src/java/org/apache/lucene/codecs/lucene41/ForUtil.java
index 88f70a2..3783c1e 100644
--- a/lucene/core/src/java/org/apache/lucene/codecs/lucene41/ForUtil.java
+++ b/lucene/core/src/java/org/apache/lucene/codecs/lucene41/ForUtil.java
@@ -157,7 +157,7 @@
    */
   void writeBlock(int[] data, byte[] encoded, IndexOutput out) throws IOException {
     if (isAllEqual(data)) {
-      out.writeVInt(ALL_VALUES_EQUAL);
+      out.writeByte((byte) ALL_VALUES_EQUAL);
       out.writeVInt(data[0]);
       return;
     }
@@ -170,7 +170,7 @@
     final int encodedSize = encodedSizes[numBits];
     assert (iters * encoder.blockCount()) << 3 >= encodedSize;
 
-    out.writeVInt(numBits);
+    out.writeByte((byte) numBits);
 
     encoder.encode(data, 0, encoded, 0, iters);
     out.writeBytes(encoded, encodedSize);
@@ -185,7 +185,7 @@
    * @throws IOException If there is a low-level I/O error
    */
   void readBlock(IndexInput in, byte[] encoded, int[] decoded) throws IOException {
-    final int numBits = in.readVInt();
+    final int numBits = in.readByte();
     assert numBits <= 32 : numBits;
 
     if (numBits == ALL_VALUES_EQUAL) {
@@ -211,7 +211,7 @@
    * @throws IOException If there is a low-level I/O error
    */
   void skipBlock(IndexInput in) throws IOException {
-    final int numBits = in.readVInt();
+    final int numBits = in.readByte();
     if (numBits == ALL_VALUES_EQUAL) {
       in.readVInt();
       return;
@@ -222,7 +222,7 @@
   }
 
   private static boolean isAllEqual(final int[] data) {
-    final long v = data[0];
+    final int v = data[0];
     for (int i = 1; i < BLOCK_SIZE; ++i) {
       if (data[i] != v) {
         return false;
