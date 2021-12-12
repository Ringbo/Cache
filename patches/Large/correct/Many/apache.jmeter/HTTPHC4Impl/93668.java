diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
index 15cbc7d..79429ae 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
@@ -792,7 +792,8 @@
 
             // Write the request to our own stream
             MultipartEntity multiPart = new MultipartEntity(
-                    getDoBrowserCompatibleMultipart() ? HttpMultipartMode.BROWSER_COMPATIBLE : HttpMultipartMode.STRICT);
+                    getDoBrowserCompatibleMultipart() ? HttpMultipartMode.BROWSER_COMPATIBLE : HttpMultipartMode.STRICT,
+                            null, Charset.forName(contentEncoding));
             // Create the parts
             // Add any parameters
             PropertyIterator args = getArguments().iterator();
