diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/RegionBroker.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/RegionBroker.java
index f145e5f..47ee75e 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/RegionBroker.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/RegionBroker.java
@@ -314,9 +314,9 @@
     }
 
     public ActiveMQDestination[] getDestinations() throws Exception {
-        ArrayList<Destination> l;
+        ArrayList<ActiveMQDestination> l;
 
-        l = new ArrayList<Destination>(destinations.values());
+        l = new ArrayList<ActiveMQDestination>(getDestinationMap().keySet());
 
         ActiveMQDestination rc[] = new ActiveMQDestination[l.size()];
         l.toArray(rc);
