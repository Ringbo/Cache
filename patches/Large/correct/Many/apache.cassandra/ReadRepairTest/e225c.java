diff --git a/test/unit/org/apache/cassandra/service/reads/repair/ReadRepairTest.java b/test/unit/org/apache/cassandra/service/reads/repair/ReadRepairTest.java
index 75d6e83..9f06bb2 100644
--- a/test/unit/org/apache/cassandra/service/reads/repair/ReadRepairTest.java
+++ b/test/unit/org/apache/cassandra/service/reads/repair/ReadRepairTest.java
@@ -157,7 +157,7 @@
 
     private static Mutation mutation(Cell... cells)
     {
-        Row.Builder builder = BTreeRow.unsortedBuilder(0);
+        Row.Builder builder = BTreeRow.unsortedBuilder();
         builder.newRow(Clustering.EMPTY);
         for (Cell cell: cells)
         {
