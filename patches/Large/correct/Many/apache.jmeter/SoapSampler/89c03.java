diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java
index b28422c..9c9da58 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java
@@ -260,7 +260,7 @@
 
             if (instream != null) {// will be null for HEAD
 
-                org.apache.commons.httpclient.Header responseHeader = httpMethod.getResponseHeader(TRANSFER_ENCODING);
+                org.apache.commons.httpclient.Header responseHeader = httpMethod.getResponseHeader(HEADER_CONTENT_ENCODING);
                 if (responseHeader != null && ENCODING_GZIP.equals(responseHeader.getValue())) {
                     instream = new GZIPInputStream(instream);
                 }
