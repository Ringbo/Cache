diff --git a/buffer/src/main/java/io/netty/buffer/PoolChunk.java b/buffer/src/main/java/io/netty/buffer/PoolChunk.java
index 71dcd76..8c8d92e 100644
--- a/buffer/src/main/java/io/netty/buffer/PoolChunk.java
+++ b/buffer/src/main/java/io/netty/buffer/PoolChunk.java
@@ -152,7 +152,7 @@
         memoryMap = new short[maxSubpageAllocs << 1];
         int memoryMapIndex = 1;
         for (int d = 0; d <= maxOrder; ++d) { // move down the tree one level at a time
-            short dd = (short) ((d << BYTE_LENGTH) | d);
+            short dd = (short) (d << BYTE_LENGTH | d);
             int depth = 1 << d;
             for (int p = 0; p < depth; ++p) {
                 // in each level traverse left to right and set value to the depth of subtree
@@ -266,15 +266,15 @@
             return -1;
         }
         while (val < d || (id & initial) == 0) { // id & initial == 1 << d for all ids at depth d, for < d it is 0
-            id = id << 1;
+            id <<= 1;
             val = value(id);
             if (val > d) {
-                id = id ^ 1;
+                id ^= 1;
                 val = value(id);
             }
         }
         byte value = value(id);
-        assert value == d && ((id & initial) == 1 << d) : String.format("val = %d, id & initial = %d, d = %d",
+        assert value == d && (id & initial) == 1 << d : String.format("val = %d, id & initial = %d, d = %d",
                 value, id & initial, d);
         setValue(id, unusable); // mark as unusable
         updateParentsAlloc(id);
@@ -383,7 +383,7 @@
     }
 
     private void setValue(int id, byte val) {
-        memoryMap[id] = (short) ((memoryMap[id] & UPPER_BYTE_MASK) | val);
+        memoryMap[id] = (short) (memoryMap[id] & UPPER_BYTE_MASK | val);
     }
 
     private byte depth(int id) {
@@ -391,19 +391,19 @@
         return (byte) (val >>> BYTE_LENGTH);
     }
 
-    private int log2(int val) {
+    private static int log2(int val) {
         // compute the (0-based, with lsb = 0) position of highest set bit i.e, log2
         return Integer.SIZE - 1 - Integer.numberOfLeadingZeros(val);
     }
 
     private int runLength(int id) {
         // represents the size in #bytes supported by node 'id' in the tree
-        return 1 << (log2ChunkSize - depth(id));
+        return 1 << log2ChunkSize - depth(id);
     }
 
     private int runOffset(int id) {
         // represents the 0-based offset in #bytes from start of the byte-array chunk
-        int shift = id ^ (1 << depth(id));
+        int shift = id ^ 1 << depth(id);
         return shift * runLength(id);
     }
 
