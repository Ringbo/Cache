diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/QBParseInfo.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/QBParseInfo.java
index 15c3467..af62c87 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/QBParseInfo.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/QBParseInfo.java
@@ -58,7 +58,7 @@
   private int outerQueryLimit;
 
   // used by GroupBy
-  private HashMap<String, HashMap<String, ASTNode> > destToAggregationExprs;
+  private LinkedHashMap<String, LinkedHashMap<String, ASTNode> > destToAggregationExprs;
   private HashMap<String, ASTNode> destToDistinctFuncExpr;
 
   @SuppressWarnings("unused")
@@ -76,7 +76,7 @@
     this.destToSortby = new HashMap<String, ASTNode>();
     this.destToLimit = new HashMap<String, Integer>();
     
-    this.destToAggregationExprs = new HashMap<String, HashMap<String, ASTNode> >();
+    this.destToAggregationExprs = new LinkedHashMap<String, LinkedHashMap<String, ASTNode> >();
     this.destToDistinctFuncExpr = new HashMap<String, ASTNode>();
     
     this.alias = alias;
@@ -84,7 +84,7 @@
     this.outerQueryLimit = -1;
   }
 
-  public void setAggregationExprsForClause(String clause, HashMap<String, ASTNode> aggregationTrees) {
+  public void setAggregationExprsForClause(String clause, LinkedHashMap<String, ASTNode> aggregationTrees) {
     this.destToAggregationExprs.put(clause, aggregationTrees);
   }
 
@@ -273,7 +273,7 @@
        (!destToClusterby.isEmpty()))
       return false;
     
-    Iterator<Map.Entry<String, HashMap<String, ASTNode>>> aggrIter = destToAggregationExprs.entrySet().iterator();
+    Iterator<Map.Entry<String, LinkedHashMap<String, ASTNode>>> aggrIter = destToAggregationExprs.entrySet().iterator();
     while (aggrIter.hasNext()) {
       HashMap<String, ASTNode> h = aggrIter.next().getValue();
       if ((h != null) && (!h.isEmpty()))
