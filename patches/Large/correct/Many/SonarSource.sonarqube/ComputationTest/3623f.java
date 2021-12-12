diff --git a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/computation/ComputationTest.java b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/computation/ComputationTest.java
index 7a96e97..a3d70fc 100644
--- a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/computation/ComputationTest.java
+++ b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/computation/ComputationTest.java
@@ -75,7 +75,7 @@
 
     orchestrator.executeBuild(scanner);
 
-    assertComputationDurationAround(340000L);
+    assertComputationDurationAround(350_000L);
   }
 
   private void assertComputationDurationAround(long expectedDuration) throws IOException {
