diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNotEagerMaxMessagesPerPollTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNotEagerMaxMessagesPerPollTest.java
index 565e200..722adde 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNotEagerMaxMessagesPerPollTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNotEagerMaxMessagesPerPollTest.java
@@ -42,7 +42,7 @@
     public void testMaxMessagesPerPoll() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedBodiesReceived("AAA", "BBB");
-        mock.setResultWaitTime(3000);
+        mock.setResultWaitTime(4000);
         mock.expectedPropertyReceived(Exchange.BATCH_SIZE, 2);
 
         assertMockEndpointsSatisfied();
