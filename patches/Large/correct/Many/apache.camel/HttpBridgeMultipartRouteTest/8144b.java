diff --git a/components/camel-jetty9/src/test/java/org/apache/camel/component/jetty/HttpBridgeMultipartRouteTest.java b/components/camel-jetty9/src/test/java/org/apache/camel/component/jetty/HttpBridgeMultipartRouteTest.java
index d5a289d..e7797c7 100644
--- a/components/camel-jetty9/src/test/java/org/apache/camel/component/jetty/HttpBridgeMultipartRouteTest.java
+++ b/components/camel-jetty9/src/test/java/org/apache/camel/component/jetty/HttpBridgeMultipartRouteTest.java
@@ -38,7 +38,7 @@
     private int port2;
 
     private static class MultipartHeaderFilterStrategy extends DefaultHeaderFilterStrategy {
-        public MultipartHeaderFilterStrategy() {
+        MultipartHeaderFilterStrategy() {
             initialize();
         }
 
