diff --git a/api/src/main/java/org/apache/cxf/wsdl/EndpointReferenceUtils.java b/api/src/main/java/org/apache/cxf/wsdl/EndpointReferenceUtils.java
index 8f76112..e421eaa 100644
--- a/api/src/main/java/org/apache/cxf/wsdl/EndpointReferenceUtils.java
+++ b/api/src/main/java/org/apache/cxf/wsdl/EndpointReferenceUtils.java
@@ -125,7 +125,7 @@
                                        String systemId, String baseURI) {
 
             String newId = systemId;
-            if (baseURI != null) {
+            if (baseURI != null && systemId != null) {  //add additional systemId null check
                 try {
                     URI uri = new URI(baseURI);
                     uri = uri.resolve(systemId);
