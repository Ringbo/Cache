diff --git a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/scanner/suite/IssuesModeTest.java b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/scanner/suite/IssuesModeTest.java
index 3324c46..fd930cd 100644
--- a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/scanner/suite/IssuesModeTest.java
+++ b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/scanner/suite/IssuesModeTest.java
@@ -68,6 +68,6 @@
     long duration = System.currentTimeMillis() - start;
     System.out.println("Issues analysis: " + duration + "ms");
 
-    perfRule.assertDurationAround(duration, 4200L);
+    perfRule.assertDurationAround(duration, 3600L);
   }
 }
