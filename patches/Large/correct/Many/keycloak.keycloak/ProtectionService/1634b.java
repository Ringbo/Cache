diff --git a/services/src/main/java/org/keycloak/authorization/protection/ProtectionService.java b/services/src/main/java/org/keycloak/authorization/protection/ProtectionService.java
index 80226cf..7b6b29e 100644
--- a/services/src/main/java/org/keycloak/authorization/protection/ProtectionService.java
+++ b/services/src/main/java/org/keycloak/authorization/protection/ProtectionService.java
@@ -57,7 +57,7 @@
         KeycloakIdentity identity = createIdentity(true);
         ResourceServer resourceServer = getResourceServer(identity);
         RealmModel realm = authorization.getRealm();
-        ClientModel client = realm.getClientById(identity.getId());
+        ClientModel client = realm.getClientById(resourceServer.getId());
         KeycloakSession keycloakSession = authorization.getKeycloakSession();
         UserModel serviceAccount = keycloakSession.users().getServiceAccount(client);
         AdminEventBuilder adminEvent = new AdminEventBuilder(realm, new AdminAuth(realm, identity.getAccessToken(), serviceAccount, client), keycloakSession, clientConnection);
