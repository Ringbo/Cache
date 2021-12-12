diff --git a/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java b/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java
index 69d334e..9f055a5 100644
--- a/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java
+++ b/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java
@@ -224,7 +224,7 @@
     public QueueItem txnPeek(long offerId, String transactionId) {
         QueueItem item = getItemQueue().peek();
         if (item == null) {
-            if ( offerId == -1L ){
+            if ( offerId == -1 ){
                 return null;
             }
             TxQueueItem txItem = txMap.get(offerId);
