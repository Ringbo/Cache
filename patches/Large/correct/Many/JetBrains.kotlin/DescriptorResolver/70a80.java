diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
index 11131cb..2a02961 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/DescriptorResolver.java
@@ -348,7 +348,7 @@
     }
 
     public static ConstructorDescriptorImpl createPrimaryConstructorForObject(
-            @NotNull PsiElement object,
+            @Nullable PsiElement object,
             @NotNull ClassDescriptor classDescriptor,
             @NotNull BindingTrace trace
     ) {
