diff --git a/lucene/core/src/test/org/apache/lucene/util/TestDocIdSetBuilder.java b/lucene/core/src/test/org/apache/lucene/util/TestDocIdSetBuilder.java
index 9ea581e..d40d1c6 100644
--- a/lucene/core/src/test/org/apache/lucene/util/TestDocIdSetBuilder.java
+++ b/lucene/core/src/test/org/apache/lucene/util/TestDocIdSetBuilder.java
@@ -76,7 +76,7 @@
       builder.or(new RoaringDocIdSet.Builder(maxDoc).add(doc).build().iterator());
     }
     for (int i = 0; i < numIterators; ++i) {
-      final int baseInc = 2 + random().nextInt(10000);
+      final int baseInc = 2 + random().nextInt(10);
       RoaringDocIdSet.Builder b = new RoaringDocIdSet.Builder(maxDoc);
       for (int doc = random().nextInt(10000); doc < maxDoc; doc += baseInc + random().nextInt(2000)) {
         b.add(doc);
