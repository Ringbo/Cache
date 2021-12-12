diff --git a/lucene/core/src/test/org/apache/lucene/util/packed/TestPackedInts.java b/lucene/core/src/test/org/apache/lucene/util/packed/TestPackedInts.java
index 721ed43..6a84818 100644
--- a/lucene/core/src/test/org/apache/lucene/util/packed/TestPackedInts.java
+++ b/lucene/core/src/test/org/apache/lucene/util/packed/TestPackedInts.java
@@ -541,7 +541,8 @@
   }
 
   public void testPackedIntsNull() {
-    int size = _TestUtil.nextInt(random(), 0, 256);
+    // must be > 10 for the bulk reads below
+    int size = _TestUtil.nextInt(random(), 11, 256);
     Reader packedInts = new PackedInts.NullReader(size);
     assertEquals(0, packedInts.get(_TestUtil.nextInt(random(), 0, size - 1)));
     long[] arr = new long[size + 10];
