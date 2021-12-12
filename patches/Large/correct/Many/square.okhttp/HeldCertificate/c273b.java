diff --git a/okhttp-tls/src/main/java/okhttp3/tls/HeldCertificate.java b/okhttp-tls/src/main/java/okhttp3/tls/HeldCertificate.java
index 8709dc1..c659f58 100644
--- a/okhttp-tls/src/main/java/okhttp3/tls/HeldCertificate.java
+++ b/okhttp-tls/src/main/java/okhttp3/tls/HeldCertificate.java
@@ -400,8 +400,7 @@
       }
 
       try {
-        X509Certificate certificate = generator.generateX509Certificate(
-            signedByKeyPair.getPrivate());
+        X509Certificate certificate = generator.generate(signedByKeyPair.getPrivate());
         return new HeldCertificate(heldKeyPair, certificate);
       } catch (GeneralSecurityException e) {
         throw new AssertionError(e);
