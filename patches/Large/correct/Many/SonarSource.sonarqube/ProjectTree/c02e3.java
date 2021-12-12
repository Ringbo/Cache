diff --git a/sonar-batch/src/main/java/org/sonar/batch/ProjectTree.java b/sonar-batch/src/main/java/org/sonar/batch/ProjectTree.java
index 69c4828..0381c71 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/ProjectTree.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/ProjectTree.java
@@ -87,7 +87,7 @@
     }
 
     // Configure test directories
-    for (String dir : project.getSourceDirs()) {
+    for (String dir : project.getTestDirs()) {
       pom.addTestCompileSourceRoot(dir);
     }
 
