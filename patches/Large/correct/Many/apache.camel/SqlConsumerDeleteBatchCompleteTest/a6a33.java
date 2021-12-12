diff --git a/components/camel-sql/src/test/java/org/apache/camel/component/sql/SqlConsumerDeleteBatchCompleteTest.java b/components/camel-sql/src/test/java/org/apache/camel/component/sql/SqlConsumerDeleteBatchCompleteTest.java
index 9b4c720..1c67af8 100644
--- a/components/camel-sql/src/test/java/org/apache/camel/component/sql/SqlConsumerDeleteBatchCompleteTest.java
+++ b/components/camel-sql/src/test/java/org/apache/camel/component/sql/SqlConsumerDeleteBatchCompleteTest.java
@@ -55,7 +55,7 @@
     @Test
     public void testConsume() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(1);
+        mock.expectedMessageCount(3);
 
         assertMockEndpointsSatisfied();
 
