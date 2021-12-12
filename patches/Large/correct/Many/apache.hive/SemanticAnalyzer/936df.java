diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index 8f5542b..47feeaf 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -825,9 +825,9 @@
 
     qb.getParseInfo().setSrcForAlias(alias, tableTree);
 
-    // if alias to CTE contains the alias, we do not do the translation because
+    // if alias to CTE contains the table name, we do not do the translation because
     // cte is actually a subquery.
-    if (!this.aliasToCTEs.containsKey(alias)) {
+    if (!this.aliasToCTEs.containsKey(tabIdName)) {
       unparseTranslator.addTableNameTranslation(tableTree, SessionState.get().getCurrentDatabase());
       if (aliasIndex != 0) {
         unparseTranslator.addIdentifierTranslation((ASTNode) tabref.getChild(aliasIndex));
