diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/AdminAPITest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/AdminAPITest.java
index c6871a2..d72664a 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/AdminAPITest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/AdminAPITest.java
@@ -82,7 +82,7 @@
             UserModel admin = session.users().getUserByUsername("admin", adminRealm);
             ClientSessionModel clientSession = session.sessions().createClientSession(adminRealm, adminConsole);
             clientSession.setNote(OIDCLoginProtocol.ISSUER, "http://localhost:8081/auth/realms/master");
-            UserSessionModel userSession = session.sessions().createUserSession(adminRealm, admin, "admin", null, "form", false);
+            UserSessionModel userSession = session.sessions().createUserSession(adminRealm, admin, "admin", null, "form", false, null, null);
             AccessToken token = tm.createClientAccessToken(session, tm.getAccess(null, adminConsole, admin), adminRealm, adminConsole, admin, userSession, clientSession);
             return tm.encodeToken(adminRealm, token);
         } finally {
