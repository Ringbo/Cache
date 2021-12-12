diff --git a/src/com/google/bitcoin/core/Peer.java b/src/com/google/bitcoin/core/Peer.java
index a8a4441..279b12d 100644
--- a/src/com/google/bitcoin/core/Peer.java
+++ b/src/com/google/bitcoin/core/Peer.java
@@ -197,7 +197,7 @@
      * @throws IOException
      */
     public Future<Block> getBlock(Sha256Hash blockHash) throws IOException {
-        InventoryMessage getdata = new InventoryMessage(params);
+        GetDataMessage getdata = new GetDataMessage(params);
         InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.Block, blockHash);
         getdata.addItem(inventoryItem);
         GetDataFuture<Block> future = new GetDataFuture<Block>(inventoryItem);
