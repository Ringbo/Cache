diff --git a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
index 3a96c3c..3ffa986 100644
--- a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
+++ b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
@@ -71,7 +71,7 @@
           if(checkElementNameEquivalence(localName, namespace, name, tag)) {
             final CachedValue<XmlElementDescriptor> cachedValue = tag.getManager().getCachedValuesManager().createCachedValue(new CachedValueProvider<XmlElementDescriptor>() {
               public Result<XmlElementDescriptor> compute() {
-                final XmlElementDescriptorImpl xmlElementDescriptor = createElementDescriptor(tag);
+                final XmlElementDescriptor xmlElementDescriptor = createElementDescriptor(tag);
                 return new Result<XmlElementDescriptor>(xmlElementDescriptor, xmlElementDescriptor.getDependences());
               }
             },false);
@@ -108,7 +108,7 @@
     return null;
   }
 
-  protected XmlElementDescriptorImpl createElementDescriptor(final XmlTag tag) {
+  protected XmlElementDescriptor createElementDescriptor(final XmlTag tag) {
     return new XmlElementDescriptorImpl(tag);
   }
 
