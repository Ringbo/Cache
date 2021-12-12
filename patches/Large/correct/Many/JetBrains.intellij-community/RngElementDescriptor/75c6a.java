diff --git a/xml/relaxng/src/org/intellij/plugins/relaxNG/model/descriptors/RngElementDescriptor.java b/xml/relaxng/src/org/intellij/plugins/relaxNG/model/descriptors/RngElementDescriptor.java
index c4d6047..abdfb18 100644
--- a/xml/relaxng/src/org/intellij/plugins/relaxNG/model/descriptors/RngElementDescriptor.java
+++ b/xml/relaxng/src/org/intellij/plugins/relaxNG/model/descriptors/RngElementDescriptor.java
@@ -110,7 +110,7 @@
       @Override
       public CachedValueProvider.Result<XmlElementDescriptor> compute(RngElementDescriptor p) {
         final XmlElementDescriptor descriptor = p.findElementDescriptor(childTag);
-        return CachedValueProvider.Result.create(descriptor, RngElementDescriptor.this.getDependencies(), childTag);
+        return CachedValueProvider.Result.create(descriptor, p.getDependencies(), childTag);
       }
     });
     return value == NULL ? null : value;
@@ -123,7 +123,7 @@
         @Override
         public CachedValueProvider.Result<XmlAttributeDescriptor[]> compute(RngElementDescriptor p) {
           final XmlAttributeDescriptor[] value = p.collectAttributeDescriptors(context);
-          return CachedValueProvider.Result.create(value, RngElementDescriptor.this.getDependencies(), context);
+          return CachedValueProvider.Result.create(value, p.getDependencies(), context);
         }
       });
     } else {
