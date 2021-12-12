diff --git a/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletProducerAcceptContentTypeTest.java b/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletProducerAcceptContentTypeTest.java
index 6f75773..0a6577f 100644
--- a/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletProducerAcceptContentTypeTest.java
+++ b/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletProducerAcceptContentTypeTest.java
@@ -32,7 +32,7 @@
             @Override
             public void configure() throws Exception {                
                 
-                from("jetty://http://localhost:" + + portNum + "/users")
+                from("jetty://http://localhost:" + portNum + "/users")
                     .process(new Processor() {                    
                         public void process(Exchange exchange) throws Exception {
                             String body = exchange.getIn().getBody(String.class);
