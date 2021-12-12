diff --git a/tests/src/test/java/org/sonarqube/tests/performance/scanner/HighlightingTest.java b/tests/src/test/java/org/sonarqube/tests/performance/scanner/HighlightingTest.java
index 09acfe7..56eb126 100644
--- a/tests/src/test/java/org/sonarqube/tests/performance/scanner/HighlightingTest.java
+++ b/tests/src/test/java/org/sonarqube/tests/performance/scanner/HighlightingTest.java
@@ -100,7 +100,7 @@
     perfRule.assertDurationAround(MavenLogs.extractTotalTime(result.getLogs()), 25700L);
 
     Properties prof = readProfiling(baseDir, "highlighting");
-    perfRule.assertDurationAround(Long.valueOf(prof.getProperty("Xoo Highlighting Sensor")), 9700L);
+    perfRule.assertDurationAround(Long.valueOf(prof.getProperty("Xoo Highlighting Sensor")), 8900L);
 
   }
 }
