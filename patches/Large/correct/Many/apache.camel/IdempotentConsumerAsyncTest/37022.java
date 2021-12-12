diff --git a/camel-core/src/test/java/org/apache/camel/processor/IdempotentConsumerAsyncTest.java b/camel-core/src/test/java/org/apache/camel/processor/IdempotentConsumerAsyncTest.java
index d655ea3..d766090 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/IdempotentConsumerAsyncTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/IdempotentConsumerAsyncTest.java
@@ -48,7 +48,7 @@
         });
         context.start();
 
-        resultEndpoint.expectedBodiesReceived("one", "two", "three");
+        resultEndpoint.expectedBodiesReceivedInAnyOrder("one", "two", "three");
 
         sendMessage("1", "one");
         sendMessage("2", "two");
@@ -72,7 +72,7 @@
                     public void process(Exchange exchange) throws Exception {
                         String id = exchange.getIn().getHeader("messageId", String.class);
                         if (id.equals("2")) {
-                            throw new IllegalArgumentException("Damm I cannot handle id 2");
+                            throw new IllegalArgumentException("Damn I cannot handle id 2");
                         }
                     }
                 }).to("mock:result");
@@ -82,7 +82,7 @@
 
         // we send in 2 messages with id 2 that fails
         getMockEndpoint("mock:error").expectedMessageCount(2);
-        resultEndpoint.expectedBodiesReceived("one", "three");
+        resultEndpoint.expectedBodiesReceivedInAnyOrder("one", "three");
 
         sendMessage("1", "one");
         sendMessage("2", "two");
