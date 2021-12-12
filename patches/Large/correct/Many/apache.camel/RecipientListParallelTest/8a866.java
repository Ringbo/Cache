diff --git a/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTest.java b/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTest.java
index db12ca4..d462ab3 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/RecipientListParallelTest.java
@@ -27,7 +27,7 @@
 
     public void testRecipientListParallel() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedBodiesReceived("c", "b", "a");
+        mock.expectedBodiesReceivedInAnyOrder("c", "b", "a");
 
         template.sendBodyAndHeader("direct:start", "Hello World", "foo", "direct:a,direct:b,direct:c");
 
