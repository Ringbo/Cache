diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/AuthorizationRequest.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/AuthorizationRequest.java
index 26f3a7a..14633f2 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/AuthorizationRequest.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/AuthorizationRequest.java
@@ -103,7 +103,7 @@
 	}
 
 	public OAuth2Request createOAuth2Request() {
-		return new OAuth2Request(getApprovalParameters(), getClientId(), getAuthorities(), isApproved(), getScope(), getResourceIds(), getRedirectUri(), getResponseTypes(), getExtensions());
+		return new OAuth2Request(getRequestParameters(), getClientId(), getAuthorities(), isApproved(), getScope(), getResourceIds(), getRedirectUri(), getResponseTypes(), getExtensions());
 	}
 
 	/**
