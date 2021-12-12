diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
index 7eb174f..2134d54 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
@@ -975,7 +975,9 @@
         pathAndQuery.append(path);
 
         // Add the query string if it is a HTTP GET or DELETE request
-        if (HTTPConstants.GET.equals(getMethod()) || HTTPConstants.DELETE.equals(getMethod())) {
+        if (HTTPConstants.GET.equals(getMethod()) 
+                || HTTPConstants.DELETE.equals(getMethod())
+                || HTTPConstants.OPTIONS.equals(getMethod())) {
             // Get the query string encoded in specified encoding
             // If no encoding is specified by user, we will get it
             // encoded in UTF-8, which is what the HTTP spec says
