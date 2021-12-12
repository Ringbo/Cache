diff --git a/testsuite/integration-arquillian/servers/auth-server/services/testsuite-providers/src/main/java/org/keycloak/testsuite/rest/TestingResourceProvider.java b/testsuite/integration-arquillian/servers/auth-server/services/testsuite-providers/src/main/java/org/keycloak/testsuite/rest/TestingResourceProvider.java
index e484645..bbc9f27 100644
--- a/testsuite/integration-arquillian/servers/auth-server/services/testsuite-providers/src/main/java/org/keycloak/testsuite/rest/TestingResourceProvider.java
+++ b/testsuite/integration-arquillian/servers/auth-server/services/testsuite-providers/src/main/java/org/keycloak/testsuite/rest/TestingResourceProvider.java
@@ -635,7 +635,7 @@
     public UserRepresentation getUserByServiceAccountClient(@QueryParam("realmName") String realmName, @QueryParam("clientId") String clientId) {
         RealmModel realm = getRealmByName(realmName);
         ClientModel client =  realm.getClientByClientId(clientId);
-        UserModel user = session.users().getUserByServiceAccountClient(client);
+        UserModel user = session.users().getServiceAccount(client);
         if (user == null) return null;
         return ModelToRepresentation.toRepresentation(user);
     }
