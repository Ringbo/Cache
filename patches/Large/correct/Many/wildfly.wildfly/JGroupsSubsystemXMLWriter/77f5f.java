diff --git a/clustering/jgroups/extension/src/main/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemXMLWriter.java b/clustering/jgroups/extension/src/main/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemXMLWriter.java
index b3b8b5a..fc4f038 100644
--- a/clustering/jgroups/extension/src/main/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemXMLWriter.java
+++ b/clustering/jgroups/extension/src/main/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemXMLWriter.java
@@ -224,10 +224,10 @@
     }
 
     private static void writeAttribute(XMLExtendedStreamWriter writer, ModelNode model, Attribute attribute) throws XMLStreamException {
-        attribute.getDefinition().getAttributeMarshaller().marshallAsAttribute(attribute.getDefinition(), model, true, writer);
+        attribute.getDefinition().getMarshaller().marshallAsAttribute(attribute.getDefinition(), model, true, writer);
     }
 
     private static void writeElement(XMLExtendedStreamWriter writer, ModelNode model, Attribute attribute) throws XMLStreamException {
-        attribute.getDefinition().getAttributeMarshaller().marshallAsElement(attribute.getDefinition(), model, true, writer);
+        attribute.getDefinition().getMarshaller().marshallAsElement(attribute.getDefinition(), model, true, writer);
     }
 }
