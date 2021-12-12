diff --git a/server/sonar-server/src/main/java/org/sonar/server/computation/task/projectanalysis/filemove/FileMoveDetectionStep.java b/server/sonar-server/src/main/java/org/sonar/server/computation/task/projectanalysis/filemove/FileMoveDetectionStep.java
index b62ef76..a000a76 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/computation/task/projectanalysis/filemove/FileMoveDetectionStep.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/computation/task/projectanalysis/filemove/FileMoveDetectionStep.java
@@ -256,7 +256,7 @@
         continue;
       }
       if (matchesToValidate.size() == 1) {
-        Match match = matches.get(0);
+        Match match = matchesToValidate.get(0);
         electedMatches.add(match);
       } else {
         matchesPerFileForScore.clear();
