diff --git a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
index 140f189..f060947 100644
--- a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
+++ b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
@@ -1427,7 +1427,7 @@
         if (owner instanceof ClassDescriptor) {
             ClassDescriptor classDescriptor = (ClassDescriptor) owner;
 
-            OverrideResolver.generateOverridesInFunctionGroup(propertyName, null, propertiesFromSupertypes, propertiesFromCurrent, classDescriptor,
+            OverrideResolver.generateOverridesInFunctionGroup(propertyName, propertiesFromSupertypes, propertiesFromCurrent, classDescriptor,
                                                               new OverrideResolver.DescriptorSink() {
                 @Override
                 public void addToScope(@NotNull CallableMemberDescriptor fakeOverride) {
@@ -1467,7 +1467,7 @@
 
             Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(scopeData, methodName);
 
-            OverrideResolver.generateOverridesInFunctionGroup(methodName, null, functionsFromSupertypes, functionsFromCurrent, classDescriptor,
+            OverrideResolver.generateOverridesInFunctionGroup(methodName, functionsFromSupertypes, functionsFromCurrent, classDescriptor,
                                                               new OverrideResolver.DescriptorSink() {
                 @Override
                 public void addToScope(@NotNull CallableMemberDescriptor fakeOverride) {
