diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java
index f57a05b..91adb89 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/ExpiredMessagesWithNoConsumerTest.java
@@ -540,7 +540,7 @@
 
         LOG.info("expired=" + view.getExpiredCount() + " " +  view.getEnqueueCount());
         assertEquals(10, view.getExpiredCount());
-        assertEquals(0, view.getEnqueueCount());
+        assertEquals(10, view.getEnqueueCount());
 
         final AtomicLong received = new AtomicLong();
         sub = session.createDurableSubscriber(destination, "mySub");
