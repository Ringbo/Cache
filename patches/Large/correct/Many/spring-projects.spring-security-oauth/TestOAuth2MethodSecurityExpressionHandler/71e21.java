diff --git a/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/provider/expression/TestOAuth2MethodSecurityExpressionHandler.java b/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/provider/expression/TestOAuth2MethodSecurityExpressionHandler.java
index 582d336..9f019b1 100644
--- a/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/provider/expression/TestOAuth2MethodSecurityExpressionHandler.java
+++ b/spring-security-oauth2/src/test/java/org/springframework/security/oauth2/provider/expression/TestOAuth2MethodSecurityExpressionHandler.java
@@ -82,7 +82,7 @@
 	@Test
 	public void testScopesRegex() throws Exception {
 
-		OAuth2Request clientAuthentication = RequestTokenFactory.createOAuth2Request(null, "foo", null, false, Collections.singleton("ns_admin:read"), null, null, null);
+		OAuth2Request clientAuthentication = RequestTokenFactory.createOAuth2Request(null, "foo", null, false, Collections.singleton("ns_admin:read"), null, null, null, null);
 
 		Authentication userAuthentication = null;
 		OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(clientAuthentication, userAuthentication);
@@ -98,7 +98,7 @@
 	@Test(expected = AccessDeniedException.class)
 	public void testScopesRegexThrowsException() throws Exception {
 
-		OAuth2Request clientAuthentication = RequestTokenFactory.createOAuth2Request(null, "foo", null, false, Collections.singleton("ns_admin:read"), null, null, null);
+		OAuth2Request clientAuthentication = RequestTokenFactory.createOAuth2Request(null, "foo", null, false, Collections.singleton("ns_admin:read"), null, null, null, null);
 
 		Authentication userAuthentication = null;
 		OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(clientAuthentication, userAuthentication);
