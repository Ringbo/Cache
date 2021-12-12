diff --git a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerFullTest.java b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerFullTest.java
index 643c783..4e9a69e 100644
--- a/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerFullTest.java
+++ b/components/camel-kafka/src/test/java/org/apache/camel/component/kafka/KafkaProducerFullTest.java
@@ -336,7 +336,8 @@
         ConsumerRecord<String, String> record = records.get(0);
         Headers headers = record.headers();
         assertNotNull("Kafka Headers should not be null.", headers);
-        assertEquals("One propagated header is expected.", 5, headers.toArray().length);
+        // we have 5 headers and 1 header with breadcrumbId
+        assertEquals("One propagated header is expected.", 6, headers.toArray().length);
         assertEquals("Propagated string value received", propagatedStringHeaderValue,
                 new String(getHeaderValue(propagatedStringHeaderKey, headers)));
         assertEquals("Propagated integer value received", propagatedIntegerHeaderValue,
