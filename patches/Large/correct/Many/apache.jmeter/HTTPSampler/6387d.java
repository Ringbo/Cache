diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
index f902669..6cb7294 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
@@ -889,7 +889,7 @@
                 log.debug("sample2 : sampling url - " + u);
             }
             conn = setupConnection(u, getMethod());
-            if (getProperty(HTTPSampler.METHOD).equals(HTTPSampler.POST))
+            if (getMethod().equals(HTTPSampler.POST))
             {
                 setPostHeaders(conn);
                 time = connect();
