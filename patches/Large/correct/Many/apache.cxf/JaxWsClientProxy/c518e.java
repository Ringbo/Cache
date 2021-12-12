diff --git a/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/JaxWsClientProxy.java b/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/JaxWsClientProxy.java
index 1322c8b..f3abf78 100644
--- a/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/JaxWsClientProxy.java
+++ b/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/JaxWsClientProxy.java
@@ -218,7 +218,9 @@
             if (role != null) {
                 soapFault.setFaultActor(role);
             }
-            if (((SoapFault)ex).getSubCode() != null) {
+            if (((SoapFault)ex).getSubCode() != null 
+                && !SOAPConstants.URI_NS_SOAP_1_1_ENVELOPE.equals(soapFault.getNamespaceURI())) {
+                // set the subcode only if it is supported (e.g, 1.2)
                 soapFault.appendFaultSubcode(((SoapFault)ex).getSubCode());
             }
 
