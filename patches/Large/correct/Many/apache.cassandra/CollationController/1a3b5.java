diff --git a/src/java/org/apache/cassandra/db/CollationController.java b/src/java/org/apache/cassandra/db/CollationController.java
index e839ac1..151a7c5 100644
--- a/src/java/org/apache/cassandra/db/CollationController.java
+++ b/src/java/org/apache/cassandra/db/CollationController.java
@@ -86,7 +86,7 @@
                     {
                         OnDiskAtom atom = iter.next();
                         if (copyOnHeap)
-                            atom = ((Cell) atom).localCopy(cfs, HeapAllocator.instance);
+                            atom = ((Cell) atom).localCopy(HeapAllocator.instance);
                         container.addAtom(atom);
                     }
                 }
@@ -205,7 +205,7 @@
                         ColumnFamily newCf = cf.cloneMeShallow(ArrayBackedSortedColumns.factory, false);
                         for (Cell cell : cf)
                         {
-                            newCf.addColumn(cell.localCopy(cfs, HeapAllocator.instance));
+                            newCf.addColumn(cell.localCopy(HeapAllocator.instance));
                         }
                         cf = newCf;
                         iter = filter.getColumnFamilyIterator(cf);
