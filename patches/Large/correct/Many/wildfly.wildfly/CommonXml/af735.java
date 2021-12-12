diff --git a/server/src/main/java/org/jboss/as/server/parsing/CommonXml.java b/server/src/main/java/org/jboss/as/server/parsing/CommonXml.java
index 8ea1944..e829a60 100644
--- a/server/src/main/java/org/jboss/as/server/parsing/CommonXml.java
+++ b/server/src/main/java/org/jboss/as/server/parsing/CommonXml.java
@@ -1606,7 +1606,7 @@
                     Set<String> deploymentNames = deployments.keys();
                     if (deploymentNames.size() > 0) {
                         for (String deploymentName : deploymentNames) {
-                            final ModelNode depNode = deployments.get(uniqueName);
+                            final ModelNode depNode = deployments.get(deploymentName);
                             final boolean regEx = depNode.hasDefined(REGULAR_EXPRESSION) ? depNode.get(REGULAR_EXPRESSION).asBoolean() : false;
                             writer.writeStartElement(Element.DEPLOYMENT.getLocalName());
                             writeAttribute(writer, Attribute.NAME, deploymentName);
