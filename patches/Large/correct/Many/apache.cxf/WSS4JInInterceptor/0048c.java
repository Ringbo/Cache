diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
index 2d00d8b..c9eac0e 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
@@ -798,7 +798,7 @@
         String errorMessage = null;
         boolean returnSecurityError = 
             MessageUtils.getContextualBoolean(message, SecurityConstants.RETURN_SECURITY_ERROR, false);
-        if (returnSecurityError) {
+        if (returnSecurityError || MessageUtils.isRequestor(message)) {
             errorMessage = e.getMessage();
         } else {
             errorMessage = e.getSafeExceptionMessage();
