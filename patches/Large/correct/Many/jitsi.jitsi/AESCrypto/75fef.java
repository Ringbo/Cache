diff --git a/src/net/java/sip/communicator/impl/credentialsstorage/AESCrypto.java b/src/net/java/sip/communicator/impl/credentialsstorage/AESCrypto.java
index 3f854aa..63e6ef3 100644
--- a/src/net/java/sip/communicator/impl/credentialsstorage/AESCrypto.java
+++ b/src/net/java/sip/communicator/impl/credentialsstorage/AESCrypto.java
@@ -165,7 +165,8 @@
         try
         {
             decryptCipher.init(Cipher.DECRYPT_MODE, key);
-            return new String(decryptCipher.doFinal(Base64.decode(ciphertext)));
+            return new String(decryptCipher.doFinal(Base64.decode(ciphertext)),
+                "UTF-8");
         }
         catch (BadPaddingException e)
         {
