diff --git a/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java b/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java
index 5d24c92..07955bf 100644
--- a/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java
+++ b/undertow/src/main/java/org/wildfly/extension/undertow/ApplicationSecurityDomainDefinition.java
@@ -336,11 +336,11 @@
             final Map<String, String> baseConfiguration = Collections.unmodifiableMap(tempBaseConfiguration);
 
             final Map<String, Map<String, String>> selectedMechanisms = new LinkedHashMap<>();
-            if (overrideDeploymentConfig) {
+            if (overrideDeploymentConfig || (loginConfig == null)) {
                 final Map<String, String> mechanismConfiguration = baseConfiguration;
                 availableMechanisms.forEach(n -> selectedMechanisms.put(n, mechanismConfiguration));
             } else {
-                final List<AuthMethodConfig> authMethods = loginConfig == null ? Collections.<AuthMethodConfig> emptyList() : loginConfig.getAuthMethods();
+                final List<AuthMethodConfig> authMethods = loginConfig.getAuthMethods();
                 if (authMethods.isEmpty()) {
                     throw ROOT_LOGGER.noMechanismsSelected();
                 }
