diff --git a/test/src/org/apache/jmeter/functions/TestDigestFunction.java b/test/src/org/apache/jmeter/functions/TestDigestFunction.java
index 9b7ca37..5712228 100644
--- a/test/src/org/apache/jmeter/functions/TestDigestFunction.java
+++ b/test/src/org/apache/jmeter/functions/TestDigestFunction.java
@@ -50,7 +50,7 @@
 
     @Before
     public void setUp() {
-    	digest = new DigestEncode();
+    	digest = new DigestEncodeFunction();
         result = new SampleResult();
         jmctx = JMeterContextService.getContext();
         String data = "dummy data";
