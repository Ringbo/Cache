diff --git a/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java b/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java
index 5c89017..1312fe4 100755
--- a/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java
+++ b/activemq-core/src/main/java/org/apache/activemq/ActiveMQSession.java
@@ -1623,7 +1623,7 @@
             if (this.debug) {
                 LOG.debug(getSessionId() + " sending message: " + msg);
             }
-            if (!connection.isAlwaysSyncSend() && (!msg.isPersistent() || connection.isUseAsyncSend() || txid != null)) {
+            if (!msg.isResponseRequired() && !connection.isAlwaysSyncSend() && (!msg.isPersistent() || connection.isUseAsyncSend() || txid != null)) {
                 this.connection.asyncSendPacket(msg);
                 if (producerWindow != null) {
                     // Since we defer lots of the marshaling till we hit the
