diff --git a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java
index 3fb1ce2..ca2520b 100644
--- a/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java
+++ b/tests/perf/src/test/java/org/sonarsource/sonarqube/perf/server/ServerTest.java
@@ -58,7 +58,7 @@
       // compare dates of first and last log
       long firstLogDate = ServerLogs.extractFirstDate(readLogLines(orchestrator)).getTime();
       long startedAtDate = extractStartedAtDate(orchestrator);
-      assertDurationAround(startedAtDate - firstLogDate, 45000);
+      assertDurationAround(startedAtDate - firstLogDate, 38_000);
 
       ServerLogs.clear(orchestrator);
       orchestrator.stop();
@@ -66,7 +66,7 @@
       List<String> lines = readLogLines(orchestrator);
       long firstStopLogDate = ServerLogs.extractFirstDate(lines).getTime();
       long stopDate = extractStopDate(lines);
-      assertDurationLessThan(stopDate - firstStopLogDate, 10000);
+      assertDurationLessThan(stopDate - firstStopLogDate, 10_000);
 
     } finally {
       orchestrator.stop();
