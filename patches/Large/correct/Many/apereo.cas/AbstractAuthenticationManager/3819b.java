diff --git a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AbstractAuthenticationManager.java b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AbstractAuthenticationManager.java
index b2ab91a..62c472a 100644
--- a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AbstractAuthenticationManager.java
+++ b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AbstractAuthenticationManager.java
@@ -140,7 +140,7 @@
         final AuthenticationBuilder builder = authenticateInternal(transaction);
 
         authenticationEventExecutionPlan.getAuthenticationPostProcessors().forEach(p -> {
-            LOGGER.info("Invoking authentication post processor [{}]");
+            LOGGER.info("Invoking authentication post processor [{}]", p);
             p.process(transaction, builder);
         });
 
