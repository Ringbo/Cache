diff --git a/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/incremental/jar/DefaultJarSnapshotter.java b/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/incremental/jar/DefaultJarSnapshotter.java
index 9cf70b6..3e71836 100644
--- a/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/incremental/jar/DefaultJarSnapshotter.java
+++ b/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/incremental/jar/DefaultJarSnapshotter.java
@@ -89,7 +89,7 @@
 
             try {
                 ClassAnalysis analysis = analyzer.getClassAnalysis(classFileHash, fileDetails);
-                accumulator.addClass(fileDetails.getFile(), analysis);
+                accumulator.addClass(analysis);
                 hashes.put(analysis.getClassName(), classFileHash);
             } catch (Exception e) {
                 accumulator.fullRebuildNeeded("class file " + fileDetails.getName() + " could not be analyzed. See the debug log for more details");
