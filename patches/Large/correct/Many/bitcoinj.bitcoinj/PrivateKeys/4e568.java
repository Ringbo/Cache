diff --git a/examples/src/main/java/com/google/bitcoin/examples/PrivateKeys.java b/examples/src/main/java/com/google/bitcoin/examples/PrivateKeys.java
index 539b93a..617c4f3 100644
--- a/examples/src/main/java/com/google/bitcoin/examples/PrivateKeys.java
+++ b/examples/src/main/java/com/google/bitcoin/examples/PrivateKeys.java
@@ -39,9 +39,10 @@
         NetworkParameters params = MainNetParams.get();
         try {
             // Decode the private key from Satoshis Base58 variant. If 51 characters long then it's from Bitcoins
-            // dumpprivkey command and includes a version byte and checksum. Otherwise assume it's a raw key.
+            // dumpprivkey command and includes a version byte and checksum, or if 52 characters long then it has 
+            // compressed pub key. Otherwise assume it's a raw key.
             ECKey key;
-            if (args[0].length() == 51) {
+            if (args[0].length() == 51 || args[0].length() == 52) {
                 DumpedPrivateKey dumpedPrivateKey = new DumpedPrivateKey(params, args[0]);
                 key = dumpedPrivateKey.getKey();
             } else {
