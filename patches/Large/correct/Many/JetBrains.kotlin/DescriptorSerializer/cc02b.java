diff --git a/compiler/frontend/serialization/src/org/jetbrains/jet/descriptors/serialization/DescriptorSerializer.java b/compiler/frontend/serialization/src/org/jetbrains/jet/descriptors/serialization/DescriptorSerializer.java
index ab09033..cfde7fb 100644
--- a/compiler/frontend/serialization/src/org/jetbrains/jet/descriptors/serialization/DescriptorSerializer.java
+++ b/compiler/frontend/serialization/src/org/jetbrains/jet/descriptors/serialization/DescriptorSerializer.java
@@ -158,7 +158,7 @@
 
             PropertySetterDescriptor setter = propertyDescriptor.getSetter();
             if (setter != null) {
-                hasGetter = true;
+                hasSetter = true;
                 int accessorFlags = getAccessorFlags(setter);
                 if (accessorFlags != propertyFlags) {
                     builder.setSetterFlags(accessorFlags);
