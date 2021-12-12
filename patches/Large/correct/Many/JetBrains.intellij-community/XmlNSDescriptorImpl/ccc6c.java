diff --git a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
index aea5ca6..069050d 100644
--- a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
+++ b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
@@ -169,9 +169,10 @@
     XmlNSDescriptorImpl nsDescriptor = (XmlNSDescriptorImpl)myTag.getNSDescriptor(namespace, true);
 
     if (nsDescriptor != this && nsDescriptor != null) {
-      return nsDescriptor.getAttribute(
+      return nsDescriptor.getAttributeImpl(
         localName,
-        namespace
+        namespace,
+        visited
       );
     }
 
