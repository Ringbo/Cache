diff --git a/controller/src/main/java/org/jboss/as/controller/parsing/CommonXml.java b/controller/src/main/java/org/jboss/as/controller/parsing/CommonXml.java
index 539ffa1..11f7b69 100644
--- a/controller/src/main/java/org/jboss/as/controller/parsing/CommonXml.java
+++ b/controller/src/main/java/org/jboss/as/controller/parsing/CommonXml.java
@@ -1852,7 +1852,7 @@
         if (offset < 0) {
             offset = 0;
         }
-        if (offset >= 0) {
+        if (offset > 0) {
             update = Util.getWriteAttributeOperation(address, SOCKET_BINDING_PORT_OFFSET, offset);
         }
         updates.add(update);
@@ -2113,7 +2113,7 @@
         attr = bindingGroup.get(DEFAULT_INTERFACE);
         writeAttribute(writer, Attribute.DEFAULT_INTERFACE, attr.asString());
 
-        if (fromServer && bindingGroup.hasDefined(PORT_OFFSET) && bindingGroup.get(PORT_OFFSET).asInt() >= 0) {
+        if (fromServer && bindingGroup.hasDefined(PORT_OFFSET) && bindingGroup.get(PORT_OFFSET).asInt() > 0) {
             attr = bindingGroup.get(PORT_OFFSET);
             writeAttribute(writer, Attribute.PORT_OFFSET, attr.asString());
         }
