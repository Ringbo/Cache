diff --git a/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java b/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java
index 3fbdd4f..a586891 100644
--- a/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java
+++ b/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java
@@ -401,7 +401,7 @@
         }
 
         public void renderClassDescriptor(ClassDescriptor descriptor, StringBuilder builder, String keyword) {
-            if (descriptor.getKind() != ClassKind.TRAIT) {
+            if (descriptor.getKind() != ClassKind.TRAIT && descriptor.getKind() != ClassKind.OBJECT) {
                 renderModality(descriptor.getModality(), builder);
             }
             builder.append(renderKeyword(keyword));
