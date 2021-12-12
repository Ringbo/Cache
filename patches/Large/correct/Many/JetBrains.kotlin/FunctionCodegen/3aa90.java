diff --git a/idea/src/org/jetbrains/jet/codegen/FunctionCodegen.java b/idea/src/org/jetbrains/jet/codegen/FunctionCodegen.java
index 711044a..342963f 100644
--- a/idea/src/org/jetbrains/jet/codegen/FunctionCodegen.java
+++ b/idea/src/org/jetbrains/jet/codegen/FunctionCodegen.java
@@ -69,7 +69,7 @@
     private void generateReturn(MethodVisitor mv, JetExpression bodyExpression, ExpressionCodegen codegen) {
         if (!endsWithReturn(bodyExpression)) {
             final JetType expressionType = bindingContext.getExpressionType(bodyExpression);
-            if (expressionType.equals(JetStandardClasses.getUnitType())) {
+            if (expressionType == null || expressionType.equals(JetStandardClasses.getUnitType())) {
                 mv.visitInsn(Opcodes.RETURN);
             }
             else {
