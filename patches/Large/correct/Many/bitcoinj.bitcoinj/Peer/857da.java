diff --git a/core/src/main/java/com/google/bitcoin/core/Peer.java b/core/src/main/java/com/google/bitcoin/core/Peer.java
index deb028c..8ac5491 100644
--- a/core/src/main/java/com/google/bitcoin/core/Peer.java
+++ b/core/src/main/java/com/google/bitcoin/core/Peer.java
@@ -591,7 +591,7 @@
             GetDataMessage getdata = new GetDataMessage(params);
             final long nonce = (long)(Math.random()*Long.MAX_VALUE);
             if (needToRequest.size() > 1)
-                log.info("{}: Requesting {} transactions for dep resolution", needToRequest.size());
+                log.info("{}: Requesting {} transactions for dep resolution", vAddress, needToRequest.size());
             for (Sha256Hash hash : needToRequest) {
                 getdata.addTransaction(hash);
                 GetDataRequest req = new GetDataRequest();
