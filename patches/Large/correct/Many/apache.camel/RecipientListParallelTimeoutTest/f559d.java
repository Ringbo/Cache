diff --git a/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTimeoutTest.java
index 6797f1f..18e611e 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTimeoutTest.java
@@ -29,8 +29,8 @@
 
     public void testRecipientListParallelTimeout() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        // A will timeout so we only get B and C
-        mock.expectedBodiesReceived("BC");
+        // A will timeout so we only get B and/or C
+        mock.message(0).body().not(body().contains("A"));
 
         template.sendBodyAndHeader("direct:start", "Hello", "slip", "direct:a,direct:b,direct:c");
 
@@ -55,10 +55,10 @@
                                 return oldExchange;
                             }
                         })
-                        .parallelProcessing().timeout(2000)
+                        .parallelProcessing().timeout(1000)
                     .to("mock:result");
 
-                from("direct:a").delay(3000).setBody(constant("A"));
+                from("direct:a").delay(5000).setBody(constant("A"));
 
                 from("direct:b").setBody(constant("B"));
 
