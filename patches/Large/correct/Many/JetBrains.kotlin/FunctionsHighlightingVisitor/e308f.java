diff --git a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/FunctionsHighlightingVisitor.java b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/FunctionsHighlightingVisitor.java
index 56a0451..3371cd4 100644
--- a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/FunctionsHighlightingVisitor.java
+++ b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/FunctionsHighlightingVisitor.java
@@ -74,7 +74,7 @@
                 DeclarationDescriptor container = calleeDescriptor.getContainingDeclaration();
                 boolean containedInFunctionClassOrSubclass =
                         container instanceof ClassDescriptor &&
-                        FunctionTypesKt.isFunctionOrExtensionFunctionType(((ClassDescriptor) container).getDefaultType());
+                        FunctionTypesKt.isFunctionTypeOrSubtype(((ClassDescriptor) container).getDefaultType());
                 NameHighlighter.highlightName(holder, callee, containedInFunctionClassOrSubclass
                                                               ? KotlinHighlightingColors.VARIABLE_AS_FUNCTION_CALL
                                                               : KotlinHighlightingColors.VARIABLE_AS_FUNCTION_LIKE_CALL);
