diff --git a/core/src/main/java/com/google/bitcoin/core/Peer.java b/core/src/main/java/com/google/bitcoin/core/Peer.java
index fceea8d..fa316c1 100644
--- a/core/src/main/java/com/google/bitcoin/core/Peer.java
+++ b/core/src/main/java/com/google/bitcoin/core/Peer.java
@@ -359,7 +359,7 @@
                 // the others.
                 //
                 // We must do two things here:
-                // (1) Request from current top of chain to the root of the current set of orphan blocks and
+                // (1) Request from current top of chain to the oldest ancestor of the received block in the orphan set
                 // (2) Filter out duplicate getblock requests (done in blockChainDownload).
                 //
                 // The reason for (1) is that otherwise if new blocks were solved during the middle of chain download
@@ -595,7 +595,8 @@
     }
 
     // Keep track of the last request we made to the peer in blockChainDownload so we can avoid redundant and harmful
-    // getblocks requests.
+    // getblocks requests. This does not have to be synchronized because blockChainDownload cannot be called from
+    // multiple threads simultaneously.
     private Sha256Hash lastGetBlocksBegin, lastGetBlocksEnd;
 
     private void blockChainDownload(Sha256Hash toHash) throws IOException {
@@ -654,7 +655,7 @@
         log.info("{}: blockChainDownload({}) current head = {}", new Object[] { toString(),
                 toHash.toString(), chainHead.getHeader().getHashAsString() });
         StoredBlock cursor = chainHead;
-        for (int i = 50; cursor != null && i > 0; i--) {
+        for (int i = 100; cursor != null && i > 0; i--) {
             blockLocator.add(cursor.getHeader().getHash());
             try {
                 cursor = cursor.getPrev(store);
