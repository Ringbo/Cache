diff --git a/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java b/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java
index a83484c..1bd0de4 100644
--- a/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java
+++ b/java/org/apache/catalina/authenticator/NonLoginAuthenticator.java
@@ -80,7 +80,7 @@
     public boolean authenticate(Request request, HttpServletResponse response)
         throws IOException {
 
-        Principal principal = request.getUserPrincipal();
+        Principal principal = request.getPrincipal();
         if (principal != null) {
             // excellent... we have already authenticated the client somehow,
             // probably from another container that has a login-config
