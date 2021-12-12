diff --git a/source/com/intellij/xml/impl/schema/XmlAttributeDescriptorImpl.java b/source/com/intellij/xml/impl/schema/XmlAttributeDescriptorImpl.java
index 31556ba..4ddfea9 100644
--- a/source/com/intellij/xml/impl/schema/XmlAttributeDescriptorImpl.java
+++ b/source/com/intellij/xml/impl/schema/XmlAttributeDescriptorImpl.java
@@ -52,7 +52,7 @@
     final String attributeValue = myTag.getAttributeValue("type");
 
     if (attributeValue!=null) {
-      if (type.endsWith(type)) {
+      if (attributeValue.endsWith(type)) {
         final String namespacePrefix = myTag.getNamespacePrefix();
 
         if (namespacePrefix.length() > 0) {
