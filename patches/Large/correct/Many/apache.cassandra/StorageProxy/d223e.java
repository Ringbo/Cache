diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index 2543c90..3ba7e24 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -145,7 +145,7 @@
                     Message hintedMessage = rm.makeRowMutationMessage();
                     hintedMessage.addHeader(RowMutation.HINT, target.getAddress());
                     if (logger.isDebugEnabled())
-                        logger.debug("insert writing key " + rm.key() + " to " + unhintedMessage.getMessageId() + "@" + hintedTarget + " for " + target);
+                        logger.debug("insert writing key " + rm.key() + " to " + hintedMessage.getMessageId() + "@" + hintedTarget + " for " + target);
                     MessagingService.instance().sendOneWay(hintedMessage, hintedTarget);
                 }
             }
