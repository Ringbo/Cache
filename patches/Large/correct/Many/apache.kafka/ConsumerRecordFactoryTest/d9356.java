diff --git a/streams/test-utils/src/test/java/org/apache/kafka/streams/test/ConsumerRecordFactoryTest.java b/streams/test-utils/src/test/java/org/apache/kafka/streams/test/ConsumerRecordFactoryTest.java
index f75a069..469d241 100644
--- a/streams/test-utils/src/test/java/org/apache/kafka/streams/test/ConsumerRecordFactoryTest.java
+++ b/streams/test-utils/src/test/java/org/apache/kafka/streams/test/ConsumerRecordFactoryTest.java
@@ -178,7 +178,7 @@
         }
 
         final List<ConsumerRecord<byte[], byte[]>> records =
-            factory.create(Arrays.<KeyValue<String, Long>>asList(keyValuePairs));
+            factory.create(Arrays.<KeyValue<String, Integer>>asList(keyValuePairs));
 
         for (int i = 0; i < keyValuePairs.length; ++i) {
             verifyRecord(
@@ -207,7 +207,7 @@
         }
 
         final List<ConsumerRecord<byte[], byte[]>> records =
-            factory.create(Arrays.<KeyValue<String, Long>>asList(keyValuePairs));
+            factory.create(Arrays.<KeyValue<String, Integer>>asList(keyValuePairs));
 
         for (int i = 0; i < keyValuePairs.length; ++i) {
             verifyRecord(
@@ -236,7 +236,7 @@
         }
 
         final List<ConsumerRecord<byte[], byte[]>> records =
-            factory.create(Arrays.<KeyValue<String, Long>>asList(keyValuePairs), timestamp, 2L);
+            factory.create(Arrays.<KeyValue<String, Integer>>asList(keyValuePairs), timestamp, 2L);
 
         for (int i = 0; i < keyValuePairs.length; ++i) {
             verifyRecord(
