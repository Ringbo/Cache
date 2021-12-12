diff --git a/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java b/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java
index 2a22cc6..22fe5fa 100644
--- a/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java
+++ b/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java
@@ -186,7 +186,7 @@
         if (sstable.metadata.isSuper() && sstable.descriptor.version.hasSuperColumns)
         {
             CellNameType scComparator = SuperColumns.scNameType(comparator);
-            Composite scName = CellNames.compositeDense(SuperColumns.scName(name));
+            Composite scName = CellNames.simpleDense(SuperColumns.scName(name));
             return IndexHelper.indexFor(scName, indexes, scComparator, reversed, startIdx);
         }
         return IndexHelper.indexFor(name, indexes, comparator, reversed, startIdx);
