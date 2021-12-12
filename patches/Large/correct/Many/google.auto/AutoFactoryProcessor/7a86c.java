diff --git a/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java b/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java
index d9a3a7b..9c20e8c 100644
--- a/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java
+++ b/factory/src/main/java/com/google/auto/factory/processor/AutoFactoryProcessor.java
@@ -94,7 +94,7 @@
 
     ImmutableListMultimap.Builder<String, FactoryMethodDescriptor> indexedMethods =
         ImmutableListMultimap.builder();
-    ImmutableSet.Builder<ImplemetationMethodDescriptor> implemetationMethodDescriptors =
+    ImmutableSet.Builder<ImplementationMethodDescriptor> implementationMethodDescriptors =
         ImmutableSet.builder();
     for (Element element : roundEnv.getElementsAnnotatedWith(AutoFactory.class)) {
       Optional<AutoFactoryDeclaration> declaration = declarationFactory.createIfValid(element);
@@ -106,7 +106,7 @@
           if (supertypeMethod.getModifiers().contains(Modifier.ABSTRACT)) {
             ExecutableType methodType = Elements2.getExecutableElementAsMemberOf(
                 types, supertypeMethod, extendingType);
-            implemetationMethodDescriptors.add(new ImplemetationMethodDescriptor.Builder()
+            implementationMethodDescriptors.add(new ImplementationMethodDescriptor.Builder()
                 .name(supertypeMethod.getSimpleName().toString())
                 .returnType(getAnnotatedType(element).getQualifiedName().toString())
                 .publicMethod()
@@ -122,7 +122,7 @@
             if (interfaceMethod.getModifiers().contains(Modifier.ABSTRACT)) {
               ExecutableType methodType = Elements2.getExecutableElementAsMemberOf(
                   types, interfaceMethod, implementingType);
-              implemetationMethodDescriptors.add(new ImplemetationMethodDescriptor.Builder()
+              implementationMethodDescriptors.add(new ImplementationMethodDescriptor.Builder()
                   .name(interfaceMethod.getSimpleName().toString())
                   .returnType(getAnnotatedType(element).getQualifiedName().toString())
                   .publicMethod()
@@ -165,7 +165,7 @@
                 publicType,
                 ImmutableSet.copyOf(entry.getValue()),
                 // TODO(gak): this needs to be indexed too
-                implemetationMethodDescriptors.build()));
+                implementationMethodDescriptors.build()));
       } catch (IOException e) {
         messager.printMessage(Kind.ERROR, "failed");
       }
