diff --git a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java
index 866b31e..ca2520b 100644
--- a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java
+++ b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java
@@ -66,7 +66,7 @@
       List<String> lines = readLogLines(orchestrator);
       long firstStopLogDate = ServerLogs.extractFirstDate(lines).getTime();
       long stopDate = extractStopDate(lines);
-      assertDurationLessThan(stopDate - firstStopLogDate, 10000);
+      assertDurationLessThan(stopDate - firstStopLogDate, 10_000);
 
     } finally {
       orchestrator.stop();
