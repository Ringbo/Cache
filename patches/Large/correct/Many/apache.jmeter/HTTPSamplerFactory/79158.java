diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerFactory.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerFactory.java
index c737eae..772cadf 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerFactory.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerFactory.java
@@ -93,7 +93,7 @@
         }
         if (IMPL_JAVA.equals(impl) || HTTP_SAMPLER_JAVA.equals(impl)) {
             return new HTTPJavaImpl(base);
-        } else if (IMPL_HTTP_CLIENT4.equals(impl)) {
+        } else if (IMPL_HTTP_CLIENT4.equals(impl) || IMPL_HTTP_CLIENT3_1.equals(impl)) {
             return new HTTPHC4Impl(base);
         } else {
             throw new IllegalArgumentException("Unknown implementation type: '"+impl+"'");
