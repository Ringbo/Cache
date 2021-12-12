diff --git a/clients/src/test/java/org/apache/kafka/clients/consumer/internals/FetcherTest.java b/clients/src/test/java/org/apache/kafka/clients/consumer/internals/FetcherTest.java
index e81e3d1..de621b4 100644
--- a/clients/src/test/java/org/apache/kafka/clients/consumer/internals/FetcherTest.java
+++ b/clients/src/test/java/org/apache/kafka/clients/consumer/internals/FetcherTest.java
@@ -2183,7 +2183,7 @@
                                         long lastStableOffset, long logStartOffset, int throttleTime) {
         Map<TopicPartition, FetchResponse.PartitionData> partitions = Collections.singletonMap(tp,
                 new FetchResponse.PartitionData(error, hw, lastStableOffset, logStartOffset, null, records));
-        return new FetchResponse(new LinkedHashMap<>(partitions), throttleTime);
+        return new FetchResponse(Errors.NONE, new LinkedHashMap<>(partitions), throttleTime, INVALID_SESSION_ID);
     }
 
     private MetadataResponse newMetadataResponse(String topic, Errors error) {
