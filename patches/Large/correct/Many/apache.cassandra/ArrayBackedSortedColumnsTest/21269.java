diff --git a/test/unit/org/apache/cassandra/db/ArrayBackedSortedColumnsTest.java b/test/unit/org/apache/cassandra/db/ArrayBackedSortedColumnsTest.java
index 131a755..968fb93 100644
--- a/test/unit/org/apache/cassandra/db/ArrayBackedSortedColumnsTest.java
+++ b/test/unit/org/apache/cassandra/db/ArrayBackedSortedColumnsTest.java
@@ -223,7 +223,7 @@
         int[] values = new int[]{ 1, 2, 3, 5, 9, 15, 21, 22 };
 
         for (int i = 0; i < values.length; ++i)
-            map.addColumn(new Cell(type.makeCellName(values[i])));
+            map.addColumn(new BufferCell(type.makeCellName(values[i])));
 
         SearchIterator<CellName, Cell> iter = map.searchIterator();
         for (int i = 0 ; i < values.length ; i++)
