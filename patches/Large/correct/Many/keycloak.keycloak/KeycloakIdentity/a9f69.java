diff --git a/services/src/main/java/org/keycloak/authorization/common/KeycloakIdentity.java b/services/src/main/java/org/keycloak/authorization/common/KeycloakIdentity.java
index 9227854..5ddd431 100644
--- a/services/src/main/java/org/keycloak/authorization/common/KeycloakIdentity.java
+++ b/services/src/main/java/org/keycloak/authorization/common/KeycloakIdentity.java
@@ -139,10 +139,10 @@
 
         if (this.accessToken.getClientSession() != null) {
             ClientSessionModel clientSession = this.keycloakSession.sessions().getClientSession(this.accessToken.getClientSession());
-            clientUser = this.keycloakSession.users().getUserByServiceAccountClient(clientSession.getClient());
+            clientUser = this.keycloakSession.users().getServiceAccount(clientSession.getClient());
         } else if (this.accessToken.getIssuedFor() != null) {
             ClientModel clientModel = this.keycloakSession.realms().getClientById(this.accessToken.getIssuedFor(), this.realm);
-            clientUser = this.keycloakSession.users().getUserByServiceAccountClient(clientModel);
+            clientUser = this.keycloakSession.users().getServiceAccount(clientModel);
         }
 
 
