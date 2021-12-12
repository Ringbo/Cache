diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/saml/SamlBindingTest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/saml/SamlBindingTest.java
index c354fc3..a8391ae 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/saml/SamlBindingTest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/saml/SamlBindingTest.java
@@ -424,7 +424,7 @@
             UserModel admin = session.users().getUserByUsername("admin", adminRealm);
             ClientSessionModel clientSession = session.sessions().createClientSession(adminRealm, adminConsole);
             clientSession.setNote(OIDCLoginProtocol.ISSUER, "http://localhost:8081/auth/realms/master");
-            UserSessionModel userSession = session.sessions().createUserSession(adminRealm, admin, "admin", null, "form", false);
+            UserSessionModel userSession = session.sessions().createUserSession(adminRealm, admin, "admin", null, "form", false, null, null);
             AccessToken token = tm.createClientAccessToken(session, tm.getAccess(null, adminConsole, admin), adminRealm, adminConsole, admin, userSession, clientSession);
             return tm.encodeToken(adminRealm, token);
         } finally {
