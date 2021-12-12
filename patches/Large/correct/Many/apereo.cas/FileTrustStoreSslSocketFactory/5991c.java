diff --git a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/FileTrustStoreSslSocketFactory.java b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/FileTrustStoreSslSocketFactory.java
index c02ef71..ebf3aec 100644
--- a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/FileTrustStoreSslSocketFactory.java
+++ b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/FileTrustStoreSslSocketFactory.java
@@ -236,7 +236,7 @@
                     trustManager.checkServerTrusted(chain, authType);
                     return true;
                 } catch (final CertificateException e) {
-                    LOGGER.debug(e.getMessage(), e);
+                    LOGGER.warn(e.getMessage(), e);
                     return false;
                 }
             });
