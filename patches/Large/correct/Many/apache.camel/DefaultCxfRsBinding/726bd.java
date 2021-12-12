diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java
index 1ae15e9..8679bba 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java
@@ -115,7 +115,7 @@
             if (response.getHeader(Exchange.HTTP_RESPONSE_CODE) != null && !cxfExchange.containsKey(org.apache.cxf.message.Message.RESPONSE_CODE)) {
                 cxfExchange.put(org.apache.cxf.message.Message.RESPONSE_CODE, response.getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class));
             }
-            if (response.getHeader(Exchange.CONTENT_TYPE) != null) {
+            if (response.getHeader(Exchange.CONTENT_TYPE) != null && !cxfExchange.containsKey(org.apache.cxf.message.Message.CONTENT_TYPE)) {
                 if (!ObjectHelper.isEmpty(cxfExchange) && !ObjectHelper.isEmpty(cxfExchange.getOutMessage())) {
                     cxfExchange.getOutMessage().putIfAbsent(org.apache.cxf.message.Message.PROTOCOL_HEADERS, 
                                                         new TreeMap<>(String.CASE_INSENSITIVE_ORDER));
