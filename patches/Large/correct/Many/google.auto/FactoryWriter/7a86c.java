diff --git a/factory/src/main/java/com/google/auto/factory/processor/FactoryWriter.java b/factory/src/main/java/com/google/auto/factory/processor/FactoryWriter.java
index 9ef5286..b2014f6 100644
--- a/factory/src/main/java/com/google/auto/factory/processor/FactoryWriter.java
+++ b/factory/src/main/java/com/google/auto/factory/processor/FactoryWriter.java
@@ -131,7 +131,7 @@
       writer.endMethod();
     }
 
-    for (ImplemetationMethodDescriptor methodDescriptor
+    for (ImplementationMethodDescriptor methodDescriptor
         : descriptor.implementationMethodDescriptors()) {
       writer.emitAnnotation(Override.class);
       writer.beginMethod(methodDescriptor.returnType(), methodDescriptor.name(),
