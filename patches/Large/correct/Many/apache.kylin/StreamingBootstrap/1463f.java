diff --git a/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java b/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
index a8749fc..6802f0d 100644
--- a/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
+++ b/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
@@ -108,7 +108,7 @@
         Preconditions.checkArgument(kafkaConfig != null, "cannot find kafka config:" + streaming);
         final IIInstance ii = iiManager.getII(kafkaConfig.getIiName());
         Preconditions.checkNotNull(ii, "cannot find ii name:" + kafkaConfig.getIiName());
-        Preconditions.checkArgument(partitionId > 0 && partitionId < ii.getDescriptor().getSharding(), "invalid partition id:" + partitionId);
+        Preconditions.checkArgument(partitionId >= 0 && partitionId < ii.getDescriptor().getSharding(), "invalid partition id:" + partitionId);
         Preconditions.checkArgument(ii.getSegments().size() > 0);
         final IISegment iiSegment = ii.getSegments().get(0);
 
@@ -127,7 +127,7 @@
             throw new IllegalStateException("please create htable:" + iiSegment.getStorageLocationIdentifier() + " first");
         }
 
-        KafkaConsumer consumer = new KafkaConsumer(kafkaConfig.getTopic(), 0, streamOffset, kafkaConfig.getBrokers(), kafkaConfig) {
+        KafkaConsumer consumer = new KafkaConsumer(kafkaConfig.getTopic(), partitionId, streamOffset, kafkaConfig.getBrokers(), kafkaConfig) {
             @Override
             protected void consume(long offset, ByteBuffer payload) throws Exception {
                 byte[] bytes = new byte[payload.limit()];
