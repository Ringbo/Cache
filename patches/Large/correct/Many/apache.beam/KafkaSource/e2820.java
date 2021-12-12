diff --git a/sdks/java/extensions/euphoria/euphoria-kafka/src/main/java/cz/seznam/euphoria/kafka/KafkaSource.java b/sdks/java/extensions/euphoria/euphoria-kafka/src/main/java/cz/seznam/euphoria/kafka/KafkaSource.java
index c949948..2e162e0 100644
--- a/sdks/java/extensions/euphoria/euphoria-kafka/src/main/java/cz/seznam/euphoria/kafka/KafkaSource.java
+++ b/sdks/java/extensions/euphoria/euphoria-kafka/src/main/java/cz/seznam/euphoria/kafka/KafkaSource.java
@@ -146,7 +146,7 @@
 
   @Override
   public List<Partition<Pair<byte[], byte[]>>> getPartitions() {
-    if (config != null && config.getBoolean("single.reader.only")) {
+    if (config != null && config.getBoolean("single.reader.only", false)) {
       return Collections.singletonList(
           new AllPartitionsConsumer(brokerList, topicId, config));
     }
