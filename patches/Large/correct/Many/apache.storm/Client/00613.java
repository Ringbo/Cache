diff --git a/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java b/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java
index 189fa95..7392d3e 100644
--- a/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java
+++ b/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java
@@ -358,7 +358,7 @@
     public synchronized void send(Iterator<TaskMessage> msgs) {
         if (closing) {
             int numMessages = iteratorSize(msgs);
-            LOG.warn("discarding {} messages because the Netty client to {} is being closed", numMessages,
+            LOG.error("discarding {} messages because the Netty client to {} is being closed", numMessages,
                 dstAddressPrefixedName);
             return;
         }
@@ -475,7 +475,7 @@
                     messagesSent.getAndAdd(batch.size());
                 }
                 else {
-                    LOG.warn("failed to send {} messages to {}: {}", numMessages, dstAddressPrefixedName,
+                    LOG.error("failed to send {} messages to {}: {}", numMessages, dstAddressPrefixedName,
                         future.getCause());
                     closeChannelAndReconnect(future.getChannel());
                     messagesLost.getAndAdd(numMessages);
