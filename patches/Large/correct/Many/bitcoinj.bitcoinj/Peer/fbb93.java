diff --git a/src/com/google/bitcoin/core/Peer.java b/src/com/google/bitcoin/core/Peer.java
index a651d12..00de2b2 100644
--- a/src/com/google/bitcoin/core/Peer.java
+++ b/src/com/google/bitcoin/core/Peer.java
@@ -279,7 +279,7 @@
      * a {@link Wallet}. After the broadcast completes, confirm the send using the wallet confirmSend() method.
      * @throws IOException
      */
-    public void broadcastTransaction(Transaction tx) throws IOException {
+    void broadcastTransaction(Transaction tx) throws IOException {
         conn.writeMessage(NetworkConnection.MSG_TX, tx);
     }
 
