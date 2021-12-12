diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/BodyResolver.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/BodyResolver.java
index 58d8c8b..5c68f8f 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/BodyResolver.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/BodyResolver.java
@@ -444,7 +444,7 @@
             if (classDescriptor != null) {
                 if (ErrorUtils.isError(classDescriptor)) continue;
 
-                if (FunctionTypesKt.isExactExtensionFunctionType(supertype)) {
+                if (FunctionTypesKt.isExtensionFunctionType(supertype)) {
                     trace.report(SUPERTYPE_IS_EXTENSION_FUNCTION_TYPE.on(typeReference));
                 }
 
