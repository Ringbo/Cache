diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/AbstractUsernameTokenAuthenticatingInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/AbstractUsernameTokenAuthenticatingInterceptor.java
index 37462bd..d673556 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/AbstractUsernameTokenAuthenticatingInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/AbstractUsernameTokenAuthenticatingInterceptor.java
@@ -181,7 +181,7 @@
     @Override 
     protected WSSecurityEngine getSecurityEngine(boolean utNoCallbacks) {
         if (!supportDigestPasswords) {
-            return super.getSecurityEngine(false);
+            return super.getSecurityEngine(true);
         }
         Map<QName, Object> profiles = new HashMap<QName, Object>(3);
         
