diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java
index 350ec8c..9212c31 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/interceptor/JAXRSInInterceptor.java
@@ -123,7 +123,7 @@
                                                                    requestContentType,
                                                                    acceptContentTypes));
         }
-        LOG.info("Found operation: " + ori.getMethod().getName());
+        LOG.fine("Found operation: " + ori.getMethod().getName());
         
         message.getExchange().put(OperationResourceInfo.class, ori);
         message.put(RELATIVE_PATH, values.getFirst(URITemplate.FINAL_MATCH_GROUP));
