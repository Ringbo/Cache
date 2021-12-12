diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/QueryPlanner.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/QueryPlanner.java
index d054b5c..4b203e4 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/QueryPlanner.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/QueryPlanner.java
@@ -388,7 +388,7 @@
         boolean needPostProjectionCoercion = false;
         for (FunctionCall aggregate : analysis.getAggregates(node)) {
             Expression rewritten = subPlan.rewrite(aggregate);
-            Symbol newSymbol = symbolAllocator.newSymbol(rewritten, analysis.getTypeWithCoercions(aggregate));
+            Symbol newSymbol = symbolAllocator.newSymbol(rewritten, analysis.getType(aggregate));
 
             // TODO: this is a hack, because we apply coercions to the output of expressions, rather than the arguments to expressions.
             // Therefore we can end up with this implicit cast, and have to move it into a post-projection
@@ -567,7 +567,7 @@
 
             // Rewrite function call in terms of pre-projected inputs
             Expression rewritten = subPlan.rewrite(windowFunction);
-            Symbol newSymbol = symbolAllocator.newSymbol(rewritten, analysis.getTypeWithCoercions(windowFunction));
+            Symbol newSymbol = symbolAllocator.newSymbol(rewritten, analysis.getType(windowFunction));
 
             boolean needCoercion = rewritten instanceof Cast;
             // Strip out the cast and add it back as a post-projection
