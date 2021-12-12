diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java
index e685d30..6b70283 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java
@@ -133,7 +133,7 @@
         // Accept
         String acceptTypes = null;
         List<String> acceptHeaderValues = protocolHeaders.get(Message.ACCEPT_CONTENT_TYPE);
-        if (acceptHeaderValues != null) {
+        if (acceptHeaderValues != null && !acceptHeaderValues.isEmpty()) {
             acceptTypes = acceptHeaderValues.get(0);
             message.put(Message.ACCEPT_CONTENT_TYPE, acceptTypes);
         }
