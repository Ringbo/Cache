diff --git a/sdks/java/io/kafka/src/main/java/org/apache/beam/sdk/io/kafka/KafkaUnboundedReader.java b/sdks/java/io/kafka/src/main/java/org/apache/beam/sdk/io/kafka/KafkaUnboundedReader.java
index 533c8b3..e2c28d5 100644
--- a/sdks/java/io/kafka/src/main/java/org/apache/beam/sdk/io/kafka/KafkaUnboundedReader.java
+++ b/sdks/java/io/kafka/src/main/java/org/apache/beam/sdk/io/kafka/KafkaUnboundedReader.java
@@ -164,7 +164,7 @@
   }
 
   @Override
-  public boolean advance() throws IOException {
+  public boolean advance() {
     /* Read first record (if any). we need to loop here because :
      *  - (a) some records initially need to be skipped if they are before consumedOffset
      *  - (b) if curBatch is empty, we want to fetch next batch and then advance.
@@ -211,7 +211,7 @@
             rawRecord.partition(),
             rawRecord.offset(),
             consumerSpEL.getRecordTimestamp(rawRecord),
-            consumerSpEL.getRecordTimestamptType(rawRecord),
+            consumerSpEL.getRecordTimestampType(rawRecord),
             keyDeserializerInstance.deserialize(rawRecord.topic(), rawRecord.key()),
             valueDeserializerInstance.deserialize(rawRecord.topic(), rawRecord.value()));
 
