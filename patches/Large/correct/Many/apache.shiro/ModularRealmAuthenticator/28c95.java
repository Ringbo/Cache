diff --git a/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java b/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java
index 53a4f78..3632431 100644
--- a/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java
+++ b/core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java
@@ -219,9 +219,9 @@
                     info = realm.getAuthenticationInfo(token);
                 } catch (Throwable throwable) {
                     t = throwable;
-                    if (log.isWarnEnabled()) {
+                    if (log.isDebugEnabled()) {
                         String msg = "Realm [" + realm + "] threw an exception during a multi-realm authentication attempt:";
-                        log.warn(msg, t);
+                        log.debug(msg, t);
                     }
                 }
 
