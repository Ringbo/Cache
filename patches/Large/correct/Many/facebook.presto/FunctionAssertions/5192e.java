diff --git a/presto-main/src/test/java/com/facebook/presto/operator/scalar/FunctionAssertions.java b/presto-main/src/test/java/com/facebook/presto/operator/scalar/FunctionAssertions.java
index 9a140b8..e71db4f 100644
--- a/presto-main/src/test/java/com/facebook/presto/operator/scalar/FunctionAssertions.java
+++ b/presto-main/src/test/java/com/facebook/presto/operator/scalar/FunctionAssertions.java
@@ -461,7 +461,7 @@
         requireNonNull(projection, "projection is null");
 
         Expression projectionExpression = createExpression(session, projection, metadata, SYMBOL_TYPES);
-        RowExpression projectionRowExpression = toRowExpression(projectionExpression);
+        RowExpression projectionRowExpression = toRowExpression(session, projectionExpression);
         PageProcessor processor = compiler.compilePageProcessor(Optional.empty(), ImmutableList.of(projectionRowExpression)).get();
 
         // This is a heuristic to detect whether the retained size of cachedInstance is bounded.
@@ -572,7 +572,7 @@
         requireNonNull(projection, "projection is null");
 
         Expression projectionExpression = createExpression(session, projection, metadata, SYMBOL_TYPES);
-        RowExpression projectionRowExpression = toRowExpression(projectionExpression);
+        RowExpression projectionRowExpression = toRowExpression(session, projectionExpression);
 
         List<Object> results = new ArrayList<>();
 
@@ -623,11 +623,11 @@
         return results;
     }
 
-    private RowExpression toRowExpression(Expression projectionExpression)
+    private RowExpression toRowExpression(Session session, Expression projectionExpression)
     {
         Expression translatedProjection = new SymbolToInputRewriter(INPUT_MAPPING).rewrite(projectionExpression);
         Map<NodeRef<Expression>, Type> expressionTypes = getExpressionTypesFromInput(
-                TEST_SESSION,
+                session,
                 metadata,
                 SQL_PARSER,
                 INPUT_TYPES,
@@ -686,7 +686,7 @@
         requireNonNull(filter, "filter is null");
 
         Expression filterExpression = createExpression(session, filter, metadata, SYMBOL_TYPES);
-        RowExpression filterRowExpression = toRowExpression(filterExpression);
+        RowExpression filterRowExpression = toRowExpression(session, filterExpression);
 
         List<Boolean> results = new ArrayList<>();
 
