diff --git a/clients/src/main/java/org/apache/kafka/common/network/Selector.java b/clients/src/main/java/org/apache/kafka/common/network/Selector.java
index 3e976f3..e873252 100644
--- a/clients/src/main/java/org/apache/kafka/common/network/Selector.java
+++ b/clients/src/main/java/org/apache/kafka/common/network/Selector.java
@@ -802,7 +802,7 @@
     }
 
     // only for testing
-    int numStagedReceives(KafkaChannel channel) {
+    public int numStagedReceives(KafkaChannel channel) {
         Deque<NetworkReceive> deque = stagedReceives.get(channel);
         return deque == null ? 0 : deque.size();
     }
