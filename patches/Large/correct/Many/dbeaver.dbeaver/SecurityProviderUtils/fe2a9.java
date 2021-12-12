diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/SecurityProviderUtils.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/SecurityProviderUtils.java
index de81296..7510de4 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/SecurityProviderUtils.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/SecurityProviderUtils.java
@@ -38,7 +38,7 @@
                 if (securityProvider == null) {
                     registerSecurityProvider(BC_SECURITY_PROVIDER_CLASS);
                     if (securityProvider == null) {
-                        log.info("BouncyCastle not registered, using the default JCE provider");
+                        log.debug("BouncyCastle not registered, using the default JCE provider");
                     }
                 }
             } finally {
