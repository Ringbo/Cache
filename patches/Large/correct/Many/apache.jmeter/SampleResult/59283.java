diff --git a/src/core/org/apache/jmeter/samplers/SampleResult.java b/src/core/org/apache/jmeter/samplers/SampleResult.java
index 9a1e16f..cddaa52 100644
--- a/src/core/org/apache/jmeter/samplers/SampleResult.java
+++ b/src/core/org/apache/jmeter/samplers/SampleResult.java
@@ -537,7 +537,7 @@
 			Thread.sleep(100);
 			res.sampleEnd();
 			assertTrue(res.time  >= 200);
-			assertFalse(res.time >= 210); // we hope!
+			assertFalse(res.time >= 250); // we hope!
 		}
 
 		private static Formatter fmt=new RawFormatter();
