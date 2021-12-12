diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
index 9bc927b..ba05c5b 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
@@ -584,7 +584,9 @@
 	protected HTTPSampleResult downloadPageResources(HTTPSampleResult res, HTTPSampleResult container, int frameDepth) {
 		Iterator urls = null;
 		try {
-			if (res.getContentType().toLowerCase().indexOf("text/html") != -1) { // $NON-NLS-1$
+			if (res.getContentType().toLowerCase().indexOf("text/html") != -1  // $NON-NLS-1$
+                    && res.getResponseData().length > 0) // Bug 39205
+            {
 				urls = HTMLParser.getParser().getEmbeddedResourceURLs(res.getResponseData(), res.getURL());
 			}
 		} catch (HTMLParseException e) {
