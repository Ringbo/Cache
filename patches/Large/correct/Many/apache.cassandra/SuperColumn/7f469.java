diff --git a/src/java/org/apache/cassandra/db/SuperColumn.java b/src/java/org/apache/cassandra/db/SuperColumn.java
index 8089d59..67d1d71 100644
--- a/src/java/org/apache/cassandra/db/SuperColumn.java
+++ b/src/java/org/apache/cassandra/db/SuperColumn.java
@@ -144,7 +144,7 @@
         long max = Long.MIN_VALUE;
         for (IColumn column : getSubColumns())
         {
-            if (column.isMarkedForDelete() && column.timestamp() > max)
+            if (!column.isMarkedForDelete() && column.timestamp() > max)
             {
                 max = column.timestamp();
             }
