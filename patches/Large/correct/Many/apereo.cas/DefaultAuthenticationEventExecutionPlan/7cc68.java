diff --git a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/DefaultAuthenticationEventExecutionPlan.java b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/DefaultAuthenticationEventExecutionPlan.java
index e50e41d..3478877 100644
--- a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/DefaultAuthenticationEventExecutionPlan.java
+++ b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/DefaultAuthenticationEventExecutionPlan.java
@@ -35,7 +35,7 @@
     @Override
     public void registerAuthenticationHandlerWithPrincipalResolver(final AuthenticationHandler handler, final PrincipalResolver principalResolver) {
         if (principalResolver == null) {
-            LOGGER.debug("Registering handler [{}] with no principal resolver into the execution plan", handler.getName(), principalResolver);
+            LOGGER.debug("Registering handler [{}] with no principal resolver into the execution plan", handler.getName());
         } else {
             LOGGER.debug("Registering handler [{}] principal resolver [{}] into the execution plan", handler.getName(), principalResolver);
         }
