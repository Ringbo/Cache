diff --git a/test/src/org/apache/jmeter/protocol/http/sampler/HTTPSampler3.java b/test/src/org/apache/jmeter/protocol/http/sampler/HTTPSampler3.java
index 73370c7..faa3b8e 100644
--- a/test/src/org/apache/jmeter/protocol/http/sampler/HTTPSampler3.java
+++ b/test/src/org/apache/jmeter/protocol/http/sampler/HTTPSampler3.java
@@ -50,6 +50,6 @@
      */
     @Override
     public void testIterationStart(LoopIterationEvent event) {
-        hc.testIterationStart(event);
+        hc.notifyFirstSampleAfterLoopRestart();
     }
 }
