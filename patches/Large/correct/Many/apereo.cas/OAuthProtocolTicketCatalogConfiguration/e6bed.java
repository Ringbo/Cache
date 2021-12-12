diff --git a/support/cas-server-support-oauth-core/src/main/java/org/apereo/cas/config/OAuthProtocolTicketCatalogConfiguration.java b/support/cas-server-support-oauth-core/src/main/java/org/apereo/cas/config/OAuthProtocolTicketCatalogConfiguration.java
index fa3415d..346030b 100644
--- a/support/cas-server-support-oauth-core/src/main/java/org/apereo/cas/config/OAuthProtocolTicketCatalogConfiguration.java
+++ b/support/cas-server-support-oauth-core/src/main/java/org/apereo/cas/config/OAuthProtocolTicketCatalogConfiguration.java
@@ -42,14 +42,14 @@
 
     protected void buildAndRegisterAccessTokenDefinition(final TicketCatalog plan, final TicketDefinition metadata) {
         metadata.getProperties().setStorageName("oauthAccessTokensCache");
-        final long timeout = Beans.newDuration(casProperties.getAuthn().getOauth().getAccessToken().getMaxTimeToLiveInSeconds()).toMillis();
+        final long timeout = Beans.newDuration(casProperties.getAuthn().getOauth().getAccessToken().getMaxTimeToLiveInSeconds()).getSeconds();
         metadata.getProperties().setStorageTimeout(timeout);
         registerTicketDefinition(plan, metadata);
     }
 
     protected void buildAndRegisterRefreshTokenDefinition(final TicketCatalog plan, final TicketDefinition metadata) {
         metadata.getProperties().setStorageName("oauthRefreshTokensCache");
-        final long timeout = Beans.newDuration(casProperties.getAuthn().getOauth().getRefreshToken().getTimeToKillInSeconds()).toMillis();
+        final long timeout = Beans.newDuration(casProperties.getAuthn().getOauth().getRefreshToken().getTimeToKillInSeconds()).getSeconds();
         metadata.getProperties().setStorageTimeout(timeout);
         registerTicketDefinition(plan, metadata);
     }
