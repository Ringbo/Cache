diff --git a/support/cas-server-support-scim/src/main/java/org/apereo/cas/scim/v2/ScimV2PrincipalProvisioner.java b/support/cas-server-support-scim/src/main/java/org/apereo/cas/scim/v2/ScimV2PrincipalProvisioner.java
index 8bd2535..5dc4920 100644
--- a/support/cas-server-support-scim/src/main/java/org/apereo/cas/scim/v2/ScimV2PrincipalProvisioner.java
+++ b/support/cas-server-support-scim/src/main/java/org/apereo/cas/scim/v2/ScimV2PrincipalProvisioner.java
@@ -87,7 +87,7 @@
      */
     @SneakyThrows
     protected boolean createUserResource(final Principal p, final Credential credential) {
-        final UserResource user = new UserResource();
+        final var user = new UserResource();
         this.mapper.map(user, p, credential);
         return scimService.create("Users", user) != null;
     }
