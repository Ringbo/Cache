diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
index f9e7f10..c2f7d20 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
@@ -828,7 +828,7 @@
     }
 
     public String getProxyScheme() {
-        return getPropertyAsString(PROXYSCHEME);
+        return getPropertyAsString(PROXYSCHEME, HTTPHCAbstractImpl.PROXY_SCHEME);
     }
 
     public String getProxyHost() {
