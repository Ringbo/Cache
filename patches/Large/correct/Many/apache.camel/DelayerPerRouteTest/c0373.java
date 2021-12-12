diff --git a/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java b/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java
index 3854ee8..ca4dbc2 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java
@@ -39,9 +39,9 @@
         return new RouteBuilder() {
             @Override
             public void configure() throws Exception {
-                context.setDelayer(1000);
+                context.setDelayer(2000);
 
-                from("seda:a").delayer(500).to("mock:result");
+                from("seda:a").delayer(1000).to("mock:result");
 
                 from("seda:b").noDelayer().to("mock:result");
 
