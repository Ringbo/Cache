diff --git a/lucene/spatial/src/test/org/apache/lucene/spatial/util/BaseGeoPointTestCase.java b/lucene/spatial/src/test/org/apache/lucene/spatial/util/BaseGeoPointTestCase.java
index e25266a..8b71236 100644
--- a/lucene/spatial/src/test/org/apache/lucene/spatial/util/BaseGeoPointTestCase.java
+++ b/lucene/spatial/src/test/org/apache/lucene/spatial/util/BaseGeoPointTestCase.java
@@ -969,9 +969,8 @@
     final IndexReader r = DirectoryReader.open(w);
     w.close();
 
-    // nocommit can we wrap again?
     // We can't wrap with "exotic" readers because points needs to work:
-    IndexSearcher s = newSearcher(r, false);
+    IndexSearcher s = newSearcher(r);
 
     final int iters = atLeast(75);
 
