diff --git a/src/java/org/apache/cassandra/cql/QueryProcessor.java b/src/java/org/apache/cassandra/cql/QueryProcessor.java
index 166f088..2caef8d 100644
--- a/src/java/org/apache/cassandra/cql/QueryProcessor.java
+++ b/src/java/org/apache/cassandra/cql/QueryProcessor.java
@@ -203,7 +203,7 @@
         // if start key was set and relation was "greater than"
         if (select.getKeyStart() != null && !select.includeStartKey() && !rows.isEmpty())
         {
-            if (rows.get(0).key.key.equals(startKey))
+            if (rows.get(0).key.key.equals(startKeyBytes))
                 rows.remove(0);
         }
 
@@ -211,7 +211,7 @@
         if (select.getKeyFinish() != null && !select.includeFinishKey() && !rows.isEmpty())
         {
             int lastIndex = rows.size() - 1;
-            if (rows.get(lastIndex).key.key.equals(finishKey))
+            if (rows.get(lastIndex).key.key.equals(finishKeyBytes))
                 rows.remove(lastIndex);
         }
 
