diff --git a/ethereumj-core/src/main/java/org/ethereum/net/rlpx/EncryptionHandshake.java b/ethereumj-core/src/main/java/org/ethereum/net/rlpx/EncryptionHandshake.java
index 3b7cca8..5ac8893 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/rlpx/EncryptionHandshake.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/rlpx/EncryptionHandshake.java
@@ -68,7 +68,7 @@
         byte[] signed = xor(token, nonce);
         message.signature = ephemeralKey.sign(signed);
         message.isTokenUsed = isToken;
-        message.ephemeralPublicHash = sha3(ephemeralKey.getPubKeyPoint().getEncoded(false), 1, 32);
+        message.ephemeralPublicHash = sha3(ephemeralKey.getPubKeyPoint().getEncoded(false), 1, 64);
         message.publicKey = key.getPubKeyPoint();
         message.nonce = initiatorNonce;
         return message;
