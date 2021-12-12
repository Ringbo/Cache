diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JStaxInInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JStaxInInterceptor.java
index 2f3d1db..b2e540f 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JStaxInInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JStaxInInterceptor.java
@@ -131,7 +131,8 @@
             List<SecurityEventListener> securityEventListeners = 
                 configureSecurityEventListeners(soapMessage, secProps);
             
-            InboundWSSec inboundWSSec = WSSec.getInboundWSSec(secProps);
+            InboundWSSec inboundWSSec = 
+                WSSec.getInboundWSSec(secProps, MessageUtils.isRequestor(soapMessage));
             
             newXmlStreamReader = 
                 inboundWSSec.processInMessage(originalXmlStreamReader, requestSecurityEvents, securityEventListeners);
