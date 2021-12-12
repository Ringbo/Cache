diff --git a/src/main/java/eu/siacs/conversations/services/AbstractConnectionManager.java b/src/main/java/eu/siacs/conversations/services/AbstractConnectionManager.java
index 692c6ec..92a0ba0 100644
--- a/src/main/java/eu/siacs/conversations/services/AbstractConnectionManager.java
+++ b/src/main/java/eu/siacs/conversations/services/AbstractConnectionManager.java
@@ -46,7 +46,7 @@
 
     public static InputStream upgrade(DownloadableFile file, InputStream is) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, NoSuchProviderException {
         if (file.getKey() != null && file.getIv() != null) {
-            Cipher cipher = Compatibility.twentyTwo() ? Cipher.getInstance(CIPHERMODE) : Cipher.getInstance(CIPHERMODE, PROVIDER);
+            final Cipher cipher = Compatibility.twentyTwo() ? Cipher.getInstance(CIPHERMODE) : Cipher.getInstance(CIPHERMODE, PROVIDER);
             SecretKeySpec keySpec = new SecretKeySpec(file.getKey(), KEYTYPE);
             IvParameterSpec ivSpec = new IvParameterSpec(file.getIv());
             cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
@@ -76,7 +76,7 @@
             return null;
         }
         try {
-            Cipher cipher = Cipher.getInstance(CIPHERMODE);
+            final Cipher cipher = Compatibility.twentyTwo() ? Cipher.getInstance(CIPHERMODE) : Cipher.getInstance(CIPHERMODE, PROVIDER);
             SecretKeySpec keySpec = new SecretKeySpec(file.getKey(), KEYTYPE);
             IvParameterSpec ivSpec = new IvParameterSpec(file.getIv());
             cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
