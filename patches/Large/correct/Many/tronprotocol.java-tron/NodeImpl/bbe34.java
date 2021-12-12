diff --git a/src/main/java/org/tron/core/net/node/NodeImpl.java b/src/main/java/org/tron/core/net/node/NodeImpl.java
index 045d96c..62b2fae 100644
--- a/src/main/java/org/tron/core/net/node/NodeImpl.java
+++ b/src/main/java/org/tron/core/net/node/NodeImpl.java
@@ -151,7 +151,7 @@
     }
 
     public void add(PriorItem id, PeerConnection peer) {
-      if (send.containsKey(peer) && send.get(peer).containsKey(id.getHash())) {
+      if (send.containsKey(peer) && send.get(peer).containsKey(id.getType())) {
         send.get(peer).get(id.getType()).offer(id.getHash());
       } else if (send.containsKey(peer)) {
         send.get(peer).put(id.getType(), new LinkedList<>());
