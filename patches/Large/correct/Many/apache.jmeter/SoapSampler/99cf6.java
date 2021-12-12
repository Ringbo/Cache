diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java
index 1fbc610..b28422c 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/SoapSampler.java
@@ -142,7 +142,7 @@
             }
         } else {
             // otherwise we use "text/xml" as the default
-            post.addParameter(HEADER_CONTENT_TYPE, DEFAULT_CONTENT_TYPE); //$NON-NLS-1$
+            post.setRequestHeader(HEADER_CONTENT_TYPE, DEFAULT_CONTENT_TYPE); //$NON-NLS-1$
         }
         if (getSendSOAPAction()) {
             post.setRequestHeader(SOAPACTION, getSOAPActionQuoted());
