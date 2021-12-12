diff --git a/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/jsonp/JsonpInInterceptor.java b/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/jsonp/JsonpInInterceptor.java
index d57a97a..5decc7f 100644
--- a/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/jsonp/JsonpInInterceptor.java
+++ b/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/jsonp/JsonpInInterceptor.java
@@ -63,7 +63,7 @@
 
     protected String getCallbackValue(Message message) {
         String theQuery = (String)message.get(Message.QUERY_STRING);
-        String callback = JAXRSUtils.getStructuredParams(theQuery, "&", false, false).getFirst(CALLBACK_KEY);
+        String callback = JAXRSUtils.getStructuredParams(theQuery, "&", false, false).getFirst(CALLBACK_PARAM);
         if (StringUtils.isEmpty(callback)) {
             String httpAcceptType = (String)message.get(Message.ACCEPT_CONTENT_TYPE);
             if (httpAcceptType != null && mediaType.equals(httpAcceptType)) {
