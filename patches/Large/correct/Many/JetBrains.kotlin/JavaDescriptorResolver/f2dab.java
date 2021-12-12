diff --git a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
index ec63d42..140f189 100644
--- a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
+++ b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
@@ -1427,7 +1427,8 @@
         if (owner instanceof ClassDescriptor) {
             ClassDescriptor classDescriptor = (ClassDescriptor) owner;
 
-            OverrideResolver.generateOverridesInFunctionGroup(propertyName, null, propertiesFromSupertypes, propertiesFromCurrent, classDescriptor, null, new OverrideResolver.DescriptorSink() {
+            OverrideResolver.generateOverridesInFunctionGroup(propertyName, null, propertiesFromSupertypes, propertiesFromCurrent, classDescriptor,
+                                                              new OverrideResolver.DescriptorSink() {
                 @Override
                 public void addToScope(@NotNull CallableMemberDescriptor fakeOverride) {
                     properties.add((PropertyDescriptor) fakeOverride);
@@ -1466,7 +1467,8 @@
 
             Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(scopeData, methodName);
 
-            OverrideResolver.generateOverridesInFunctionGroup(methodName, null, functionsFromSupertypes, functionsFromCurrent, classDescriptor, null, new OverrideResolver.DescriptorSink() {
+            OverrideResolver.generateOverridesInFunctionGroup(methodName, null, functionsFromSupertypes, functionsFromCurrent, classDescriptor,
+                                                              new OverrideResolver.DescriptorSink() {
                 @Override
                 public void addToScope(@NotNull CallableMemberDescriptor fakeOverride) {
                     functions.add((FunctionDescriptor) fakeOverride);
