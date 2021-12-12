diff --git a/camel-core/src/test/java/org/apache/camel/processor/TransformToTest.java b/camel-core/src/test/java/org/apache/camel/processor/TransformToTest.java
index b61690f..48def13 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/TransformToTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/TransformToTest.java
@@ -52,7 +52,7 @@
         context.addRoutes(new RouteBuilder() {
             @Override
             public void configure() throws Exception {
-                from("direct:bar").transform(to("bar"));
+                from("direct:bar").transform(sendTo("bar"));
             }
         });
         context.start();
@@ -71,7 +71,7 @@
             @Override
             public void configure() throws Exception {
                 from("direct:start")
-                    .transform(to("direct:foo")).to("mock:result");
+                    .transform(sendTo("direct:foo")).to("mock:result");
 
                 from("direct:foo").process(new Processor() {
                     public void process(Exchange exchange) throws Exception {
