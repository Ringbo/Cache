diff --git a/src/java/org/apache/cassandra/db/ColumnFamilyStore.java b/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
index 983adc9..151564c 100644
--- a/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
+++ b/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
@@ -823,9 +823,7 @@
 
     public static ColumnFamily removeDeletedCF(ColumnFamily cf, int gcBefore)
     {
-        // in case of a timestamp tie, tombstones get priority over non-tombstones.
-        // (we want this to be deterministic to avoid confusion.)
-        if (cf.getColumnCount() == 0 && cf.getLocalDeletionTime() <= gcBefore)
+        if (cf.getColumnCount() == 0 && cf.getLocalDeletionTime() < gcBefore)
             return null;
 
         cf.maybeResetDeletionTimes(gcBefore);
@@ -867,7 +865,10 @@
             // remove columns if
             // (a) the column itself is tombstoned or
             // (b) the CF is tombstoned and the column is not newer than it
-            if ((c.isMarkedForDelete() && c.getLocalDeletionTime() <= gcBefore)
+            //
+            // Note that we need the inequality below for case (a) to be strict for expiring columns
+            // to work correctly  -- see the comment in ExpiringColumn.isMarkedForDelete().
+            if ((c.isMarkedForDelete() && c.getLocalDeletionTime() < gcBefore)
                 || c.timestamp() <= cf.getMarkedForDeleteAt())
             {
                 iter.remove();
@@ -893,12 +894,12 @@
                 // (a) the subcolumn itself is tombstoned or
                 // (b) the supercolumn is tombstoned and the subcolumn is not newer than it
                 if (subColumn.timestamp() <= minTimestamp
-                    || (subColumn.isMarkedForDelete() && subColumn.getLocalDeletionTime() <= gcBefore))
+                    || (subColumn.isMarkedForDelete() && subColumn.getLocalDeletionTime() < gcBefore))
                 {
                     subIter.remove();
                 }
             }
-            if (c.getSubColumns().isEmpty() && c.getLocalDeletionTime() <= gcBefore)
+            if (c.getSubColumns().isEmpty() && c.getLocalDeletionTime() < gcBefore)
             {
                 iter.remove();
             }
