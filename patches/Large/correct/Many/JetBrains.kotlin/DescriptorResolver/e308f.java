diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
index f94f999..30b9371 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
@@ -612,7 +612,7 @@
         if (DynamicTypesKt.isDynamic(upperBoundType)) {
             trace.report(DYNAMIC_UPPER_BOUND.on(upperBound));
         }
-        if (FunctionTypesKt.isExactExtensionFunctionType(upperBoundType)) {
+        if (FunctionTypesKt.isExtensionFunctionType(upperBoundType)) {
             trace.report(UPPER_BOUND_IS_EXTENSION_FUNCTION_TYPE.on(upperBound));
         }
     }
