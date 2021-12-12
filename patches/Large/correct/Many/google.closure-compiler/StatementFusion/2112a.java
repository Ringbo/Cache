diff --git a/src/com/google/javascript/jscomp/StatementFusion.java b/src/com/google/javascript/jscomp/StatementFusion.java
index 00410d8..4f403f2 100644
--- a/src/com/google/javascript/jscomp/StatementFusion.java
+++ b/src/com/google/javascript/jscomp/StatementFusion.java
@@ -197,14 +197,14 @@
       case Token.SWITCH:
       case Token.EXPR_RESULT:
         before.getParent().removeChild(before);
-        fuseExpresssonIntoFirstChild(before.removeFirstChild(), control);
+        fuseExpressionIntoFirstChild(before.removeFirstChild(), control);
         return;
       case Token.FOR:
         before.getParent().removeChild(before);
         if (NodeUtil.isForIn(control)) {
-          fuseExpresssonIntoSecondChild(before.removeFirstChild(), control);
+          fuseExpressionIntoSecondChild(before.removeFirstChild(), control);
         } else {
-          fuseExpresssonIntoFirstChild(before.removeFirstChild(), control);
+          fuseExpressionIntoFirstChild(before.removeFirstChild(), control);
         }
         return;
       case Token.LABEL:
@@ -219,7 +219,7 @@
   }
 
   // exp1, exp1
-  protected static Node fuseExpressionIntoExpression(Node exp1, Node exp2) {
+  static Node fuseExpressionIntoExpression(Node exp1, Node exp2) {
     if (exp2.isEmpty()) {
       return exp1;
     }
@@ -244,13 +244,13 @@
     }
   }
 
-  protected static void fuseExpresssonIntoFirstChild(Node exp, Node stmt) {
+  protected static void fuseExpressionIntoFirstChild(Node exp, Node stmt) {
     Node val = stmt.removeFirstChild();
     Node comma = fuseExpressionIntoExpression(exp, val);
     stmt.addChildToFront(comma);
   }
 
-  protected static void fuseExpresssonIntoSecondChild(Node exp, Node stmt) {
+  protected static void fuseExpressionIntoSecondChild(Node exp, Node stmt) {
     Node val = stmt.removeChildAfter(stmt.getFirstChild());
     Node comma = fuseExpressionIntoExpression(exp, val);
     stmt.addChildAfter(comma, stmt.getFirstChild());
