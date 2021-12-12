diff --git a/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java b/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java
index 08f5d2a..8e66193 100644
--- a/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java
+++ b/storm-core/src/jvm/backtype/storm/messaging/netty/Client.java
@@ -317,7 +317,7 @@
      * If the write operation fails, then we will close the channel and trigger a reconnect.
      */
     private void flushMessages(Channel channel, final MessageBatch batch) {
-        if(batch.isEmpty()){
+        if(null == batch || batch.isEmpty()){
             return;
         }
 
