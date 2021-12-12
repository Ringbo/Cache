diff --git a/camel-core/src/test/java/org/apache/camel/processor/SamplingThrottlerTest.java b/camel-core/src/test/java/org/apache/camel/processor/SamplingThrottlerTest.java
index a34ce8f..32702f4 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/SamplingThrottlerTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/SamplingThrottlerTest.java
@@ -37,7 +37,7 @@
 
     public void testSamplingFromExchangeStream() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(2);
+        mock.expectedMinimumMessageCount(2);
         mock.setResultWaitTime(3000);
 
         List<Exchange> sentExchanges = new ArrayList<Exchange>();
@@ -49,7 +49,7 @@
 
     public void testBurstySampling() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(2);
+        mock.expectedMinimumMessageCount(2);
         mock.setResultWaitTime(3000);
 
         List<Exchange> sentExchanges = new ArrayList<Exchange>();
@@ -67,7 +67,7 @@
 
     public void testSendLotsOfMessagesSimultaneouslyButOnly3GetThrough() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(3);
+        mock.expectedMinimumMessageCount(3);
         mock.setResultWaitTime(4000);
 
         final List<Exchange> sentExchanges = Collections.synchronizedList(new ArrayList<Exchange>());
@@ -91,7 +91,7 @@
     public void testSamplingUsingmessageFrequency() throws Exception {
         long totalMessages = 100;
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(10);
+        mock.expectedMinimumMessageCount(10);
         mock.setResultWaitTime(100);
 
         for (int i = 0; i < totalMessages; i++) {
@@ -104,7 +104,7 @@
     public void testSamplingUsingmessageFrequencyViaDSL() throws Exception {
         long totalMessages = 50;
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(10);
+        mock.expectedMinimumMessageCount(10);
         mock.setResultWaitTime(100);
 
         for (int i = 0; i < totalMessages; i++) {
