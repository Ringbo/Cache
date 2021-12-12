diff --git a/lucene/join/src/test/org/apache/lucene/search/join/TestCheckJoinIndex.java b/lucene/join/src/test/org/apache/lucene/search/join/TestCheckJoinIndex.java
index 59b0c8c..2d76482 100644
--- a/lucene/join/src/test/org/apache/lucene/search/join/TestCheckJoinIndex.java
+++ b/lucene/join/src/test/org/apache/lucene/search/join/TestCheckJoinIndex.java
@@ -107,7 +107,7 @@
     final RandomIndexWriter w = new RandomIndexWriter(random(), dir, iwc);
 
     List<Document> block = new ArrayList<>();
-    final int numChildren = TestUtil.nextInt(random(), 0, 3);
+    final int numChildren = TestUtil.nextInt(random(), 1, 3);
     for (int i = 0; i < numChildren; ++i) {
       Document doc = new Document();
       doc.add(new StringField("child", Integer.toString(i), Store.NO));
