diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java
index 766126c..200a851 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java
@@ -531,7 +531,7 @@
 			// peter lin.
             // Removed URL, as that is already stored elsewere
 			result.setSamplerData(fileContents);// WARNING - could be large
-			result.setDataEncoding(st.getResponseSOAPContext().getContentType());
+			result.setEncodingAndType(st.getResponseSOAPContext().getContentType());
 			// setting this is just a formality, since
 			// soap will return a descriptive error
 			// message, soap errors within the response
