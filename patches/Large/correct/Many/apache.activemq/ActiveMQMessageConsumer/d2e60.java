diff --git a/activemq-core/src/main/java/org/apache/activemq/ActiveMQMessageConsumer.java b/activemq-core/src/main/java/org/apache/activemq/ActiveMQMessageConsumer.java
index 0cbe0b4..70d262a 100755
--- a/activemq-core/src/main/java/org/apache/activemq/ActiveMQMessageConsumer.java
+++ b/activemq-core/src/main/java/org/apache/activemq/ActiveMQMessageConsumer.java
@@ -876,7 +876,7 @@
 	                            // Transacted or Client ack: Deliver the next message.
 	                            afterMessageIsConsumed(md, false);
 	                        }
-	                        log.warn("Exception while processing message: " + e, e);
+	                        log.error("Exception while processing message: " + e, e);
 	                    }
 	                } else {
 	                    unconsumedMessages.enqueue(md);
