diff --git a/oauth2/oauth2-client/src/test/java/org/springframework/security/oauth2/client/web/reactive/function/client/ServerOAuth2AuthorizedClientExchangeFilterFunctionTests.java b/oauth2/oauth2-client/src/test/java/org/springframework/security/oauth2/client/web/reactive/function/client/ServerOAuth2AuthorizedClientExchangeFilterFunctionTests.java
index f6eefec..97d17d0 100644
--- a/oauth2/oauth2-client/src/test/java/org/springframework/security/oauth2/client/web/reactive/function/client/ServerOAuth2AuthorizedClientExchangeFilterFunctionTests.java
+++ b/oauth2/oauth2-client/src/test/java/org/springframework/security/oauth2/client/web/reactive/function/client/ServerOAuth2AuthorizedClientExchangeFilterFunctionTests.java
@@ -303,7 +303,7 @@
 	@Test
 	public void filterWhenDefaultClientRegistrationIdThenAuthorizedClientResolved() {
 		this.function.setDefaultClientRegistrationId(this.registration.getRegistrationId());
-		OAuth2RefreshToken refreshToken = new OAuth2RefreshToken("refresh-token", this.accessToken.getIssuedAt(), this.accessToken.getExpiresAt());
+		OAuth2RefreshToken refreshToken = new OAuth2RefreshToken("refresh-token", this.accessToken.getIssuedAt());
 		OAuth2AuthorizedClient authorizedClient = new OAuth2AuthorizedClient(this.registration,
 				"principalName", this.accessToken, refreshToken);
 		when(this.authorizedClientRepository.loadAuthorizedClient(any(), any(), any())).thenReturn(Mono.just(authorizedClient));
