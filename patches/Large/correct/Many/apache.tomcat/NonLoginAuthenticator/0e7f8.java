diff --git a/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java b/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java
index dfdcee0..da1449c 100644
--- a/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java
+++ b/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java
@@ -80,10 +80,10 @@
         // Don't try and use SSO to authenticate since there is no auth
         // configured for this web application
         if (checkForCachedAuthentication(request, response, true)) {
-            // save the inherited Principal in this session so it can remain
-            // authenticated until it expires
+            // Save the inherited Principal in this session so it can remain
+            // authenticated until it expires.
             if (cache) {
-                request.getSessionInternal(true).setPrincipal(request.getUserPrincipal());
+                request.getSessionInternal(true).setPrincipal(request.getPrincipal());
             }
             return true;
         }
