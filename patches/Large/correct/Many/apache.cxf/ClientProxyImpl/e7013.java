diff --git a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/ClientProxyImpl.java b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/ClientProxyImpl.java
index 597adfd..c7a5174 100644
--- a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/ClientProxyImpl.java
+++ b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/ClientProxyImpl.java
@@ -358,7 +358,7 @@
                 accepts = InjectionUtils.isPrimitive(responseClass)
                     ? Collections.singletonList(MediaType.TEXT_PLAIN_TYPE)
                     : Collections.singletonList(MediaType.APPLICATION_XML_TYPE);        
-            } else if (responseClass == Void.class) {
+            } else if (responseClass == Void.class || responseClass == Void.TYPE) {
                 accepts = Collections.singletonList(MediaType.WILDCARD_TYPE);
             } else {
                 accepts = ori.getProduceTypes();
@@ -692,7 +692,7 @@
             
             Method method = outMessage.getExchange().get(Method.class);
             checkResponse(method, r, outMessage);
-            if (method.getReturnType() == Void.class || method.getReturnType() == void.class) { 
+            if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) { 
                 return null;
             }
             if (method.getReturnType() == Response.class
