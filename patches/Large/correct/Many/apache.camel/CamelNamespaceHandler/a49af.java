diff --git a/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java b/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java
index 4ed7ceb..85bb5f5 100644
--- a/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java
+++ b/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java
@@ -113,7 +113,7 @@
         if (node.getNodeType() == Node.ELEMENT_NODE) {
             Document doc = node.getOwnerDocument();
             if (((Element) node).getNamespaceURI().equals(BLUEPRINT_NS)) {
-                doc.renameNode(node, SPRING_NS, node.getNodeName());
+                doc.renameNode(node, SPRING_NS, node.getLocalName());
             }
         }
         NodeList list = node.getChildNodes();
@@ -133,19 +133,19 @@
 
     public Metadata parse(Element element, ParserContext context) {
         renameNamespaceRecursive(element);
-        if (element.getNodeName().equals(CAMEL_CONTEXT)) {
+        if (element.getLocalName().equals(CAMEL_CONTEXT)) {
             return parseCamelContextNode(element, context);
         }
-        if (element.getNodeName().equals(ROUTE_CONTEXT)) {
+        if (element.getLocalName().equals(ROUTE_CONTEXT)) {
             return parseRouteContextNode(element, context);
         }
-        if (element.getNodeName().equals(KEY_STORE_PARAMETERS)) {
+        if (element.getLocalName().equals(KEY_STORE_PARAMETERS)) {
             return parseKeyStoreParametersNode(element, context);
         }
-        if (element.getNodeName().equals(SECURE_RANDOM_PARAMETERS)) {
+        if (element.getLocalName().equals(SECURE_RANDOM_PARAMETERS)) {
             return parseSecureRandomParametersNode(element, context);
         }
-        if (element.getNodeName().equals(SSL_CONTEXT_PARAMETERS)) {
+        if (element.getLocalName().equals(SSL_CONTEXT_PARAMETERS)) {
             return parseSSLContextParametersNode(element, context);
         }
 
