diff --git a/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/authorization/PathMatcher.java b/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/authorization/PathMatcher.java
index 9efa614..c8bce94 100644
--- a/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/authorization/PathMatcher.java
+++ b/adapters/oidc/adapter-core/src/main/java/org/keycloak/adapters/authorization/PathMatcher.java
@@ -89,7 +89,7 @@
                     pathString = "/";
                 }
 
-                if (matchingUri.equals(targetUri)) {
+                if (matchingUri.equals(targetUri) || pathString.equals(targetUri)) {
                     cache.put(targetUri, entry);
                     return entry;
                 }
