diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 0ec4c95..5534960 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -1880,7 +1880,7 @@
         }
 
         // Divisions may produce different results depending on operand types
-        if (isNumberCategory(getWrapper(leftRedirect)) && (DIVIDE == op || DIVIDE_EQUAL == op)) {
+        if (isNumberCategory(getWrapper(rightRedirect)) && (isNumberCategory(getWrapper(leftRedirect)) && (DIVIDE == op || DIVIDE_EQUAL == op))) {
             if (isFloatingCategory(leftRedirect) || isFloatingCategory(rightRedirect)) {
                 if (!isPrimitiveType(leftRedirect) || !isPrimitiveType(rightRedirect)) {
                     return Double_TYPE;
@@ -1896,7 +1896,7 @@
                 return getGroupOperationResultType(leftRedirect, rightRedirect);
             }
         }
-        if (MOD == op || MOD_EQUAL==op) {
+        if (isNumberCategory(getWrapper(rightRedirect)) && isNumberCategory(getWrapper(leftRedirect)) && (MOD == op || MOD_EQUAL==op)) {
             return leftRedirect;
         }
 
