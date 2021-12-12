diff --git a/examples/camel-example-axis/src/test/java/org/apache/camel/example/axis/AxisReportIncidentServiceTest.java b/examples/camel-example-axis/src/test/java/org/apache/camel/example/axis/AxisReportIncidentServiceTest.java
index 3eb961c..e546fb0 100644
--- a/examples/camel-example-axis/src/test/java/org/apache/camel/example/axis/AxisReportIncidentServiceTest.java
+++ b/examples/camel-example-axis/src/test/java/org/apache/camel/example/axis/AxisReportIncidentServiceTest.java
@@ -42,7 +42,7 @@
 
         // add a listener on port 8080 on localhost (127.0.0.1)
         Connector connector = new SelectChannelConnector();
-        connector.setPort(8080);
+        connector.setPort(9080);
         connector.setHost("127.0.0.1");
         server.addConnector(connector);
 
@@ -73,7 +73,7 @@
 
     public void testReportIncidentWithAxis() throws Exception {
         // the url to the axis webservice exposed by jetty
-        URL url = new URL("http://localhost:8080/unittest/services/ReportIncidentPort");
+        URL url = new URL("http://localhost:9080/unittest/services/ReportIncidentPort");
 
         // Axis stuff to get the port where we can send the webservice request
         ReportIncidentService_ServiceLocator locator = new ReportIncidentService_ServiceLocator();
