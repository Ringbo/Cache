diff --git a/services/src/main/java/org/keycloak/authorization/admin/ResourceServerService.java b/services/src/main/java/org/keycloak/authorization/admin/ResourceServerService.java
index 84e5295..4f1e638 100644
--- a/services/src/main/java/org/keycloak/authorization/admin/ResourceServerService.java
+++ b/services/src/main/java/org/keycloak/authorization/admin/ResourceServerService.java
@@ -500,7 +500,7 @@
             umaProtectionRole = client.addRole(Constants.AUTHZ_UMA_PROTECTION);
         }
 
-        UserModel serviceAccount = this.session.users().getUserByServiceAccountClient(client);
+        UserModel serviceAccount = this.session.users().getServiceAccount(client);
 
         if (!serviceAccount.hasRole(umaProtectionRole)) {
             serviceAccount.grantRole(umaProtectionRole);
