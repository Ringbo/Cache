diff --git a/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/rotation/JWKPublicKeyLocator.java b/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/rotation/JWKPublicKeyLocator.java
index 5fec6c8..d53960a 100644
--- a/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/rotation/JWKPublicKeyLocator.java
+++ b/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/rotation/JWKPublicKeyLocator.java
@@ -81,7 +81,7 @@
 
 
     private PublicKey lookupCachedKey(int publicKeyCacheTtl, int currentTime, String kid) {
-        if (lastRequestTime + publicKeyCacheTtl > currentTime) {
+        if (lastRequestTime + publicKeyCacheTtl > currentTime && kid != null) {
             return currentKeys.get(kid);
         } else {
             return null;
