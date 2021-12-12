diff --git a/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java b/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java
index 1312fe4..c8f4611 100755
--- a/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java
+++ b/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java
@@ -1580,7 +1580,7 @@
 
         checkClosed();
         if (destination.isTemporary() && connection.isDeleted(destination)) {
-            throw new JMSException("Cannot publish to a deleted Destination: " + destination);
+            throw new InvalidDestinationException("Cannot publish to a deleted Destination: " + destination);
         }
         synchronized (sendMutex) {
             // tell the Broker we are about to start a new transaction
