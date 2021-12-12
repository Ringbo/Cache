diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/inline/InlineCodegen.java b/compiler/backend/src/org/jetbrains/jet/codegen/inline/InlineCodegen.java
index 409cdb8..d52e80a 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/inline/InlineCodegen.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/inline/InlineCodegen.java
@@ -154,7 +154,7 @@
         MethodNode node;
         if (functionDescriptor instanceof DeserializedSimpleFunctionDescriptor) {
             VirtualFile file = InlineCodegenUtil.getVirtualFileForCallable((DeserializedSimpleFunctionDescriptor) functionDescriptor, state);
-            node = InlineCodegenUtil.getMethodNode(file.getInputStream(), asmMethod.getName(), asmMethod.getDescriptor());
+            node = InlineCodegenUtil.getMethodNode(file.contentsToByteArray(), asmMethod.getName(), asmMethod.getDescriptor());
 
             if (node == null) {
                 throw new RuntimeException("Couldn't obtain compiled function body for " + descriptorName(functionDescriptor));
