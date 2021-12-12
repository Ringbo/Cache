diff --git a/components/camel-http-common/src/main/java/org/apache/camel/http/common/HttpSendDynamicAware.java b/components/camel-http-common/src/main/java/org/apache/camel/http/common/HttpSendDynamicAware.java
index 473d434..43487e1 100644
--- a/components/camel-http-common/src/main/java/org/apache/camel/http/common/HttpSendDynamicAware.java
+++ b/components/camel-http-common/src/main/java/org/apache/camel/http/common/HttpSendDynamicAware.java
@@ -52,11 +52,11 @@
     }
 
     @Override
-    public DynamicAwareEntry prepare(Exchange exchange, String uri) throws Exception {
+    public DynamicAwareEntry prepare(Exchange exchange, String uri, String originalUri) throws Exception {
         RuntimeCamelCatalog catalog = exchange.getContext().getExtension(RuntimeCamelCatalog.class);
         Map<String, String> properties = catalog.endpointProperties(uri);
         Map<String, String> lenient = catalog.endpointLenientProperties(uri);
-        return new DynamicAwareEntry(uri, properties, lenient);
+        return new DynamicAwareEntry(uri, originalUri, properties, lenient);
     }
 
     @Override
@@ -114,7 +114,7 @@
     }
 
     protected String[] parseUri(DynamicAwareEntry entry) {
-        String u = entry.getOriginalUri();
+        String u = entry.getUri();
 
         // remove scheme prefix (unless its camel-http or camel-http4)
         boolean httpComponent = "http".equals(scheme) || "https".equals(scheme) || "http4".equals(scheme) || "https4".equals(scheme);
