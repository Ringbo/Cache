diff --git a/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java b/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java
index a3453f3..8cc545e 100644
--- a/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java
+++ b/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java
@@ -241,7 +241,7 @@
                 link = protonConnection.linkHead(ACTIVE_STATE, ALL_STATES);
                 while (link != null) {
                     ((AmqpDeliveryListener)link.getContext()).drainCheck();
-                    link = link.next(ACTIVE_STATE, CLOSED_STATE);
+                    link = link.next(ACTIVE_STATE, ALL_STATES);
                 }
 
 
