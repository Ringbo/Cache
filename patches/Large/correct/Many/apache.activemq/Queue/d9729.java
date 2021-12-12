diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java
index 46b03f6..650bafc 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/Queue.java
@@ -60,7 +60,7 @@
 
     protected final ActiveMQDestination destination;
     protected final List consumers = new CopyOnWriteArrayList();
-    protected final LinkedList messages = new LinkedList();
+    private final LinkedList messages = new LinkedList();
     protected final Valve dispatchValve = new Valve(true);
     protected final UsageManager usageManager;
     protected final DestinationStatistics destinationStatistics = new DestinationStatistics();
@@ -330,7 +330,7 @@
     public String toString() {
         int size = 0;
         synchronized (messages) {
-            size = message.size();
+            size = messages.size();
         }
         return "Queue: destination=" + destination.getPhysicalName() + ", subscriptions=" + consumers.size()
                 + ", memory=" + usageManager.getPercentUsage() + "%, size=" + size + ", in flight groups="
