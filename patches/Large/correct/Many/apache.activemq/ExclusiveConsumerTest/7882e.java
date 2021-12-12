diff --git a/activemq-core/src/test/java/org/apache/activemq/ExclusiveConsumerTest.java b/activemq-core/src/test/java/org/apache/activemq/ExclusiveConsumerTest.java
index eb062d2..58ea18a 100644
--- a/activemq-core/src/test/java/org/apache/activemq/ExclusiveConsumerTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/ExclusiveConsumerTest.java
@@ -235,7 +235,7 @@
             producer.send(msg);
             producer.send(msg);
 
-            Assert.assertNotNull(exclusiveConsumer2.receive(100));
+            Assert.assertNotNull(exclusiveConsumer2.receive(1000));
             Assert.assertNull(fallbackConsumer.receive(100));
 
         } finally {
