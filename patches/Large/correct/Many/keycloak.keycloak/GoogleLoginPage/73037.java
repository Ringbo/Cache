diff --git a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/pages/social/GoogleLoginPage.java b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/pages/social/GoogleLoginPage.java
index 3268f7a..4f9858a 100644
--- a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/pages/social/GoogleLoginPage.java
+++ b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/pages/social/GoogleLoginPage.java
@@ -58,6 +58,6 @@
     @Override
     public void logout() {
         log.info("performing logout from Google");
-        navigateToUri("https://www.google.com/accounts/Logout", false);
+        navigateToUri("https://www.google.com/accounts/Logout");
     }
 }
