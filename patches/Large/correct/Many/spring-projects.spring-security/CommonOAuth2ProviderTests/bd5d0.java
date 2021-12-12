diff --git a/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java b/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java
index f01877c..148c516 100644
--- a/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java
+++ b/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java
@@ -52,8 +52,7 @@
 		assertThat(registration.getAuthorizationGrantType())
 			.isEqualTo(AuthorizationGrantType.AUTHORIZATION_CODE);
 		assertThat(registration.getRedirectUriTemplate()).isEqualTo(DEFAULT_LOGIN_REDIRECT_URL);
-		assertThat(registration.getScopes()).containsOnly("openid", "profile", "email",
-			"address", "phone");
+		assertThat(registration.getScopes()).containsOnly("openid", "profile", "email");
 		assertThat(registration.getClientName()).isEqualTo("Google");
 		assertThat(registration.getRegistrationId()).isEqualTo("123");
 	}
