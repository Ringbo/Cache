diff --git a/services/src/main/java/org/keycloak/services/managers/AuthenticationManager.java b/services/src/main/java/org/keycloak/services/managers/AuthenticationManager.java
index b99df15..ae0b20c 100755
--- a/services/src/main/java/org/keycloak/services/managers/AuthenticationManager.java
+++ b/services/src/main/java/org/keycloak/services/managers/AuthenticationManager.java
@@ -119,9 +119,9 @@
     public void createRememberMeCookie(RealmModel realm, String username, UriInfo uriInfo, ClientConnection connection) {
         String path = getIdentityCookiePath(realm, uriInfo);
         boolean secureOnly = realm.getSslRequired().isRequired(connection);
-        // remember me cookie should be persistent (hardcoded to 1 month for now)
+        // remember me cookie should be persistent (hardcoded to 365 days for now)
         //NewCookie cookie = new NewCookie(KEYCLOAK_REMEMBER_ME, "true", path, null, null, realm.getCentralLoginLifespan(), secureOnly);// todo httponly , true);
-        CookieHelper.addCookie(KEYCLOAK_REMEMBER_ME, username, path, null, null, 2592000, secureOnly, true);
+        CookieHelper.addCookie(KEYCLOAK_REMEMBER_ME, username, path, null, null, 31536000, secureOnly, true);
     }
 
     protected String encodeToken(RealmModel realm, Object token) {
