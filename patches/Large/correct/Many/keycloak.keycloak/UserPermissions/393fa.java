diff --git a/services/src/main/java/org/keycloak/services/resources/admin/permissions/UserPermissions.java b/services/src/main/java/org/keycloak/services/resources/admin/permissions/UserPermissions.java
index 55b7fb4..a8d9c8b 100644
--- a/services/src/main/java/org/keycloak/services/resources/admin/permissions/UserPermissions.java
+++ b/services/src/main/java/org/keycloak/services/resources/admin/permissions/UserPermissions.java
@@ -195,7 +195,7 @@
 
         }
         Resource usersResource = authz.getStoreFactory().getResourceStore().findByName(USERS_RESOURCE, server.getId());
-        if (usersResource == null) {
+        if (usersResource != null) {
             authz.getStoreFactory().getResourceStore().delete(usersResource.getId());
         }
     }
