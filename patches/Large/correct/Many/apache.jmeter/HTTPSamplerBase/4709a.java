diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
index 1bcbc06..f73564f 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
@@ -1127,7 +1127,7 @@
             }
             
             // For concurrent get resources
-            final ArrayList<ASyncSample> liste = new ArrayList<ASyncSample>();
+            final List<Callable<HTTPSampleResult>> liste = new ArrayList<Callable<HTTPSampleResult>>();
             
             while (urls.hasNext()) {
                 Object binURL = urls.next(); // See catch clause below
