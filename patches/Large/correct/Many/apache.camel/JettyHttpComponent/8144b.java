diff --git a/components/camel-jetty-common/src/main/java/org/apache/camel/component/jetty/JettyHttpComponent.java b/components/camel-jetty-common/src/main/java/org/apache/camel/component/jetty/JettyHttpComponent.java
index dc620d3..1583e53 100644
--- a/components/camel-jetty-common/src/main/java/org/apache/camel/component/jetty/JettyHttpComponent.java
+++ b/components/camel-jetty-common/src/main/java/org/apache/camel/component/jetty/JettyHttpComponent.java
@@ -140,7 +140,7 @@
         CamelServlet servlet;
         int refCount;
 
-        public ConnectorRef(Server server, Connector connector, CamelServlet servlet) {
+        ConnectorRef(Server server, Connector connector, CamelServlet servlet) {
             this.server = server;
             this.connector = connector;
             this.servlet = servlet;
