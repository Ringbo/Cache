diff --git a/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java b/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java
index 9c1fece..2a22cc6 100644
--- a/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java
+++ b/src/java/org/apache/cassandra/db/columniterator/IndexedSliceReader.java
@@ -196,7 +196,7 @@
     {
         // See indexFor above.
         return sstable.metadata.isSuper() && sstable.descriptor.version.hasSuperColumns
-             ? CellNames.compositeDense(SuperColumns.scName(name))
+             ? CellNames.simpleDense(SuperColumns.scName(name))
              : name;
     }
 
