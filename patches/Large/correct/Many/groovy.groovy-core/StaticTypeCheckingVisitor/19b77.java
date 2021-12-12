diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index b0e1c2e..0c314d2 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -153,7 +153,7 @@
         public void returnStatementAdded(final ReturnStatement returnStatement) {
             if (returnStatement.getExpression().equals(ConstantExpression.NULL)) return;
             ClassNode returnType = checkReturnType(returnStatement);
-            if (methodNode != null) {
+            if (methodNode != null && closureExpression==null) {
                 ClassNode mrt = methodNode.getReturnType();
                 if (!returnType.implementsInterface(mrt) && !returnType.isDerivedFrom(mrt)) {
                     // there's an implicit type conversion, like Object -> String
@@ -1366,7 +1366,7 @@
     private ClassNode checkReturnType(final ReturnStatement statement) {
         Expression expression = statement.getExpression();
         ClassNode type = getType(expression);
-        if (methodNode != null) {
+        if (methodNode != null && closureExpression==null) {
             if (!methodNode.isVoidMethod()
                     && !type.equals(void_WRAPPER_TYPE)
                     && !type.equals(VOID_TYPE)
