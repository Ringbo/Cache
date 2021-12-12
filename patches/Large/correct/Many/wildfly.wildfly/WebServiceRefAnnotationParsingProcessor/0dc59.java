diff --git a/webservices/server-integration/src/main/java/org/jboss/as/webservices/deployers/WebServiceRefAnnotationParsingProcessor.java b/webservices/server-integration/src/main/java/org/jboss/as/webservices/deployers/WebServiceRefAnnotationParsingProcessor.java
index 082d342..91c728b 100644
--- a/webservices/server-integration/src/main/java/org/jboss/as/webservices/deployers/WebServiceRefAnnotationParsingProcessor.java
+++ b/webservices/server-integration/src/main/java/org/jboss/as/webservices/deployers/WebServiceRefAnnotationParsingProcessor.java
@@ -172,7 +172,7 @@
         reference.setServiceRefName(name);
         // TODO handle mappedName
 
-        if (wsdlLocation.length() > 0) {
+        if (wsdlLocation != null && wsdlLocation.length() > 0) {
             reference.setWsdlFile(wsdlLocation);
         }
         reference.setServiceRefType(type);
