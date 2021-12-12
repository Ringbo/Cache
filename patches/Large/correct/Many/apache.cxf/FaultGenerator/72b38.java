diff --git a/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java b/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java
index 7973c7e..f381e06 100644
--- a/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java
+++ b/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java
@@ -85,9 +85,11 @@
                     Object faultSerialVersionUID 
                         = penv.get(ToolConstants.CFG_FAULT_SERIAL_VERSION_UID);
                     setAttributes("faultSerialVersionUID", faultSerialVersionUID);
-                    if (faultSerialVersionUID.equals(FaultSerialVersionUID.FQCN)) {
+                    if (faultSerialVersionUID.equals(FaultSerialVersionUID.FQCN) 
+                        || "FQCN".equals(faultSerialVersionUID)) {
                         setAttributes("suid", generateHashSUID(expClz.getFullClassName()));
-                    } else if (faultSerialVersionUID.equals(FaultSerialVersionUID.TIMESTAMP)) {
+                    } else if (faultSerialVersionUID.equals(FaultSerialVersionUID.TIMESTAMP)
+                        || "TIMESTAMP".equals(faultSerialVersionUID)) {
                         setAttributes("suid", generateTimestampSUID());
                     }
                 }
