diff --git a/src/com/goide/inspections/GoInspectionUtil.java b/src/com/goide/inspections/GoInspectionUtil.java
index 0eaaa77..91932cf 100644
--- a/src/com/goide/inspections/GoInspectionUtil.java
+++ b/src/com/goide/inspections/GoInspectionUtil.java
@@ -30,7 +30,7 @@
 
   public static int getExpressionResultCount(GoExpression call) {
     if (call instanceof GoLiteral || call instanceof GoBinaryExpr || call instanceof GoParenthesesExpr ||
-        (call instanceof GoUnaryExpr && ((GoUnaryExpr)call).getSendChannel() == null)) {
+        (call instanceof GoUnaryExpr && ((GoUnaryExpr)call).getSendChannel() == null) || call instanceof GoBuiltinCallExpr) {
       return 1;
     }
     else if (call instanceof GoTypeAssertionExpr) {
