diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/adapter/AdapterTestStrategy.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/adapter/AdapterTestStrategy.java
index 45e007a..6d3c32b 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/adapter/AdapterTestStrategy.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/adapter/AdapterTestStrategy.java
@@ -144,7 +144,7 @@
             UserModel admin = session.users().getUserByUsername("admin", adminRealm);
             ClientSessionModel clientSession = session.sessions().createClientSession(adminRealm, adminConsole);
             clientSession.setNote(OIDCLoginProtocol.ISSUER, AUTH_SERVER_URL + "/realms/master");
-            UserSessionModel userSession = session.sessions().createUserSession(adminRealm, admin, "admin", null, "form", false);
+            UserSessionModel userSession = session.sessions().createUserSession(adminRealm, admin, "admin", null, "form", false, null, null);
             AccessToken token = tm.createClientAccessToken(session, TokenManager.getAccess(null, adminConsole, admin), adminRealm, adminConsole, admin, userSession, clientSession);
             return tm.encodeToken(adminRealm, token);
         } finally {
