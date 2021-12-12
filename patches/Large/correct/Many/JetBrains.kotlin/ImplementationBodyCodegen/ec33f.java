diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java b/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java
index 282bc9a..3bf9a32 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java
@@ -224,7 +224,7 @@
         else {
             NamespaceDescriptor namespaceDescriptor = DescriptorUtils.getParentOfType(classDescriptor, NamespaceDescriptor.class);
             assert namespaceDescriptor != null : "Namespace descriptor should be present: " + classDescriptor.getName();
-            FqName namespaceQN = namespaceDescriptor.getQualifiedName();
+            FqName namespaceQN = namespaceDescriptor.getFqName();
             boolean isMultiFile = CodegenBinding.isMultiFileNamespace(state.getBindingContext(), namespaceQN);
             return isMultiFile
                    ? NamespaceCodegen.getNamespacePartInternalName(
