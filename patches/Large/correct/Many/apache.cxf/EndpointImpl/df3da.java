diff --git a/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/EndpointImpl.java b/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/EndpointImpl.java
index 871e1c9..88e93a1 100644
--- a/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/EndpointImpl.java
+++ b/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/EndpointImpl.java
@@ -337,7 +337,7 @@
                 if (!endpointInfo.getAddress().contains(addr)) {
                     endpointInfo.setAddress(addr);
                 }
-                if (publishedEndpointUrl != null) {
+                if (publishedEndpointUrl != null && wsdlLocation != null) {
                     endpointInfo.setProperty(WSDLGetUtils.PUBLISHED_ENDPOINT_URL, publishedEndpointUrl);
                     //early update the publishedEndpointUrl so that endpoints in the same app sharing the same wsdl
                     //do not require all of them to be queried for wsdl before the wsdl is finally fully updated
