diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index c170491..0e80506 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -170,11 +170,11 @@
     }
   }
 
-  private HashMap<String, ASTNode> doPhase1GetAggregationsFromSelect(
+  private LinkedHashMap<String, ASTNode> doPhase1GetAggregationsFromSelect(
       ASTNode selExpr) {
     // Iterate over the selects search for aggregation Trees.
     // Use String as keys to eliminate duplicate trees.
-    HashMap<String, ASTNode> aggregationTrees = new HashMap<String, ASTNode>();
+    LinkedHashMap<String, ASTNode> aggregationTrees = new LinkedHashMap<String, ASTNode>();
     for (int i = 0; i < selExpr.getChildCount(); ++i) {
       ASTNode sel = (ASTNode) selExpr.getChild(i).getChild(0);
       doPhase1GetAllAggregations(sel, aggregationTrees);
@@ -348,7 +348,7 @@
       case HiveParser.TOK_SELECT:
         qb.countSel();
         qbp.setSelExprForClause(ctx_1.dest, ast);
-        HashMap<String, ASTNode> aggregations = doPhase1GetAggregationsFromSelect(ast);
+        LinkedHashMap<String, ASTNode> aggregations = doPhase1GetAggregationsFromSelect(ast);
         qbp.setAggregationExprsForClause(ctx_1.dest, aggregations);
         qbp.setDistinctFuncExprForClause(ctx_1.dest,
             doPhase1GetDistinctFuncExpr(aggregations));
