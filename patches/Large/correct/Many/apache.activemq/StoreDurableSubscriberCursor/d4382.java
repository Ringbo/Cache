diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java
index 4b80b82..a14201f 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/StoreDurableSubscriberCursor.java
@@ -231,7 +231,7 @@
         }
     }
 
-    public int size() {
+    public synchronized int size() {
         int pendingCount=0;
         for (PendingMessageCursor tsp : storePrefetches) {
             pendingCount += tsp.size();
