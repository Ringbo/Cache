diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/view/MessageBrokerView.java b/activemq-broker/src/main/java/org/apache/activemq/broker/view/MessageBrokerView.java
index 5ed00f1..eeea62d 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/view/MessageBrokerView.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/view/MessageBrokerView.java
@@ -36,7 +36,7 @@
  */
 public class MessageBrokerView  {
     private final BrokerService brokerService;
-    private Map<ActiveMQDestination,BrokerDestinationView> destinationViewMap = new LRUCache<ActiveMQDestination, BrokerDestinationView>();
+    private final Map<ActiveMQDestination,BrokerDestinationView> destinationViewMap = new LRUCache<ActiveMQDestination, BrokerDestinationView>();
 
 
     /**
@@ -198,7 +198,7 @@
     public Set<ActiveMQTempQueue> getTempQueues(){
         Set<ActiveMQTempQueue> result = new HashSet<ActiveMQTempQueue>();
         for (ActiveMQDestination destination:getDestinations()){
-            if (destination.isTopic() && destination.isTemporary()){
+            if (destination.isQueue() && destination.isTemporary()){
                 result.add((ActiveMQTempQueue) destination);
             }
         }
