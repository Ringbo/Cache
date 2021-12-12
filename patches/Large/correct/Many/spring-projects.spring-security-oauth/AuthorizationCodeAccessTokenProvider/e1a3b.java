diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/client/code/AuthorizationCodeAccessTokenProvider.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/client/code/AuthorizationCodeAccessTokenProvider.java
index 2b37092..e384ace 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/client/code/AuthorizationCodeAccessTokenProvider.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/client/code/AuthorizationCodeAccessTokenProvider.java
@@ -56,10 +56,10 @@
 		form.add("code", context.getAuthorizationCode());
 
 		String redirectUri = resource.getPreEstablishedRedirectUri();
-		if (redirectUri == null) {
+		if (context!=null && redirectUri == null) {
 			// no pre-established redirect uri: use the preserved state
 			// TODO: treat redirect URI as a special kind of state (this is a historical mini hack)
-			redirectUri = String.valueOf(context==null ? null : context.getPreservedState());
+			redirectUri = String.valueOf(context.getPreservedState());
 		} else {
 			// TODO: the state key is what should be sent, not the value
 			form.add("state", String.valueOf(context.getPreservedState()));
