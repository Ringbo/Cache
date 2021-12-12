diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ClosureExpressionsTypingVisitor.java b/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ClosureExpressionsTypingVisitor.java
index 052ce5f..68c21d8 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ClosureExpressionsTypingVisitor.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/types/expressions/ClosureExpressionsTypingVisitor.java
@@ -215,7 +215,7 @@
         if (typeReference != null) {
             type = context.expressionTypingServices.getTypeResolver().resolveType(context.scope, typeReference, context.trace, true);
             if (expectedType != null) {
-                if (!JetTypeChecker.INSTANCE.isSubtypeOf(type, expectedType)) {
+                if (!JetTypeChecker.INSTANCE.isSubtypeOf(expectedType, type)) {
                     context.trace.report(EXPECTED_PARAMETER_TYPE_MISMATCH.on(declaredParameter, expectedType));
                 }
             }
@@ -280,7 +280,7 @@
             context.expressionTypingServices.checkFunctionReturnType(expression.getFunctionLiteral(), context.replaceScope(functionInnerScope).
                     replaceExpectedType(returnType).replaceBindingTrace(temporaryTrace), temporaryTrace);
             if (expectedReturnType != null) {
-                if (!JetTypeChecker.INSTANCE.isSubtypeOf(expectedReturnType, returnType)) {
+                if (!JetTypeChecker.INSTANCE.isSubtypeOf(returnType, expectedReturnType)) {
                     temporaryTrace.report(EXPECTED_RETURN_TYPE_MISMATCH.on(returnTypeRef, expectedReturnType));
                 }
             }
