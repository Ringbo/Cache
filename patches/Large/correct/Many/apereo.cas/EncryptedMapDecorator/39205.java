diff --git a/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java b/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
index 483a966..ff6233c 100644
--- a/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
+++ b/cas-server-extension-clearpass/src/main/java/org/jasig/cas/extension/clearpass/EncryptedMapDecorator.java
@@ -277,7 +277,7 @@
 
             byte[] plaintext = cipher.doFinal(ciphertext);
 
-            return new String(decryptedByteArray);
+            return new String(plaintext);
 
         } catch (final Exception e) {
             throw new RuntimeException(e);
