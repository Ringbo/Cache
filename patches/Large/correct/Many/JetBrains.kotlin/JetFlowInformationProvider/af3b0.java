diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/cfg/JetFlowInformationProvider.java b/compiler/frontend/src/org/jetbrains/jet/lang/cfg/JetFlowInformationProvider.java
index 8050efe..21c0223 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/cfg/JetFlowInformationProvider.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/cfg/JetFlowInformationProvider.java
@@ -530,7 +530,7 @@
                             }
                         }
                         else if (element instanceof JetPostfixExpression) {
-                            IElementType operationToken = ((JetPostfixExpression) element).getOperationSign().getReferencedNameElementType();
+                            IElementType operationToken = ((JetPostfixExpression) element).getOperationReference().getReferencedNameElementType();
                             if (operationToken == JetTokens.PLUSPLUS || operationToken == JetTokens.MINUSMINUS) {
                                 trace.report(Errors.UNUSED_CHANGED_VALUE.on(element, element));
                             }
