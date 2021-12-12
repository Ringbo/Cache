diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/lazy/descriptors/LazyClassDescriptor.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/lazy/descriptors/LazyClassDescriptor.java
index e58a141..cad3b30 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/lazy/descriptors/LazyClassDescriptor.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/lazy/descriptors/LazyClassDescriptor.java
@@ -662,7 +662,7 @@
 
         @Override
         @NotNull
-        public ClassifierDescriptor getDeclarationDescriptor() {
+        public ClassDescriptor getDeclarationDescriptor() {
             return LazyClassDescriptor.this;
         }
 
