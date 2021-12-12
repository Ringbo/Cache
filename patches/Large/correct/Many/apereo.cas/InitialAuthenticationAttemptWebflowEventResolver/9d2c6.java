diff --git a/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/resolver/impl/InitialAuthenticationAttemptWebflowEventResolver.java b/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/resolver/impl/InitialAuthenticationAttemptWebflowEventResolver.java
index eec8de3..d3f12bd 100644
--- a/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/resolver/impl/InitialAuthenticationAttemptWebflowEventResolver.java
+++ b/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/resolver/impl/InitialAuthenticationAttemptWebflowEventResolver.java
@@ -114,7 +114,7 @@
             LOGGER.debug("Locating authentication event in the request context...");
             final Authentication authn = WebUtils.getAuthentication(context);
             LOGGER.debug("Enforcing access strategy policies for registered service [{}] and principal [{}]", registeredService, authn.getPrincipal());
-            RegisteredServiceAccessStrategyUtils.ensurePrincipalAccessIsAllowedForService(service, registeredService, authn);
+            RegisteredServiceAccessStrategyUtils.ensurePrincipalAccessIsAllowedForService(service, registeredService, authn, false);
         }
         return registeredService;
     }
