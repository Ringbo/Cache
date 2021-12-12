diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/RefreshTokenTest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/RefreshTokenTest.java
index 447ca75..924eae4 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/RefreshTokenTest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/RefreshTokenTest.java
@@ -241,10 +241,7 @@
         session.getTransaction().commit();
         session.close();
 
-        // should not update last refresh because the access token interval is way less than idle timeout
-        Assert.assertEquals(last, next);
-
-
+        Assert.assertNotEquals(last, next);
 
         session = keycloakRule.startSession();
         realm = session.realms().getRealmByName("test");
