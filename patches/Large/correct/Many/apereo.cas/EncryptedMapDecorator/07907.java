diff --git a/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java b/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
index fedb463..21ba4af 100644
--- a/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
+++ b/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
@@ -475,7 +475,7 @@
      * @throws NoSuchPaddingException - if transformation contains a padding scheme that is not available.
      * @see Cipher#getInstance(String)
      */
-    private Cipher getCipherObject() throws NoSuchAlgorithmException, NoSuchPaddingException {
+    private static Cipher getCipherObject() throws NoSuchAlgorithmException, NoSuchPaddingException {
         return Cipher.getInstance(CIPHER_ALGORITHM);
     }
 
