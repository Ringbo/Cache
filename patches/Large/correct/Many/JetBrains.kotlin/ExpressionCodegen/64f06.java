diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/ExpressionCodegen.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/ExpressionCodegen.java
index 691828d..fdcf73f 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/ExpressionCodegen.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/ExpressionCodegen.java
@@ -3389,7 +3389,8 @@
     }
 
     private TypeAndNullability calcTypeForIEEE754ArithmeticIfNeeded(@Nullable KtExpression expression) {
-        return CodegenUtilKt.calcTypeForIEEE754ArithmeticIfNeeded(expression, bindingContext, context.getFunctionDescriptor());
+        return CodegenUtilKt.calcTypeForIEEE754ArithmeticIfNeeded(
+                expression, bindingContext, context.getFunctionDescriptor(), state.getLanguageVersionSettings());
     }
 
     private StackValue generateAssignmentExpression(KtBinaryExpression expression) {
