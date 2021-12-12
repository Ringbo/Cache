diff --git a/core/descriptors/src/org/jetbrains/kotlin/types/AbstractClassTypeConstructor.java b/core/descriptors/src/org/jetbrains/kotlin/types/AbstractClassTypeConstructor.java
index f6a75b7..06d6842 100644
--- a/core/descriptors/src/org/jetbrains/kotlin/types/AbstractClassTypeConstructor.java
+++ b/core/descriptors/src/org/jetbrains/kotlin/types/AbstractClassTypeConstructor.java
@@ -39,7 +39,7 @@
         if (currentHashCode != 0) return currentHashCode;
 
         ClassifierDescriptor descriptor = getDeclarationDescriptor();
-        if (descriptor instanceof ClassDescriptor && hasMeaningfulFqName(descriptor)) {
+        if (hasMeaningfulFqName(descriptor)) {
             currentHashCode = DescriptorUtils.getFqName(descriptor).hashCode();
         }
         else {
@@ -51,7 +51,7 @@
 
     @NotNull
     @Override
-    public abstract ClassifierDescriptor getDeclarationDescriptor();
+    public abstract ClassDescriptor getDeclarationDescriptor();
 
     @NotNull
     @Override
@@ -81,7 +81,7 @@
             return false;
         }
 
-        if (myDescriptor instanceof ClassDescriptor && otherDescriptor instanceof ClassDescriptor) {
+        if (otherDescriptor instanceof ClassDescriptor) {
             return areFqNamesEqual(((ClassDescriptor) myDescriptor), ((ClassDescriptor) otherDescriptor));
         }
 
