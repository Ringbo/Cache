diff --git a/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java b/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
index cc4fbfd..1f181b7 100644
--- a/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
+++ b/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
@@ -512,7 +512,7 @@
                 if(attributeDescriptor != null){
                   final CachedValue<XmlAttributeDescriptor> value = CachedValuesManager.getManager(includedDocument.getProject()).createCachedValue(
                     () -> {
-                      Object[] deps = this.getDependencies();
+                      Object[] deps = attributeDescriptor.getDependencies();
                       if (deps.length == 0) {
                         LOG.error(attributeDescriptor + " (" + attributeDescriptor.getClass() + ") returned no dependencies");
                       }
