diff --git a/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java b/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java
index 3632431..53a4f78 100644
--- a/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java
+++ b/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java
@@ -219,9 +219,9 @@
                     info = realm.getAuthenticationInfo(token);
                 } catch (Throwable throwable) {
                     t = throwable;
-                    if (log.isDebugEnabled()) {
+                    if (log.isWarnEnabled()) {
                         String msg = "Realm [" + realm + "] threw an exception during a multi-realm authentication attempt:";
-                        log.debug(msg, t);
+                        log.warn(msg, t);
                     }
                 }
 
