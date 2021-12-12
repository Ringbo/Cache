diff --git a/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaNonTXRollbackTest.java b/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaNonTXRollbackTest.java
index 612336f..0255271 100644
--- a/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaNonTXRollbackTest.java
+++ b/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaNonTXRollbackTest.java
@@ -57,7 +57,7 @@
         template.sendBody("jpa://" + SendEmail.class.getName(), new SendEmail("kaboom@beer.org"));
 
         // should only rollback the failed
-        getMockEndpoint("mock:start").expectedMinimumMessageCount(4);
+        getMockEndpoint("mock:start").expectedMinimumMessageCount(5);
         // and only the 2 good messages goes here
         getMockEndpoint("mock:result").expectedMessageCount(2);
 
@@ -78,7 +78,7 @@
         return new RouteBuilder() {
             @Override
             public void configure() throws Exception {
-                from("jpa://" + SendEmail.class.getName() + "?consumer.transacted=false&delay=1000").routeId("foo").noAutoStartup()
+                from("jpa://" + SendEmail.class.getName() + "?consumer.transacted=false&delay=100").routeId("foo").noAutoStartup()
                         .to("mock:start")
                         .process(new Processor() {
                             @Override
