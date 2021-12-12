diff --git a/support/cas-server-support-swivel/src/main/java/org/apereo/cas/adaptors/swivel/SwivelAuthenticationHandler.java b/support/cas-server-support-swivel/src/main/java/org/apereo/cas/adaptors/swivel/SwivelAuthenticationHandler.java
index 2a6c6cc..7ba29d6 100644
--- a/support/cas-server-support-swivel/src/main/java/org/apereo/cas/adaptors/swivel/SwivelAuthenticationHandler.java
+++ b/support/cas-server-support-swivel/src/main/java/org/apereo/cas/adaptors/swivel/SwivelAuthenticationHandler.java
@@ -98,7 +98,7 @@
 
         if (req.actionSucceeded()) {
             LOGGER.debug("Successful Swivel authentication for [{}]", uid);
-            return createHandlerResult(swivelCredential, this.principalFactory.createPrincipal(uid), null);
+            return createHandlerResult(swivelCredential, this.principalFactory.createPrincipal(uid));
         }
 
         /*
