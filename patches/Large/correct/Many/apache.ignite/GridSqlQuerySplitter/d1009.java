diff --git a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/sql/GridSqlQuerySplitter.java b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/sql/GridSqlQuerySplitter.java
index 2bac505..26c6b08 100644
--- a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/sql/GridSqlQuerySplitter.java
+++ b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/sql/GridSqlQuerySplitter.java
@@ -1743,7 +1743,7 @@
 
         // If in SELECT clause we have a subquery expression with aggregate,
         // we should not split it. Run the whole subquery on MAP stage.
-        if (el instanceof GridSqlQuery)
+        if (el instanceof GridSqlSubquery)
             return false;
 
         for (int i = 0; i < el.size(); i++) {
