diff --git a/core/src/main/java/org/bitcoinj/wallet/Wallet.java b/core/src/main/java/org/bitcoinj/wallet/Wallet.java
index 9753ee9..4de7d24 100644
--- a/core/src/main/java/org/bitcoinj/wallet/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/wallet/Wallet.java
@@ -4155,7 +4155,7 @@
                 return true;
             }
             byte[] recipient = ScriptPattern.extractRecipientPubKeyFromCltvPaymentChannel(script);
-            ECKey recipientKey = findKeyFromPubKey(sender);
+            ECKey recipientKey = findKeyFromPubKey(recipient);
             if (recipientKey != null && (recipientKey.isEncrypted() || recipientKey.hasPrivKey())) {
                 return true;
             }
