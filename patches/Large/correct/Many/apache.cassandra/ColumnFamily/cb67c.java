diff --git a/src/java/org/apache/cassandra/db/ColumnFamily.java b/src/java/org/apache/cassandra/db/ColumnFamily.java
index d27a963..0b1e399 100644
--- a/src/java/org/apache/cassandra/db/ColumnFamily.java
+++ b/src/java/org/apache/cassandra/db/ColumnFamily.java
@@ -141,7 +141,7 @@
     }
 
     /**
-     * Same as addAll() but do a cloneMeShallow of SuperColumn if necessary to
+     * Same as addAll() but do a cloneMe of SuperColumn if necessary to
      * avoid keeping references to the structure (see #3957).
      */
     public void addAllWithSCCopy(ColumnFamily cf, Allocator allocator)
@@ -150,7 +150,7 @@
         {
             for (IColumn c : cf)
             {
-                columns.addColumn(((SuperColumn)c).cloneMeShallow(), allocator);
+                columns.addColumn(((SuperColumn)c).cloneMe(), allocator);
             }
             delete(cf);
         }
