diff --git a/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsProducer.java b/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsProducer.java
index 8329372..f3427b3 100644
--- a/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsProducer.java
+++ b/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsProducer.java
@@ -382,7 +382,7 @@
         if (exchange.hasOut()) {
             JmsMessage out = (JmsMessage) exchange.getOut();
             try {
-                if (out != null) {
+                if (out != null && out.getJmsMessage() != null) {
                     out.setMessageId(out.getJmsMessage().getJMSMessageID());
                 }
             } catch (JMSException e) {
