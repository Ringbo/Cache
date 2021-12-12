diff --git a/security-utils/src/main/java/com/yahoo/security/tls/TransportSecurityOptions.java b/security-utils/src/main/java/com/yahoo/security/tls/TransportSecurityOptions.java
index a55c2de..82caf02 100644
--- a/security-utils/src/main/java/com/yahoo/security/tls/TransportSecurityOptions.java
+++ b/security-utils/src/main/java/com/yahoo/security/tls/TransportSecurityOptions.java
@@ -36,19 +36,19 @@
     }
 
     public Optional<Path> getPrivateKeyFile() {
-        return Optional.of(privateKeyFile);
+        return Optional.ofNullable(privateKeyFile);
     }
 
     public Optional<Path> getCertificatesFile() {
-        return Optional.of(certificatesFile);
+        return Optional.ofNullable(certificatesFile);
     }
 
     public Optional<Path> getCaCertificatesFile() {
-        return Optional.of(caCertificatesFile);
+        return Optional.ofNullable(caCertificatesFile);
     }
 
     public Optional<AuthorizedPeers> getAuthorizedPeers() {
-        return Optional.of(authorizedPeers);
+        return Optional.ofNullable(authorizedPeers);
     }
 
     public static TransportSecurityOptions fromJsonFile(Path file) {
