diff --git a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
index e0dc4f5..8147003 100644
--- a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
+++ b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
@@ -94,7 +94,7 @@
             if (includedDocument != null) {
               final PsiMetaData data = includedDocument.getMetaData();
               if(data instanceof XmlNSDescriptorImpl){
-                final XmlElementDescriptor elementDescriptor = ((XmlNSDescriptorImpl)data).getElementDescriptor(localName, namespace);
+                final XmlElementDescriptor elementDescriptor = ((XmlNSDescriptorImpl)data).getElementDescriptor(localName, namespace,visited, reference);
                 if(elementDescriptor != null){
                   final CachedValue<XmlElementDescriptor> value = includedDocument.getManager().getCachedValuesManager().createCachedValue(new CachedValueProvider<XmlElementDescriptor>(){
                     public Result<XmlElementDescriptor> compute() {
