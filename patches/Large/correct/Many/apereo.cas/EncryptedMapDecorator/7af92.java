diff --git a/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java b/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
index 02450f6..8c89e19 100644
--- a/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
+++ b/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
@@ -348,7 +348,7 @@
 	private static Key getSecretKey(String secretKeyAlgorithm, String secretKey, String salt) throws Exception {
 
 		SecretKeyFactory factory = SecretKeyFactory.getInstance(SECRET_KEY_FACTORY_ALGORITHM);
-		KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), char2byte(salt), 65536, 256);
+		KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), char2byte(salt), 65536, 128);
 		SecretKey tmp = factory.generateSecret(spec);
 		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), secretKeyAlgorithm);
 
