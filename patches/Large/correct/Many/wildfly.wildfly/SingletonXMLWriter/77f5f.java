diff --git a/clustering/singleton/extension/src/main/java/org/wildfly/extension/clustering/singleton/SingletonXMLWriter.java b/clustering/singleton/extension/src/main/java/org/wildfly/extension/clustering/singleton/SingletonXMLWriter.java
index 5e66731..14279dd 100644
--- a/clustering/singleton/extension/src/main/java/org/wildfly/extension/clustering/singleton/SingletonXMLWriter.java
+++ b/clustering/singleton/extension/src/main/java/org/wildfly/extension/clustering/singleton/SingletonXMLWriter.java
@@ -107,7 +107,7 @@
     }
 
     private static void writeAttribute(XMLExtendedStreamWriter writer, ModelNode model, Attribute attribute) throws XMLStreamException {
-        attribute.getDefinition().getAttributeMarshaller().marshallAsAttribute(attribute.getDefinition(), model, false, writer);
+        attribute.getDefinition().getMarshaller().marshallAsAttribute(attribute.getDefinition(), model, false, writer);
     }
 
     private static <A extends Enum<A> & Attribute> void writeElements(XMLExtendedStreamWriter writer, ModelNode model, Class<A> attributeClass) throws XMLStreamException {
@@ -121,6 +121,6 @@
     }
 
     private static void writeElement(XMLExtendedStreamWriter writer, ModelNode model, Attribute attribute) throws XMLStreamException {
-        attribute.getDefinition().getAttributeMarshaller().marshallAsElement(attribute.getDefinition(), model, false, writer);
+        attribute.getDefinition().getMarshaller().marshallAsElement(attribute.getDefinition(), model, false, writer);
     }
 }
