diff --git a/main/filesystem-crypto/src/main/java/org/cryptomator/crypto/engine/impl/CryptorImpl.java b/main/filesystem-crypto/src/main/java/org/cryptomator/crypto/engine/impl/CryptorImpl.java
index aaa099c..b0b90cd 100644
--- a/main/filesystem-crypto/src/main/java/org/cryptomator/crypto/engine/impl/CryptorImpl.java
+++ b/main/filesystem-crypto/src/main/java/org/cryptomator/crypto/engine/impl/CryptorImpl.java
@@ -86,7 +86,7 @@
 			randomSource.nextBytes(randomBytes);
 			encryptionKey = new SecretKeySpec(randomBytes, ENCRYPTION_ALG);
 			randomSource.nextBytes(randomBytes);
-			macKey = new SecretKeySpec(randomBytes, ENCRYPTION_ALG);
+			macKey = new SecretKeySpec(randomBytes, MAC_ALG);
 		} finally {
 			Arrays.fill(randomBytes, (byte) 0x00);
 		}
