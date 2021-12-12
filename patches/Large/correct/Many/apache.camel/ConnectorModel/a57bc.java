diff --git a/connectors/camel-connector/src/main/java/org/apache/camel/component/connector/ConnectorModel.java b/connectors/camel-connector/src/main/java/org/apache/camel/component/connector/ConnectorModel.java
index 0b2b6b2..7419256 100644
--- a/connectors/camel-connector/src/main/java/org/apache/camel/component/connector/ConnectorModel.java
+++ b/connectors/camel-connector/src/main/java/org/apache/camel/component/connector/ConnectorModel.java
@@ -60,7 +60,7 @@
     private Map<String, String> defaultComponentOptions;
     private Map<String, String> defaultEndpointOptions;
 
-    public ConnectorModel(String componentName, String className) {
+    ConnectorModel(String componentName, String className) {
         this.componentName = componentName;
         this.className = className;
         this.lines = Suppliers.memorize(() -> findCamelConnectorJSonSchema());
