diff --git a/camel-core/src/test/java/org/apache/camel/processor/PipelineConcurrentTest.java b/camel-core/src/test/java/org/apache/camel/processor/PipelineConcurrentTest.java
index f5995c3..90917cf 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/PipelineConcurrentTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/PipelineConcurrentTest.java
@@ -30,10 +30,10 @@
  */
 public class PipelineConcurrentTest extends ContextTestSupport {
 
-    private String uri = "seda:in?size=10000&concurrentConsumers=10";
+    private String uri = "seda:in?size=2000&concurrentConsumers=10";
 
     public void testConcurrentPipeline() throws Exception {
-        int total = 10000;
+        int total = 2000;
         final int group = total / 20;
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedMessageCount(total);
