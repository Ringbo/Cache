diff --git a/activemq-core/src/main/java/org/apache/activemq/transport/stomp/StompSubscription.java b/activemq-core/src/main/java/org/apache/activemq/transport/stomp/StompSubscription.java
index b158b5b..4fe7e5d 100644
--- a/activemq-core/src/main/java/org/apache/activemq/transport/stomp/StompSubscription.java
+++ b/activemq-core/src/main/java/org/apache/activemq/transport/stomp/StompSubscription.java
@@ -169,7 +169,7 @@
             	unconsumedMessage.add(dispatchedMessage.get(msgId));
             	ack.setTransactionId(transactionId);
             } 
-            dispatchedMessage.remove(messageId);
+            dispatchedMessage.remove(msgId);
         }
         return ack;
     }
