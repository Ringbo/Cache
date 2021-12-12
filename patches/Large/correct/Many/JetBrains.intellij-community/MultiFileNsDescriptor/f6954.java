diff --git a/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/MultiFileNsDescriptor.java b/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/MultiFileNsDescriptor.java
index 1a2b8f1..d5af75b 100644
--- a/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/MultiFileNsDescriptor.java
+++ b/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/MultiFileNsDescriptor.java
@@ -80,7 +80,7 @@
   @NotNull
   @Override
   public Object[] getDependencies() {
-    return myDescriptors.stream().flatMap(descriptor -> Arrays.stream(this.getDependencies())).toArray();
+    return myDescriptors.stream().flatMap(descriptor -> Arrays.stream(descriptor.getDependencies())).toArray();
   }
 
   @Nullable
