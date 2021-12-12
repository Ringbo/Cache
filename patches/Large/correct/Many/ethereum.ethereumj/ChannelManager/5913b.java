diff --git a/ethereumj-core/src/main/java/org/ethereum/net/server/ChannelManager.java b/ethereumj-core/src/main/java/org/ethereum/net/server/ChannelManager.java
index d702fa8..125e2d3 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/server/ChannelManager.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/server/ChannelManager.java
@@ -153,7 +153,7 @@
         return ids;
     }
 
-    private void processNewPeers() {
+    private synchronized void processNewPeers() {
         if (newPeers.isEmpty()) return;
 
         List<Channel> processed = new ArrayList<>();
@@ -344,7 +344,7 @@
         newPeers.add(peer);
     }
 
-    public void notifyDisconnect(Channel channel) {
+    public synchronized void notifyDisconnect(Channel channel) {
         logger.debug("Peer {}: notifies about disconnect", channel);
         channel.onDisconnect();
         syncPool.onDisconnect(channel);
