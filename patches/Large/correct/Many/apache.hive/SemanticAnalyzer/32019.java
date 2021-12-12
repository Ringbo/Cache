diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index 48d334a..3c83a7c 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -12423,7 +12423,7 @@
                   + " does not have the field " + field));
         }
         if (!lInfo.getInternalName().equals(rInfo.getInternalName())) {
-          throw new SemanticException(generateErrorMessage(tabref,
+          throw new OptiqSemanticException(generateErrorMessage(tabref,
               "Schema of both sides of union should match: field " + field + ":"
                   + " appears on the left side of the UNION at column position: "
                   + getPositionFromInternalName(lInfo.getInternalName())
@@ -12435,7 +12435,7 @@
         TypeInfo commonTypeInfo = FunctionRegistry.getCommonClassForUnionAll(lInfo.getType(),
             rInfo.getType());
         if (commonTypeInfo == null) {
-          throw new SemanticException(generateErrorMessage(tabref,
+          throw new OptiqSemanticException(generateErrorMessage(tabref,
               "Schema of both sides of union should match: Column " + field + " is of type "
                   + lInfo.getType().getTypeName() + " on first table and type "
                   + rInfo.getType().getTypeName() + " on second table"));
@@ -13293,7 +13293,7 @@
                 grpbyExpr, new TypeCheckCtx(groupByInputRowResolver));
             ExprNodeDesc grpbyExprNDesc = astToExprNDescMap.get(grpbyExpr);
             if (grpbyExprNDesc == null)
-              throw new RuntimeException("Invalid Column Reference: " + grpbyExpr.dump());
+              throw new OptiqSemanticException("Invalid Column Reference: " + grpbyExpr.dump());
 
             addToGBExpr(groupByOutputRowResolver, groupByInputRowResolver, grpbyExpr,
                 grpbyExprNDesc, gbExprNDescLst, outputColumnNames);
