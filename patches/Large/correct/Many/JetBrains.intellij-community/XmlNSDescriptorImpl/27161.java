diff --git a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
index 16c7a53..b756fa0 100644
--- a/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
+++ b/source/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
@@ -247,7 +247,13 @@
           return new ComplexTypeDescriptor(this, tag);
         }
       }
-      else if (equalsToSchemaName(tag, "include")) {
+      else if (equalsToSchemaName(tag, "include") ||
+               ( equalsToSchemaName(tag, "import") &&
+                 rootTag.getNamespaceByPrefix(
+                   XmlUtil.findPrefixByQualifiedName(name)
+                 ).equals(tag.getAttributeValue("namespace"))
+               )  
+              ) {
         final String schemaLocation = tag.getAttributeValue("schemaLocation");
         if (schemaLocation != null) {
           final XmlFile xmlFile = XmlUtil.findXmlFile(rootTag.getContainingFile(), schemaLocation);
