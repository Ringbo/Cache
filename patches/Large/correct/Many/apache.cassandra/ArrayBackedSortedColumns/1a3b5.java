diff --git a/src/java/org/apache/cassandra/db/ArrayBackedSortedColumns.java b/src/java/org/apache/cassandra/db/ArrayBackedSortedColumns.java
index 34bc388..4a83901 100644
--- a/src/java/org/apache/cassandra/db/ArrayBackedSortedColumns.java
+++ b/src/java/org/apache/cassandra/db/ArrayBackedSortedColumns.java
@@ -94,7 +94,7 @@
         final Cell[] cells = new Cell[value.getColumnCount()];
         int i = 0;
         for (Cell cell : value)
-            cells[i++] = cell.localCopy(cfs, HeapAllocator.instance);
+            cells[i++] = cell.localCopy(HeapAllocator.instance);
         ColumnFamily r = new ArrayBackedSortedColumns(cfs.metadata, value.isInsertReversed(), cells, i, i);
         r.delete(value);
         return r;
