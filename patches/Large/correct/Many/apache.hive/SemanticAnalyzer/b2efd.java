diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index 4ebdf90..e1a0c4a 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -9643,7 +9643,7 @@
          * as Join conditions
          */
         Set<String> dests = qb.getParseInfo().getClauseNames();
-        if ( dests.size() == 1 ) {
+        if ( dests.size() == 1 && joinTree.getNoOuterJoin()) {
           String dest = dests.iterator().next();
           ASTNode whereClause = qb.getParseInfo().getWhrForClause(dest);
           if ( whereClause != null ) {
