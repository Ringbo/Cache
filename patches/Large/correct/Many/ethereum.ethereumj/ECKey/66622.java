diff --git a/ethereumj-core/src/main/java/org/ethereum/crypto/ECKey.java b/ethereumj-core/src/main/java/org/ethereum/crypto/ECKey.java
index 8dc5916..0925142 100644
--- a/ethereumj-core/src/main/java/org/ethereum/crypto/ECKey.java
+++ b/ethereumj-core/src/main/java/org/ethereum/crypto/ECKey.java
@@ -519,7 +519,7 @@
         if (privKey == null) {
             throw new MissingPrivateKeyException();
         } else if (privKey instanceof BCECPrivateKey) {
-            return ((BCECPrivateKey) privKey).getS();
+            return ((BCECPrivateKey) privKey).getD();
         } else {
             throw new MissingPrivateKeyException();
         }
@@ -552,7 +552,7 @@
         StringBuilder b = new StringBuilder();
         b.append(toString());
         if (privKey != null && privKey instanceof BCECPrivateKey) {
-            b.append(" priv:").append(Hex.toHexString(((BCECPrivateKey) privKey).getS().toByteArray()));
+            b.append(" priv:").append(Hex.toHexString(((BCECPrivateKey) privKey).getD().toByteArray()));
         }
         return b.toString();
     }
@@ -1144,7 +1144,7 @@
         if (privKey == null) {
             return null;
         } else if (privKey instanceof BCECPrivateKey) {
-            return bigIntegerToBytes(((BCECPrivateKey) privKey).getS(), 32);
+            return bigIntegerToBytes(((BCECPrivateKey) privKey).getD(), 32);
         } else {
             return null;
         }
