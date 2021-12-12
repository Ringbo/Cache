diff --git a/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterSubsystemAdd.java b/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterSubsystemAdd.java
index 8659826..a72ee6a 100644
--- a/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterSubsystemAdd.java
+++ b/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterSubsystemAdd.java
@@ -136,19 +136,19 @@
                 config.setSslTrustStorePassword(password.asString());
                 config.setSslKeyStorePassword(password.asString());
             }
-            if (ssl.has(CommonAttributes.CERTIFICATE_KEY_FILE)) {
+            if (ssl.hasDefined(CommonAttributes.CERTIFICATE_KEY_FILE)) {
                 config.setSslKeyStore(CERTIFICATE_KEY_FILE.resolveModelAttribute(context, ssl).asString());
             }
-            if (ssl.has(CommonAttributes.CIPHER_SUITE)) {
+            if (ssl.hasDefined(CommonAttributes.CIPHER_SUITE)) {
                 config.setSslCiphers(CIPHER_SUITE.resolveModelAttribute(context, ssl).asString());
             }
-            if (ssl.has(CommonAttributes.PROTOCOL)) {
+            if (ssl.hasDefined(CommonAttributes.PROTOCOL)) {
                 config.setSslProtocol(PROTOCOL.resolveModelAttribute(context, ssl).asString());
             }
-            if (ssl.has(CommonAttributes.CA_CERTIFICATE_FILE)) {
+            if (ssl.hasDefined(CommonAttributes.CA_CERTIFICATE_FILE)) {
                 config.setSslTrustStore(CA_CERTIFICATE_FILE.resolveModelAttribute(context, ssl).asString());
             }
-            if (ssl.has(CommonAttributes.CA_REVOCATION_URL)) {
+            if (ssl.hasDefined(CommonAttributes.CA_REVOCATION_URL)) {
                 config.setSslCrlFile(CA_REVOCATION_URL.resolveModelAttribute(context, ssl).asString());
             }
         }
