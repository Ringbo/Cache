diff --git a/lucene/core/src/test/org/apache/lucene/codecs/blockpacked/TestForUtil.java b/lucene/core/src/test/org/apache/lucene/codecs/blockpacked/TestForUtil.java
index 834e8fb..158328f 100644
--- a/lucene/core/src/test/org/apache/lucene/codecs/blockpacked/TestForUtil.java
+++ b/lucene/core/src/test/org/apache/lucene/codecs/blockpacked/TestForUtil.java
@@ -39,7 +39,7 @@
   public void testEncodeDecode() throws IOException {
     final int iterations = RandomInts.randomIntBetween(random(), 1, 1000);
     final float acceptableOverheadRatio = random().nextFloat();
-    final int[] values = new int[iterations * BLOCK_SIZE + ForUtil.MIN_DATA_SIZE];
+    final int[] values = new int[(iterations - 1) * BLOCK_SIZE + ForUtil.MIN_DATA_SIZE];
     for (int i = 0; i < iterations; ++i) {
       final int bpv = random().nextInt(32);
       if (bpv == 0) {
@@ -65,7 +65,7 @@
       
       for (int i = 0; i < iterations; ++i) {
         forUtil.writeBlock(
-            Arrays.copyOfRange(values, iterations * BLOCK_SIZE, values.length),
+            Arrays.copyOfRange(values, i * BLOCK_SIZE, values.length),
             new byte[MIN_ENCODED_SIZE], out);
       }
       endPointer = out.getFilePointer();
@@ -83,7 +83,7 @@
         }
         final int[] restored = new int[MIN_DATA_SIZE];
         forUtil.readBlock(in, new byte[MIN_ENCODED_SIZE], restored);
-        assertArrayEquals(Arrays.copyOfRange(values, iterations * BLOCK_SIZE, (iterations + 1) * BLOCK_SIZE),
+        assertArrayEquals(Arrays.copyOfRange(values, i * BLOCK_SIZE, (i + 1) * BLOCK_SIZE),
             Arrays.copyOf(restored, BLOCK_SIZE));
       }
       assertEquals(endPointer, in.getFilePointer());
