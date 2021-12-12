diff --git a/ldap/src/test/java/org/springframework/security/ldap/authentication/ad/ActiveDirectoryLdapAuthenticationProviderTests.java b/ldap/src/test/java/org/springframework/security/ldap/authentication/ad/ActiveDirectoryLdapAuthenticationProviderTests.java
index d6463ca..ffd92f7 100644
--- a/ldap/src/test/java/org/springframework/security/ldap/authentication/ad/ActiveDirectoryLdapAuthenticationProviderTests.java
+++ b/ldap/src/test/java/org/springframework/security/ldap/authentication/ad/ActiveDirectoryLdapAuthenticationProviderTests.java
@@ -140,9 +140,9 @@
 				any(Object[].class), any(SearchControls.class));
 	}
 
-	// SEC-2897
+	// SEC-2897,SEC-2224
 	@Test
-	public void bindPrincipalUsed() throws Exception {
+	public void bindPrincipalAndUsernameUsed() throws Exception {
 		// given
 		final String defaultSearchFilter = "(&(objectClass=user)(userPrincipalName={0}))";
 		ArgumentCaptor<Object[]> captor = ArgumentCaptor.forClass(Object[].class);
@@ -166,7 +166,7 @@
 		Authentication result = customProvider.authenticate(joe);
 
 		// then
-		assertThat(captor.getValue()).containsOnly("joe@mydomain.eu");
+		assertThat(captor.getValue()).containsExactly("joe@mydomain.eu", "joe");
 		assertThat(result.isAuthenticated()).isTrue();
 	}
 
