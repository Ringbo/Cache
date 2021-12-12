diff --git a/core/descriptors/src/org/jetbrains/jet/renderer/DescriptorRendererImpl.java b/core/descriptors/src/org/jetbrains/jet/renderer/DescriptorRendererImpl.java
index 92a168e..81f4c53 100644
--- a/core/descriptors/src/org/jetbrains/jet/renderer/DescriptorRendererImpl.java
+++ b/core/descriptors/src/org/jetbrains/jet/renderer/DescriptorRendererImpl.java
@@ -213,7 +213,7 @@
         if (type.isError()) {
             return type.toString();
         }
-        if (KotlinBuiltIns.getInstance().isFunctionOrExtensionFunctionType(type) && prettyFunctionTypes) {
+        if (KotlinBuiltIns.getInstance().isExactFunctionOrExtensionFunctionType(type) && prettyFunctionTypes) {
             return renderFunctionType(type);
         }
         return renderDefaultType(type);
