diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java
index 91adb89..ebdb5bc 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java
@@ -565,7 +565,7 @@
 
         assertEquals(0, received.get());
         assertEquals(10, view.getExpiredCount());
-        assertEquals(0, view.getEnqueueCount());
+        assertEquals(10, view.getEnqueueCount());
     }
 
     protected DestinationViewMBean createView(ActiveMQDestination destination) throws Exception {
