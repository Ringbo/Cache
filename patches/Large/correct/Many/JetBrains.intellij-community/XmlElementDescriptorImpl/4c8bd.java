diff --git a/xml/impl/src/com/intellij/xml/impl/dtd/XmlElementDescriptorImpl.java b/xml/impl/src/com/intellij/xml/impl/dtd/XmlElementDescriptorImpl.java
index 711bd0d..6a629e4 100644
--- a/xml/impl/src/com/intellij/xml/impl/dtd/XmlElementDescriptorImpl.java
+++ b/xml/impl/src/com/intellij/xml/impl/dtd/XmlElementDescriptorImpl.java
@@ -105,7 +105,7 @@
 
   // Read-only action
   protected final XmlElementDescriptor[] doCollectXmlDescriptors(final XmlTag context) {
-    final Set<XmlElementDescriptor> result = new HashSet<XmlElementDescriptor>();
+    final LinkedHashSet<XmlElementDescriptor> result = new LinkedHashSet<XmlElementDescriptor>();
     final XmlElementContentSpec contentSpecElement = myElementDecl.getContentSpecElement();
     final XmlNSDescriptor nsDescriptor = getNSDescriptor();
     final XmlNSDescriptor NSDescriptor = nsDescriptor != null? nsDescriptor:getNsDescriptorFrom(context);
