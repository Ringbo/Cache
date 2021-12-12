diff --git a/camel-core/src/main/java/org/apache/camel/processor/idempotent/IdempotentConsumer.java b/camel-core/src/main/java/org/apache/camel/processor/idempotent/IdempotentConsumer.java
index b4fb4f4..46521aa 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/idempotent/IdempotentConsumer.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/idempotent/IdempotentConsumer.java
@@ -132,7 +132,7 @@
             } else {
                 // check if we already have the key
                 if (idempotentRepository instanceof ExchangeIdempotentRepository) {
-                    newKey = ((ExchangeIdempotentRepository<String>) idempotentRepository).contains(exchange, messageId);
+                    newKey = !((ExchangeIdempotentRepository<String>) idempotentRepository).contains(exchange, messageId);
                 } else {
                     newKey = !idempotentRepository.contains(messageId);
                 }
