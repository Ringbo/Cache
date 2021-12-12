diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/jms/JmsMediumQueuePerformanceTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/jms/JmsMediumQueuePerformanceTest.java
index 493eb7e..1900c63 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/jms/JmsMediumQueuePerformanceTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/jms/JmsMediumQueuePerformanceTest.java
@@ -26,13 +26,13 @@
     @Override
     public void testSendingAndReceivingMessages() throws Exception {
         int expected = mediumQueueCount + messageCount;
-        setExpectedMessageCount(messageCount);
+        setExpectedMessageCount(expected);
 
         System.out.println("Sending " + mediumQueueCount + " messages first");
         sendLoop(0, mediumQueueCount);
         System.out.println("Sent!");
 
-        Thread.sleep(20000);
+        Thread.sleep(2000);
 
         // TODO now start the route!
         
