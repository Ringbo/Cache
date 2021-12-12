diff --git a/services/src/main/java/org/keycloak/exportimport/util/ExportUtils.java b/services/src/main/java/org/keycloak/exportimport/util/ExportUtils.java
index 29b8942..403551f 100755
--- a/services/src/main/java/org/keycloak/exportimport/util/ExportUtils.java
+++ b/services/src/main/java/org/keycloak/exportimport/util/ExportUtils.java
@@ -371,7 +371,7 @@
             Set<Resource> policyResources = policy.getResources();
 
             if (!policyResources.isEmpty()) {
-                List<String> resourceNames = scopes.stream().map(Scope::getName).collect(Collectors.toList());
+                List<String> resourceNames = policyResources.stream().map(Resource::getName).collect(Collectors.toList());
                 config.put("resources", JsonSerialization.writeValueAsString(resourceNames));
             }
 
