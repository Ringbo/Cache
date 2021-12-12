diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/roles/RolesResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/roles/RolesResource.java
index 0a7c246..be303d8 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/roles/RolesResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/roles/RolesResource.java
@@ -141,7 +141,7 @@
         final Role roleToUpdate = roleService.load(name);
 
         roleToUpdate.setName(role.name());
-        roleToUpdate.setDescription(role.description().get());
+        roleToUpdate.setDescription(role.description().orNull());
         roleToUpdate.setPermissions(role.permissions());
         try {
             roleService.save(roleToUpdate);
