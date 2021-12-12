diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index a32bfd5..6bb2c31 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -1528,7 +1528,9 @@
       boolean hasAsClause = (!isInTransform) && (child.getChildCount() == 2);
 
       // EXPR AS (ALIAS,...) parses, but is only allowed for UDTF's
-      if (!isUDTF && child.getChildCount() > 2) {
+      // This check is not needed and invalid when there is a transform b/c the 
+      // AST's are slightly different.
+      if (!isInTransform && !isUDTF && child.getChildCount() > 2) {
         throw new SemanticException(ErrorMsg.INVALID_AS.getMsg());
       }
 
