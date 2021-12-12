diff --git a/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java b/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java
index d868e50..2c32a2c 100644
--- a/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java
+++ b/external/storm-kafka/src/jvm/storm/kafka/PartitionManager.java
@@ -214,7 +214,7 @@
 
     public void commit() {
         long lastCompletedOffset = lastCompletedOffset();
-        if (lastCompletedOffset != lastCompletedOffset) {
+        if (_committedTo != lastCompletedOffset) {
             LOG.debug("Writing last completed offset (" + lastCompletedOffset + ") to ZK for " + _partition + " for topology: " + _topologyInstanceId);
             Map<Object, Object> data = (Map<Object, Object>) ImmutableMap.builder()
                     .put("topology", ImmutableMap.of("id", _topologyInstanceId,
