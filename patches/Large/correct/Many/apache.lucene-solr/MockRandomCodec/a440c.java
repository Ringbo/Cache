diff --git a/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java b/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java
index 691a445..4e1c33e 100644
--- a/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java
+++ b/lucene/src/test-framework/org/apache/lucene/index/codecs/mockrandom/MockRandomCodec.java
@@ -122,7 +122,7 @@
   public FieldsConsumer fieldsConsumer(SegmentWriteState state) throws IOException {
     // we pull this before the seed intentionally: because its not consumed at runtime
     // (the skipInterval is written into postings header)
-    int skipInterval = _TestUtil.nextInt(seedRandom, 2, 64);
+    int skipInterval = _TestUtil.nextInt(seedRandom, 2, 10);
     
     if (LuceneTestCase.VERBOSE) {
       System.out.println("MockRandomCodec: skipInterval=" + skipInterval);
