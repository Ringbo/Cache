diff --git a/messaging/src/main/java/org/jboss/as/messaging/jms/JMSTopicService.java b/messaging/src/main/java/org/jboss/as/messaging/jms/JMSTopicService.java
index 57af2dd..02a6727 100644
--- a/messaging/src/main/java/org/jboss/as/messaging/jms/JMSTopicService.java
+++ b/messaging/src/main/java/org/jboss/as/messaging/jms/JMSTopicService.java
@@ -73,7 +73,7 @@
     public synchronized void stop(StopContext context) {
         final JMSServerManager jmsManager = jmsServer.getValue();
         try {
-            jmsManager.destroyTopic(name);
+            jmsManager.removeTopicFromJNDI(name);
         } catch (Exception e) {
             MESSAGING_LOGGER.failedToDestroy(e, "jms topic", name);
         }
