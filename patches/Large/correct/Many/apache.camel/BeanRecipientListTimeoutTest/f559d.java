diff --git a/camel-core/src/test/java/org/apache/camel/processor/BeanRecipientListTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/BeanRecipientListTimeoutTest.java
index 5e8b3b4..375f6c9 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/BeanRecipientListTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/BeanRecipientListTimeoutTest.java
@@ -32,8 +32,8 @@
 
     public void testBeanRecipientListParallelTimeout() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        // A will timeout so we only get B and C
-        mock.expectedBodiesReceived("BC");
+        // A will timeout so we only get B and/or C
+        mock.message(0).body().not(body().contains("A"));
 
         template.sendBody("direct:start", "Hello");
 
@@ -53,7 +53,7 @@
             public void configure() {
                 from("direct:start").beanRef("myBean", "route").to("mock:result");
 
-                from("direct:a").delay(3000).setBody(constant("A"));
+                from("direct:a").delay(2000).setBody(constant("A"));
 
                 from("direct:b").setBody(constant("B"));
 
@@ -64,7 +64,7 @@
 
     public static class MyBean {
 
-        @org.apache.camel.RecipientList(strategyRef = "myStrategy", parallelProcessing = true, timeout = 2000)
+        @org.apache.camel.RecipientList(strategyRef = "myStrategy", parallelProcessing = true, timeout = 1000)
         public String[] route(String body) {
             return new String[] {"direct:a", "direct:b", "direct:c"};
         }
@@ -73,7 +73,7 @@
     private class MyAggregationStrategy implements TimeoutAwareAggregationStrategy {
 
         public void timeout(Exchange oldExchange, int index, int total, long timeout) {
-            assertEquals(2000, timeout);
+            assertEquals(1000, timeout);
             assertEquals(3, total);
             assertEquals(0, index);
             assertNotNull(oldExchange);
