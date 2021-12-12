diff --git a/common/src/main/java/org/apache/drill/common/expression/ExpressionStringBuilder.java b/common/src/main/java/org/apache/drill/common/expression/ExpressionStringBuilder.java
index 9301528..8026cdb 100644
--- a/common/src/main/java/org/apache/drill/common/expression/ExpressionStringBuilder.java
+++ b/common/src/main/java/org/apache/drill/common/expression/ExpressionStringBuilder.java
@@ -162,7 +162,7 @@
   @Override
   public Void visitIntervalYearConstant(IntervalYearExpression lExpr, StringBuilder sb) throws RuntimeException {
     sb.append("cast( '");
-    sb.append(Period.years(lExpr.getIntervalYear()).toString());
+    sb.append(Period.months(lExpr.getIntervalYear()).toString());
     sb.append("' as INTERVALYEAR)");
     return null;
   }
