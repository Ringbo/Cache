diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java
index 1d79d59..f8de197 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java
@@ -298,7 +298,7 @@
                         if (broker.isExpired(node)) {
                             node.getRegionDestination().messageExpired(context, this, node);
                         }
-                        dispatched.remove(node);
+                        iter.remove();
                         node.getRegionDestination().getDestinationStatistics().getInflight().decrement();
                     }
                     if (ack.getLastMessageId().equals(node.getMessageId())) {
