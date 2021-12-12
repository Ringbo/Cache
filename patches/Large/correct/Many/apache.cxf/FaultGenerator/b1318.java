diff --git a/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java b/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java
index ba9f02c..7973c7e 100644
--- a/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java
+++ b/tools/wsdlto/frontend/jaxws/src/main/java/org/apache/cxf/tools/wsdlto/frontend/jaxws/generators/FaultGenerator.java
@@ -82,8 +82,8 @@
                 clearAttributes();
                 
                 if (penv.containsKey(ToolConstants.CFG_FAULT_SERIAL_VERSION_UID)) {
-                    FaultSerialVersionUID  faultSerialVersionUID 
-                        = (FaultSerialVersionUID)penv.get(ToolConstants.CFG_FAULT_SERIAL_VERSION_UID);
+                    Object faultSerialVersionUID 
+                        = penv.get(ToolConstants.CFG_FAULT_SERIAL_VERSION_UID);
                     setAttributes("faultSerialVersionUID", faultSerialVersionUID);
                     if (faultSerialVersionUID.equals(FaultSerialVersionUID.FQCN)) {
                         setAttributes("suid", generateHashSUID(expClz.getFullClassName()));
