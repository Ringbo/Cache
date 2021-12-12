diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
index 686a66d..74227b4 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
@@ -161,7 +161,7 @@
     }
 
     public void handleMessage(SoapMessage msg) throws Fault {
-        if (msg.containsKey(SECURITY_PROCESSED) || isGET(msg)) {
+        if (msg.containsKey(SECURITY_PROCESSED) || isGET(msg) || msg.getExchange() == null) {
             return;
         }
 
