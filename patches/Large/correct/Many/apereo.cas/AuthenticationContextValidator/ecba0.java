diff --git a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AuthenticationContextValidator.java b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AuthenticationContextValidator.java
index ce37701..eb9b28f 100644
--- a/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AuthenticationContextValidator.java
+++ b/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/AuthenticationContextValidator.java
@@ -107,7 +107,7 @@
 
         final RegisteredServiceMultifactorPolicy.FailureModes mode = getMultifactorFailureModeForService(service);
         if (mode == RegisteredServiceMultifactorPolicy.FailureModes.PHANTOM) {
-            if (!requestedProvider.get().verify(service)) {
+            if (!requestedProvider.get().isAvailable(service)) {
                 logger.debug("Service {} is configured to use a {} failure mode for multifactor authentication policy. "
                                 + "Since provider {} is unavailable at the moment, CAS will knowingly allow [{}] as a satisfied criteria "
                                 + "of the present authentication context", service.getServiceId(),
@@ -116,7 +116,7 @@
             }
         }
         if (mode == RegisteredServiceMultifactorPolicy.FailureModes.OPEN) {
-            if (!requestedProvider.get().verify(service)) {
+            if (!requestedProvider.get().isAvailable(service)) {
                 logger.debug("Service {} is configured to use a {} failure mode for multifactor authentication policy and "
                                 + "since provider {} is unavailable at the moment, CAS will consider the authentication satisfied "
                                 + "without the presence of {}", service.getServiceId(),
