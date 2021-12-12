diff --git a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java
index 0a9e7b1..93f27d9 100644
--- a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java
+++ b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/config/CasOAuthConfiguration.java
@@ -271,8 +271,8 @@
     public ExpirationPolicy accessTokenExpirationPolicy() {
         final OAuthAccessTokenProperties oauth = casProperties.getAuthn().getOauth().getAccessToken();
         return new OAuthAccessTokenExpirationPolicy(
-            Beans.newDuration(oauth.getMaxTimeToLiveInSeconds()).toMillis(),
-            Beans.newDuration(oauth.getTimeToKillInSeconds()).toMillis()
+            Beans.newDuration(oauth.getMaxTimeToLiveInSeconds()).getSeconds(),
+            Beans.newDuration(oauth.getTimeToKillInSeconds()).getSeconds()
         );
     }
 
@@ -514,7 +514,7 @@
 
     private ExpirationPolicy refreshTokenExpirationPolicy() {
         final OAuthRefreshTokenProperties rtProps = casProperties.getAuthn().getOauth().getRefreshToken();
-        final long timeout = Beans.newDuration(rtProps.getTimeToKillInSeconds()).toMillis();
+        final long timeout = Beans.newDuration(rtProps.getTimeToKillInSeconds()).getSeconds();
         return new OAuthRefreshTokenExpirationPolicy(timeout);
     }
 
