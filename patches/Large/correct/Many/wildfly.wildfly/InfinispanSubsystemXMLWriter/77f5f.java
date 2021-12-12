diff --git a/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanSubsystemXMLWriter.java b/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanSubsystemXMLWriter.java
index 7023c42..a738537 100644
--- a/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanSubsystemXMLWriter.java
+++ b/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanSubsystemXMLWriter.java
@@ -362,11 +362,11 @@
     }
 
     private static void writeAttribute(XMLExtendedStreamWriter writer, ModelNode model, Attribute attribute) throws XMLStreamException {
-        attribute.getDefinition().getAttributeMarshaller().marshallAsAttribute(attribute.getDefinition(), model, true, writer);
+        attribute.getDefinition().getMarshaller().marshallAsAttribute(attribute.getDefinition(), model, true, writer);
     }
 
     private static void writeElement(XMLExtendedStreamWriter writer, ModelNode model, Attribute attribute) throws XMLStreamException {
-        attribute.getDefinition().getAttributeMarshaller().marshallAsElement(attribute.getDefinition(), model, true, writer);
+        attribute.getDefinition().getMarshaller().marshallAsElement(attribute.getDefinition(), model, true, writer);
     }
 
     private static void writeThreadPoolElements(XMLElement element, ThreadPoolResourceDefinition pool, XMLExtendedStreamWriter writer, ModelNode container) throws XMLStreamException {
