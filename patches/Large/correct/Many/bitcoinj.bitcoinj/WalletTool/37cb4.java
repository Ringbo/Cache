diff --git a/tools/src/main/java/com/google/bitcoin/tools/WalletTool.java b/tools/src/main/java/com/google/bitcoin/tools/WalletTool.java
index bfe884a..7b72b4d 100644
--- a/tools/src/main/java/com/google/bitcoin/tools/WalletTool.java
+++ b/tools/src/main/java/com/google/bitcoin/tools/WalletTool.java
@@ -416,7 +416,7 @@
             Wallet.SendRequest req = Wallet.SendRequest.forTx(t);
             req.fee = fee;
             if (!wallet.completeTx(req)) {
-                System.err.println("Insufficient funds: have " + wallet.getBalance());
+                System.err.println("Insufficient funds: have " + Utils.bitcoinValueToFriendlyString(wallet.getBalance()));
                 return;
             }
             try {
@@ -593,7 +593,7 @@
     private static void shutdown() {
         try {
             if (peers == null) return;  // setup() never called so nothing to do.
-            peers.stop();
+            peers.stopAndWait();
             saveWallet(walletFile);
             store.close();
             wallet = null;
