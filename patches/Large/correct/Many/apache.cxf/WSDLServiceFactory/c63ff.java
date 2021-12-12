diff --git a/rt/wsdl/src/main/java/org/apache/cxf/wsdl11/WSDLServiceFactory.java b/rt/wsdl/src/main/java/org/apache/cxf/wsdl11/WSDLServiceFactory.java
index be0d02e..152bf8f 100644
--- a/rt/wsdl/src/main/java/org/apache/cxf/wsdl11/WSDLServiceFactory.java
+++ b/rt/wsdl/src/main/java/org/apache/cxf/wsdl11/WSDLServiceFactory.java
@@ -133,7 +133,7 @@
                     && (!PartialWSDLProcessor.isBindingExisted(definition, serviceName))
                     && (PartialWSDLProcessor.isPortTypeExisted(definition, serviceName))) {
                     try {
-                        Map<QName, PortType> portTypes = CastUtils.cast(definition.getPortTypes());
+                        Map<QName, PortType> portTypes = CastUtils.cast(definition.getAllPortTypes());
                         String existPortName = null;
                         PortType portType = null;
                         for (Map.Entry<QName, PortType> entry : portTypes.entrySet()) {
