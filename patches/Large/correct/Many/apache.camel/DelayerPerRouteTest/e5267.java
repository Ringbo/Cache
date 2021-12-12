diff --git a/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java b/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java
index ca4dbc2..63c9ebf 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/DelayerPerRouteTest.java
@@ -39,7 +39,7 @@
         return new RouteBuilder() {
             @Override
             public void configure() throws Exception {
-                context.setDelayer(2000);
+                context.setDelayer(2000L);
 
                 from("seda:a").delayer(1000).to("mock:result");
 
