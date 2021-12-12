diff --git a/src/java/org/apache/cassandra/db/AbstractRangeCommand.java b/src/java/org/apache/cassandra/db/AbstractRangeCommand.java
index 959b524..8bcb5b3 100644
--- a/src/java/org/apache/cassandra/db/AbstractRangeCommand.java
+++ b/src/java/org/apache/cassandra/db/AbstractRangeCommand.java
@@ -62,7 +62,7 @@
 
     private List<Row> trim(List<Row> rows)
     {
-        if (countCQL3Rows())
+        if (countCQL3Rows() || ignoredTombstonedPartitions())
             return rows;
         else
             return rows.size() > limit() ? rows.subList(0, limit()) : rows;
