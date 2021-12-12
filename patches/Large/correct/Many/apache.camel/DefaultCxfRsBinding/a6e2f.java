diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java
index e31cdac..867536f 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/DefaultCxfRsBinding.java
@@ -263,7 +263,7 @@
         Map<String, List<String>> headers = (Map<String, List<String>>)cxfMessage.get(org.apache.cxf.message.Message.PROTOCOL_HEADERS);
         for (Map.Entry<String, List<String>>entry : headers.entrySet()) {
             // just make sure the first String element is not null
-            if (headerFilterStrategy.applyFilterToCamelHeaders(entry.getKey(), entry.getValue(), camelExchange) 
+            if (headerFilterStrategy.applyFilterToExternalHeaders(entry.getKey(), entry.getValue(), camelExchange) 
                 || entry.getValue().get(0) == null) {
                 LOG.trace("Drop CXF message protocol header: {}={}", entry.getKey(), entry.getValue());
             } else {
