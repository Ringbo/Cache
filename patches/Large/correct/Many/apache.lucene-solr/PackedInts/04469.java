diff --git a/lucene/core/src/java/org/apache/lucene/util/packed/PackedInts.java b/lucene/core/src/java/org/apache/lucene/util/packed/PackedInts.java
index fd75946..0fa8285 100644
--- a/lucene/core/src/java/org/apache/lucene/util/packed/PackedInts.java
+++ b/lucene/core/src/java/org/apache/lucene/util/packed/PackedInts.java
@@ -585,7 +585,7 @@
    * @lucene.internal
    */
   public static Reader getReader(DataInput in) throws IOException {
-    final int version = CodecUtil.checkHeader(in, CODEC_NAME, VERSION_START, VERSION_START);
+    final int version = CodecUtil.checkHeader(in, CODEC_NAME, VERSION_START, VERSION_CURRENT);
     final int bitsPerValue = in.readVInt();
     assert bitsPerValue > 0 && bitsPerValue <= 64: "bitsPerValue=" + bitsPerValue;
     final int valueCount = in.readVInt();
@@ -625,7 +625,7 @@
    * @lucene.internal
    */
   public static ReaderIterator getReaderIterator(DataInput in, int mem) throws IOException {
-    final int version = CodecUtil.checkHeader(in, CODEC_NAME, VERSION_START, VERSION_START);
+    final int version = CodecUtil.checkHeader(in, CODEC_NAME, VERSION_START, VERSION_CURRENT);
     final int bitsPerValue = in.readVInt();
     assert bitsPerValue > 0 && bitsPerValue <= 64: "bitsPerValue=" + bitsPerValue;
     final int valueCount = in.readVInt();
@@ -677,7 +677,7 @@
    * @lucene.internal
    */
   public static Reader getDirectReader(IndexInput in) throws IOException {
-    final int version = CodecUtil.checkHeader(in, CODEC_NAME, VERSION_START, VERSION_START);
+    final int version = CodecUtil.checkHeader(in, CODEC_NAME, VERSION_START, VERSION_CURRENT);
     final int bitsPerValue = in.readVInt();
     assert bitsPerValue > 0 && bitsPerValue <= 64: "bitsPerValue=" + bitsPerValue;
     final int valueCount = in.readVInt();
