diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeGrantHandler.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeGrantHandler.java
index 6d7fc1a..7e5aab3 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeGrantHandler.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeGrantHandler.java
@@ -113,11 +113,11 @@
     
     private boolean compareCodeVerifierWithChallenge(Client c, String clientCodeVerifier, 
                                                      String clientCodeChallenge) {
-        if (clientCodeChallenge == null && clientCodeChallenge == null 
+        if (clientCodeChallenge == null && clientCodeVerifier == null 
             && (c.isConfidential() || !expectCodeVerifierForPublicClients)) {
             return true;
-        } else if (clientCodeChallenge != null && clientCodeChallenge == null 
-            || clientCodeChallenge == null && clientCodeChallenge != null) {
+        } else if (clientCodeChallenge != null && clientCodeVerifier == null 
+            || clientCodeChallenge == null && clientCodeVerifier != null) {
             return false;
         } else {
             String transformedCodeVerifier = codeVerifierTransformer == null 
