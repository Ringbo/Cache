diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/expression/ExpressionVisitor.java b/core-metadata/src/main/java/org/apache/kylin/metadata/expression/ExpressionVisitor.java
index 6fe703f..ee4cd9f 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/expression/ExpressionVisitor.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/expression/ExpressionVisitor.java
@@ -19,17 +19,17 @@
 package org.apache.kylin.metadata.expression;
 
 public interface ExpressionVisitor {
-    public TupleExpression visitNumber(NumberTupleExpression numExpr);
+    TupleExpression visitNumber(NumberTupleExpression numExpr);
 
-    public TupleExpression visitString(StringTupleExpression strExpr);
+    TupleExpression visitString(StringTupleExpression strExpr);
 
-    public TupleExpression visitColumn(ColumnTupleExpression colExpr);
+    TupleExpression visitColumn(ColumnTupleExpression colExpr);
 
-    public TupleExpression visitBinary(BinaryTupleExpression binaryExpr);
+    TupleExpression visitBinary(BinaryTupleExpression binaryExpr);
 
-    public TupleExpression visitCaseCall(CaseTupleExpression caseExpr);
+    TupleExpression visitCaseCall(CaseTupleExpression caseExpr);
 
-    public TupleExpression visitRexCall(RexCallTupleExpression rexCallExpr);
+    TupleExpression visitRexCall(RexCallTupleExpression rexCallExpr);
 
-    public TupleExpression visitNone(NoneTupleExpression noneExpr);
+    TupleExpression visitNone(NoneTupleExpression noneExpr);
 }
