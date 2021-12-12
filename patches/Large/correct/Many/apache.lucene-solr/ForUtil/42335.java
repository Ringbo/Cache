diff --git a/lucene/core/src/java/org/apache/lucene/codecs/block/ForUtil.java b/lucene/core/src/java/org/apache/lucene/codecs/block/ForUtil.java
index 37172be..478c140 100644
--- a/lucene/core/src/java/org/apache/lucene/codecs/block/ForUtil.java
+++ b/lucene/core/src/java/org/apache/lucene/codecs/block/ForUtil.java
@@ -151,7 +151,7 @@
   void writeBlock(int[] data, byte[] encoded, IndexOutput out) throws IOException {
     if (isAllEqual(data)) {
       out.writeVInt(ALL_VALUES_EQUAL);
-      out.writeInt(data[0]);
+      out.writeVInt(data[0]);
       return;
     }
 
@@ -182,7 +182,7 @@
     assert numBits <= 32 : numBits;
 
     if (numBits == ALL_VALUES_EQUAL) {
-      final int value = in.readInt();
+      final int value = in.readVInt();
       Arrays.fill(decoded, 0, BLOCK_SIZE, value);
       return;
     }
@@ -206,7 +206,7 @@
   void skipBlock(IndexInput in) throws IOException {
     final int numBits = in.readVInt();
     if (numBits == ALL_VALUES_EQUAL) {
-      in.seek(in.getFilePointer() + 4);
+      in.readVInt();
       return;
     }
     assert numBits > 0 && numBits <= 32 : numBits;
