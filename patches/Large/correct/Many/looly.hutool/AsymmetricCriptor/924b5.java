diff --git a/hutool-crypto/src/main/java/com/xiaoleilu/hutool/crypto/asymmetric/AsymmetricCriptor.java b/hutool-crypto/src/main/java/com/xiaoleilu/hutool/crypto/asymmetric/AsymmetricCriptor.java
index c7d36e5..61c1e02 100644
--- a/hutool-crypto/src/main/java/com/xiaoleilu/hutool/crypto/asymmetric/AsymmetricCriptor.java
+++ b/hutool-crypto/src/main/java/com/xiaoleilu/hutool/crypto/asymmetric/AsymmetricCriptor.java
@@ -351,7 +351,7 @@
 				}
 				return this.privateKey;
 			case PublicKey:
-				if(null == this.privateKey){
+				if(null == this.publicKey){
 					throw new NullPointerException("Public key must not null when use it !");
 				}
 				return this.publicKey;
