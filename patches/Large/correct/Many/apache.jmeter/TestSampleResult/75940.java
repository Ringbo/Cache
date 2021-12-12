diff --git a/test/src/org/apache/jmeter/samplers/TestSampleResult.java b/test/src/org/apache/jmeter/samplers/TestSampleResult.java
index 44d59ef..bdeb6ab 100644
--- a/test/src/org/apache/jmeter/samplers/TestSampleResult.java
+++ b/test/src/org/apache/jmeter/samplers/TestSampleResult.java
@@ -163,7 +163,7 @@
             calculator.addSample(resWithSubResults);
             assertEquals(600, calculator.getTotalBytes());
             assertEquals(1, calculator.getCount());
-            assertEquals(1d / (totalTime / 1000d), calculator.getRate(),0d);
+            assertEquals(1d / (totalTime / 1000d), calculator.getRate(),0.0001d); // Allow for some margin of error
             // Check that the throughput uses the time elapsed for the sub results
             assertFalse(1d / (sampleWithSubResultsTime / 1000d) <= calculator.getRate());
         }
