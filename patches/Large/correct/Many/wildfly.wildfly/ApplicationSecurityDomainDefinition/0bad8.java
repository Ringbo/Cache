diff --git a/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java b/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java
index 7ac9439..8b76a22 100644
--- a/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java
+++ b/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java
@@ -238,7 +238,7 @@
         @Override
         protected ServiceName serviceName(String name) {
             RuntimeCapability<?> dynamicCapability = APPLICATION_SECURITY_DOMAIN_RUNTIME_CAPABILITY.fromBaseCapability(name);
-            return dynamicCapability.getCapabilityServiceName(HttpAuthenticationFactory.class);
+            return dynamicCapability.getCapabilityServiceName(Function.class);
         }
 
     }
