diff --git a/examples/broker/twitter-authentication/src/main/java/org/keycloak/examples/broker/twitter/TwitterShowUserServlet.java b/examples/broker/twitter-authentication/src/main/java/org/keycloak/examples/broker/twitter/TwitterShowUserServlet.java
index e00ec56..e8e7ba2 100644
--- a/examples/broker/twitter-authentication/src/main/java/org/keycloak/examples/broker/twitter/TwitterShowUserServlet.java
+++ b/examples/broker/twitter-authentication/src/main/java/org/keycloak/examples/broker/twitter/TwitterShowUserServlet.java
@@ -119,7 +119,7 @@
     }
 
     private String getIdentityProviderTokenUrl() {
-        return this.authServer + "/realms/" + this.realmName + "/broker/" + this.identityProvider.getId() + "/token";
+        return this.authServer + "/realms/" + this.realmName + "/broker/" + this.identityProvider.getAlias() + "/token";
     }
 
     private void initKeyCloakClient(ServletConfig config) {
