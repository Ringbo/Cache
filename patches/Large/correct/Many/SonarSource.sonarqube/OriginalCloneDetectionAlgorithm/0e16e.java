diff --git a/sonar-duplications/src/main/java/org/sonar/duplications/detector/original/OriginalCloneDetectionAlgorithm.java b/sonar-duplications/src/main/java/org/sonar/duplications/detector/original/OriginalCloneDetectionAlgorithm.java
index be93463..46e57fa 100644
--- a/sonar-duplications/src/main/java/org/sonar/duplications/detector/original/OriginalCloneDetectionAlgorithm.java
+++ b/sonar-duplications/src/main/java/org/sonar/duplications/detector/original/OriginalCloneDetectionAlgorithm.java
@@ -156,7 +156,7 @@
           // fixed order) is equal to f(j) and only report in this case.
 
           Block first = currentBlocksGroup.first(originResourceId);
-          if (first.getIndexInFile() == j - 2) {
+          if (first != null && first.getIndexInFile() == j - 2) {
             // Godin: We report clones, which start in i-1 and end in j-2, so length is j-2-(i-1)+1=j-i
             reportClones(sameHashBlocksGroups[i], currentBlocksGroup, j - i);
           }
