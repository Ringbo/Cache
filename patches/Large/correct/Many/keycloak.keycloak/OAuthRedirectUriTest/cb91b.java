diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/OAuthRedirectUriTest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/OAuthRedirectUriTest.java
index 442fa59..b76f76f 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/OAuthRedirectUriTest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/oauth/OAuthRedirectUriTest.java
@@ -226,7 +226,7 @@
         checkRedirectUri("http://localhost/myapp2", false);
     }
 
-    private void checkRedirectUri(String redirectUri, boolean expectValid) {
+    private void checkRedirectUri(String redirectUri, boolean expectValid) throws IOException {
         oauth.redirectUri(redirectUri);
         oauth.openLoginForm();
 
@@ -247,7 +247,7 @@
 
             Assert.assertEquals("Expected success, but got error: " + tokenResponse.getError(), 200, tokenResponse.getStatusCode());
 
-            driver.manage().deleteAllCookies();
+            oauth.doLogout(tokenResponse.getRefreshToken(), "password");
         }
     }
 
