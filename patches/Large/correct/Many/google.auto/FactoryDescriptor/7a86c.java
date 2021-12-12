diff --git a/factory/src/main/java/com/google/auto/factory/processor/FactoryDescriptor.java b/factory/src/main/java/com/google/auto/factory/processor/FactoryDescriptor.java
index c3649f2..230f452 100644
--- a/factory/src/main/java/com/google/auto/factory/processor/FactoryDescriptor.java
+++ b/factory/src/main/java/com/google/auto/factory/processor/FactoryDescriptor.java
@@ -45,12 +45,12 @@
   private final ImmutableSortedSet<String> implementingTypes;
   private final boolean publicType;
   private final ImmutableSet<FactoryMethodDescriptor> methodDescriptors;
-  private final ImmutableSet<ImplemetationMethodDescriptor> implementationMethodDescriptors;
+  private final ImmutableSet<ImplementationMethodDescriptor> implementationMethodDescriptors;
   private final ImmutableMap<Key, String> providerNames;
 
   FactoryDescriptor(String name, String extendingType, ImmutableSortedSet<String> implementingTypes,
       boolean publicType, ImmutableSet<FactoryMethodDescriptor> methodDescriptors,
-      ImmutableSet<ImplemetationMethodDescriptor> implementationMethodDescriptors) {
+      ImmutableSet<ImplementationMethodDescriptor> implementationMethodDescriptors) {
     this.name = checkNotNull(name);
     this.extendingType = checkNotNull(extendingType);
     this.implementingTypes = checkNotNull(implementingTypes);
@@ -101,7 +101,7 @@
     return methodDescriptors;
   }
 
-  ImmutableSet<ImplemetationMethodDescriptor> implementationMethodDescriptors() {
+  ImmutableSet<ImplementationMethodDescriptor> implementationMethodDescriptors() {
     return implementationMethodDescriptors;
   }
 
