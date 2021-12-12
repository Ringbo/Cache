diff --git a/src/java/org/apache/cassandra/index/sasi/plan/QueryController.java b/src/java/org/apache/cassandra/index/sasi/plan/QueryController.java
index fa1181f..155cd4f 100644
--- a/src/java/org/apache/cassandra/index/sasi/plan/QueryController.java
+++ b/src/java/org/apache/cassandra/index/sasi/plan/QueryController.java
@@ -236,7 +236,7 @@
                 continue;
 
             Set<SSTableIndex> indexes = applyScope(view.match(e));
-            if (primaryIndexes.size() > indexes.size())
+            if (expression == null || primaryIndexes.size() > indexes.size())
             {
                 primaryIndexes = indexes;
                 expression = e;
