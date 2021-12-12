diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/inline/InlineUtil.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/inline/InlineUtil.java
index c73a9bb..3b06207 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/inline/InlineUtil.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/inline/InlineUtil.java
@@ -36,7 +36,7 @@
     public static boolean isInlineLambdaParameter(@NotNull ParameterDescriptor valueParameterOrReceiver) {
         return !(valueParameterOrReceiver instanceof ValueParameterDescriptor
                  && ((ValueParameterDescriptor) valueParameterOrReceiver).isNoinline()) &&
-               FunctionTypesKt.isExactFunctionOrExtensionFunctionType(valueParameterOrReceiver.getOriginal().getType());
+               FunctionTypesKt.isFunctionType(valueParameterOrReceiver.getOriginal().getType());
     }
 
     public static boolean isInline(@Nullable DeclarationDescriptor descriptor) {
