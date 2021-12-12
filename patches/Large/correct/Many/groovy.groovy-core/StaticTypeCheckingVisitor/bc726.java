diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index ccb141c..d7ff488 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -1612,7 +1612,7 @@
         ClassNode rightRedirect = right.redirect();
 
         Expression leftExpression = expr.getLeftExpression();
-        if (op == ASSIGN) {
+        if (op == ASSIGN || op == ASSIGNMENT_OPERATOR) {
             if (leftRedirect.isArray() && !rightRedirect.isArray()) return leftRedirect;
             if (leftRedirect.implementsInterface(Collection_TYPE) && rightRedirect.implementsInterface(Collection_TYPE)) {
                 // because of type inferrence, we must perform an additional check if the right expression
