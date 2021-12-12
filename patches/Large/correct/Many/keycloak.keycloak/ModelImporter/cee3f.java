diff --git a/export-import/export-import-impl/src/main/java/org/keycloak/exportimport/ModelImporter.java b/export-import/export-import-impl/src/main/java/org/keycloak/exportimport/ModelImporter.java
index 15f9fae..be78099 100755
--- a/export-import/export-import-impl/src/main/java/org/keycloak/exportimport/ModelImporter.java
+++ b/export-import/export-import-impl/src/main/java/org/keycloak/exportimport/ModelImporter.java
@@ -151,7 +151,7 @@
             }
         }
 
-        logger.infof("%d roles imported: ", roles);
+        logger.infof("%d roles imported: ", roles.size());
         if (logger.isDebugEnabled()) {
             logger.debug("Imported roles: " + roles);
         }
@@ -225,7 +225,7 @@
             addScopes(realm, client, clientEntity);
         }
 
-        logger.infof("OAuth clients imported: " + clients);
+        logger.info("OAuth clients imported: " + clients);
     }
 
     protected ApplicationModel findApplicationById(KeycloakSession keycloakSession, String applicationId) {
