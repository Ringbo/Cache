diff --git a/controller/src/main/java/org/jboss/as/controller/parsing/HostXml.java b/controller/src/main/java/org/jboss/as/controller/parsing/HostXml.java
index 73c4621..8bbfe97 100644
--- a/controller/src/main/java/org/jboss/as/controller/parsing/HostXml.java
+++ b/controller/src/main/java/org/jboss/as/controller/parsing/HostXml.java
@@ -517,10 +517,10 @@
 
     private void writeDomainController(final XMLExtendedStreamWriter writer, final ModelNode modelNode) throws XMLStreamException {
         writer.writeStartElement(Element.DOMAIN_CONTROLLER.getLocalName());
-        if (modelNode.has(LOCAL)) {
+        if (modelNode.hasDefined(LOCAL)) {
             writer.writeEmptyElement(Element.LOCAL.getLocalName());
         }
-        if (modelNode.has(REMOTE)) {
+        else if (modelNode.hasDefined(REMOTE)) {
             writer.writeStartElement(Element.REMOTE.getLocalName());
             final ModelNode remote = modelNode.get(REMOTE);
             if (remote.has(HOST)) {
