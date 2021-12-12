diff --git a/lucene/test-framework/src/test/org/apache/lucene/codecs/compressing/TestCompressingTermVectorsFormat.java b/lucene/test-framework/src/test/org/apache/lucene/codecs/compressing/TestCompressingTermVectorsFormat.java
index 7cfbe21..cde93db 100644
--- a/lucene/test-framework/src/test/org/apache/lucene/codecs/compressing/TestCompressingTermVectorsFormat.java
+++ b/lucene/test-framework/src/test/org/apache/lucene/codecs/compressing/TestCompressingTermVectorsFormat.java
@@ -93,7 +93,7 @@
     // by this test.
     iwConf.setCodec(CompressingCodec.randomInstance(random(), 4*1024, 100, false, 8));
     IndexWriter iw = new IndexWriter(dir, iwConf);
-    DirectoryReader ir = DirectoryReader.open(iw, true);
+    DirectoryReader ir = DirectoryReader.open(iw);
     for (int i = 0; i < 5; i++) {
       Document doc = new Document();
       FieldType ft = new FieldType(TextField.TYPE_NOT_STORED);
