diff --git a/test/src/org/apache/jmeter/samplers/TestSampleResult.java b/test/src/org/apache/jmeter/samplers/TestSampleResult.java
index b582448..0fc9bde 100644
--- a/test/src/org/apache/jmeter/samplers/TestSampleResult.java
+++ b/test/src/org/apache/jmeter/samplers/TestSampleResult.java
@@ -143,7 +143,7 @@
             SampleResult res = new SampleResult();
             
             res.sampleStart();
-            res.setBytes(100);
+            res.setBytes(100L);
             res.setSampleLabel("sample of size 100 bytes");
             res.sampleEnd();
             assertEquals(100, res.getBytesAsLong());
@@ -217,7 +217,7 @@
 
             parent.sampleStart();
             Thread.sleep(100);
-            parent.setBytes(300);
+            parent.setBytes(300L);
             parent.setSampleLabel("Parent Sample");
             parent.setSuccessful(true);
             parent.sampleEnd();
@@ -227,7 +227,7 @@
             SampleResult child1 = new SampleResult(nanoTime);            
             child1.sampleStart();
             Thread.sleep(100);
-            child1.setBytes(100);
+            child1.setBytes(100L);
             child1.setSampleLabel("Child1 Sample");
             child1.setSuccessful(true);
             child1.sampleEnd();
@@ -250,7 +250,7 @@
             SampleResult child2 = new SampleResult(nanoTime);            
             child2.sampleStart();
             Thread.sleep(100);
-            child2.setBytes(200);
+            child2.setBytes(200L);
             child2.setSampleLabel("Child2 Sample");
             child2.setSuccessful(true);
             child2.sampleEnd();
