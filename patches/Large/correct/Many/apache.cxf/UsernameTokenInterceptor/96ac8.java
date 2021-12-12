diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/UsernameTokenInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/UsernameTokenInterceptor.java
index 0dd6155..0cf54b5 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/UsernameTokenInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/UsernameTokenInterceptor.java
@@ -191,7 +191,7 @@
     protected WSUsernameTokenPrincipal parseTokenAndCreatePrincipal(Element tokenElement) 
         throws WSSecurityException {
         org.apache.ws.security.message.token.UsernameToken ut = 
-            new org.apache.ws.security.message.token.UsernameToken(tokenElement, false);
+            new org.apache.ws.security.message.token.UsernameToken(tokenElement);
         
         WSUsernameTokenPrincipal principal = new WSUsernameTokenPrincipal(ut.getName(), ut.isHashed());
         principal.setNonce(ut.getNonce());
