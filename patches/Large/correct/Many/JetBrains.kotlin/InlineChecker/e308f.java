diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/checkers/InlineChecker.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/checkers/InlineChecker.java
index 18d57fc..3501789 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/checkers/InlineChecker.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/checkers/InlineChecker.java
@@ -235,7 +235,7 @@
         boolean isInvoke =
                 descriptor.getName().equals(OperatorNameConventions.INVOKE) &&
                 containingDeclaration instanceof ClassDescriptor &&
-                FunctionTypesKt.isExactFunctionOrExtensionFunctionType(((ClassDescriptor) containingDeclaration).getDefaultType());
+                FunctionTypesKt.isFunctionType(((ClassDescriptor) containingDeclaration).getDefaultType());
 
         return isInvoke || InlineUtil.isInline(descriptor);
     }
