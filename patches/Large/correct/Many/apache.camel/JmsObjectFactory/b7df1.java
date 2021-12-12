diff --git a/components/camel-sjms/src/main/java/org/apache/camel/component/sjms/jms/JmsObjectFactory.java b/components/camel-sjms/src/main/java/org/apache/camel/component/sjms/jms/JmsObjectFactory.java
index 3ed3a24..382ed68 100644
--- a/components/camel-sjms/src/main/java/org/apache/camel/component/sjms/jms/JmsObjectFactory.java
+++ b/components/camel-sjms/src/main/java/org/apache/camel/component/sjms/jms/JmsObjectFactory.java
@@ -61,15 +61,15 @@
     }
 
     public static MessageConsumer createQueueConsumer(Session session, String destinationName) throws Exception {
-        return createMessageConsumer(session, destinationName, null, false, null, true);
+        return createMessageConsumer(session, destinationName, null, false, null);
     }
 
     public static MessageConsumer createQueueConsumer(Session session, String destinationName, String messageSelector) throws Exception {
-        return createMessageConsumer(session, destinationName, messageSelector, false, null, true);
+        return createMessageConsumer(session, destinationName, messageSelector, false, null);
     }
 
     public static MessageConsumer createTopicConsumer(Session session, String destinationName, String messageSelector) throws Exception {
-        return createMessageConsumer(session, destinationName, messageSelector, true, null, true);
+        return createMessageConsumer(session, destinationName, messageSelector, true, null);
     }
     
     public static MessageConsumer createTemporaryMessageConsumer(
@@ -88,7 +88,8 @@
             String messageSelector, 
             boolean topic, 
             String durableSubscriptionId) throws Exception {
-        return createMessageConsumer(session, destinationName, messageSelector, topic, durableSubscriptionId, true);
+        // noLocal is default false accordingly to JMS spec
+        return createMessageConsumer(session, destinationName, messageSelector, topic, durableSubscriptionId, false);
     }
     
     public static MessageConsumer createMessageConsumer(
