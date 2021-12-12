diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java
index 14385c3..621c466 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/PrefetchSubscription.java
@@ -273,7 +273,7 @@
                 // this only happens after a reconnect - get an ack which is not
                 // valid
                 if (!callDispatchMatched) {
-                    LOG.error("Could not correlate acknowledgment with dispatched message: "
+                    LOG.warn("Could not correlate acknowledgment with dispatched message: "
                                   + ack);
                 }
             } else if (ack.isIndividualAck()) {
