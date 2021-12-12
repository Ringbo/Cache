diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor.java
index 8bc0849..342ba5a 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor.java
@@ -137,10 +137,10 @@
             }
 
             if (binding != null) {
-                WSSecHeader secHeader = new WSSecHeader(actor, mustUnderstand);
+                WSSecHeader secHeader = new WSSecHeader(actor, mustUnderstand, saaj.getSOAPPart());
                 Element el = null;
                 try {
-                    el = secHeader.insertSecurityHeader(saaj.getSOAPPart());
+                    el = secHeader.insertSecurityHeader();
                 } catch (WSSecurityException e) {
                     throw new SoapFault(
                         new Message("SECURITY_FAILED", LOG), e, message.getVersion().getSender()
