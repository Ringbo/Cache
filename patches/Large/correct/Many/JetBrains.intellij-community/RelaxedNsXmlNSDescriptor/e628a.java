diff --git a/source/com/intellij/jsp/impl/RelaxedNsXmlNSDescriptor.java b/source/com/intellij/jsp/impl/RelaxedNsXmlNSDescriptor.java
index b002db9..21ecd58 100644
--- a/source/com/intellij/jsp/impl/RelaxedNsXmlNSDescriptor.java
+++ b/source/com/intellij/jsp/impl/RelaxedNsXmlNSDescriptor.java
@@ -23,7 +23,7 @@
     return elementDescriptor;
   }
 
-  protected XmlElementDescriptorImpl createElementDescriptor(final XmlTag tag) {
+  protected XmlElementDescriptor createElementDescriptor(final XmlTag tag) {
     return new RelaxedNsXmlElementDescriptor(tag);
   }
 
