diff --git a/messaging/src/main/java/org/jboss/as/messaging/jms/JMSQueueService.java b/messaging/src/main/java/org/jboss/as/messaging/jms/JMSQueueService.java
index e6b101b..eb162cc 100644
--- a/messaging/src/main/java/org/jboss/as/messaging/jms/JMSQueueService.java
+++ b/messaging/src/main/java/org/jboss/as/messaging/jms/JMSQueueService.java
@@ -67,7 +67,7 @@
     public synchronized void stop(StopContext context) {
         final JMSServerManager jmsManager = jmsServer.getValue();
         try {
-            jmsManager.destroyQueue(queueName);
+            jmsManager.removeQueueFromJNDI(queueName);
         } catch (Exception e) {
             MESSAGING_LOGGER.failedToDestroy(e, "queue", queueName);
         }
