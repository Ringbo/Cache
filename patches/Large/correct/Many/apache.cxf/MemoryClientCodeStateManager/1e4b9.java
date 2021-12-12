diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/MemoryClientCodeStateManager.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/MemoryClientCodeStateManager.java
index 33a95df..90b9e5c 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/MemoryClientCodeStateManager.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/MemoryClientCodeStateManager.java
@@ -56,7 +56,7 @@
                                                             MultivaluedMap<String, String> redirectState) {
         String stateParam = redirectState.getFirst(OAuthConstants.STATE);
         String sessionToken = OAuthUtils.getSessionToken(mc, "state");
-        if (!sessionToken.equals(stateParam)) {
+        if (sessionToken == null || !sessionToken.equals(stateParam)) {
             throw new OAuthServiceException("Invalid session token");
         }
         return map.remove(stateParam);
