diff --git a/src/test/org/apache/nutch/indexer/TestDeleteDuplicates.java b/src/test/org/apache/nutch/indexer/TestDeleteDuplicates.java
index f856874..5b9179b 100644
--- a/src/test/org/apache/nutch/indexer/TestDeleteDuplicates.java
+++ b/src/test/org/apache/nutch/indexer/TestDeleteDuplicates.java
@@ -57,7 +57,7 @@
   private Path createIndex(String name, boolean hashDup, float inc, long time, boolean incFirst) throws Exception {
     Path idx = new Path(root, name);
     Path sub = new Path(idx, "part-0000");
-    Directory dir = FSDirectory.getDirectory(sub.toString(), true);
+    Directory dir = FSDirectory.getDirectory(sub.toString());
     IndexWriter writer = new IndexWriter(dir, new NutchDocumentAnalyzer(conf), true);
     Document doc = makeDoc(name,
         MD5Hash.digest("1").toString(),
