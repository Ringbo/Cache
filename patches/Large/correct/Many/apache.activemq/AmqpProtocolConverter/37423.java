diff --git a/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java b/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java
index 287eb4d..a3cd38c 100644
--- a/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java
+++ b/activemq-amqp/src/main/java/org/apache/activemq/transport/amqp/AmqpProtocolConverter.java
@@ -634,13 +634,13 @@
             return null;
         } else if( terminus instanceof org.apache.qpid.proton.amqp.messaging.Source) {
             org.apache.qpid.proton.amqp.messaging.Source source = (org.apache.qpid.proton.amqp.messaging.Source)terminus;
-            if( source.getAddress() == null ) {
+            if( source.getAddress() == null || source.getAddress().length()==0) {
                 throw new AmqpProtocolException("amqp:invalid-field", "source address not set");
             }
             return ActiveMQDestination.createDestination(source.getAddress(), ActiveMQDestination.QUEUE_TYPE);
         } else if( terminus instanceof org.apache.qpid.proton.amqp.messaging.Target) {
             org.apache.qpid.proton.amqp.messaging.Target target = (org.apache.qpid.proton.amqp.messaging.Target)terminus;
-            if( target.getAddress() == null ) {
+            if( target.getAddress() == null || target.getAddress().length()==0) {
                 throw new AmqpProtocolException("amqp:invalid-field", "target address not set");
             }
             return ActiveMQDestination.createDestination(target.getAddress(), ActiveMQDestination.QUEUE_TYPE);
