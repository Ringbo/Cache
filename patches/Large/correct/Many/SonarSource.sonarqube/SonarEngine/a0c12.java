diff --git a/plugins/sonar-cpd-plugin/src/main/java/org/sonar/plugins/cpd/SonarEngine.java b/plugins/sonar-cpd-plugin/src/main/java/org/sonar/plugins/cpd/SonarEngine.java
index d686be8..7fe2852 100644
--- a/plugins/sonar-cpd-plugin/src/main/java/org/sonar/plugins/cpd/SonarEngine.java
+++ b/plugins/sonar-cpd-plugin/src/main/java/org/sonar/plugins/cpd/SonarEngine.java
@@ -176,7 +176,7 @@
       for (ClonePart part : clone.getCloneParts()) {
         if (part.getResourceId().equals(origin.getResourceId())) {
           duplicatedBlocks++;
-          for (int duplicatedLine = part.getStartLine(); duplicatedLine < part.getEndLine() + part.getLines(); duplicatedLine++) {
+          for (int duplicatedLine = part.getStartLine(); duplicatedLine < part.getStartLine() + part.getLines(); duplicatedLine++) {
             duplicatedLines.add(duplicatedLine);
           }
         }
