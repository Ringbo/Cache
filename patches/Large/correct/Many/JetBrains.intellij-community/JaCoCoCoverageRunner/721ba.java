diff --git a/plugins/coverage/src/com/intellij/coverage/JaCoCoCoverageRunner.java b/plugins/coverage/src/com/intellij/coverage/JaCoCoCoverageRunner.java
index 866fb58..9d862ce 100644
--- a/plugins/coverage/src/com/intellij/coverage/JaCoCoCoverageRunner.java
+++ b/plugins/coverage/src/com/intellij/coverage/JaCoCoCoverageRunner.java
@@ -90,12 +90,13 @@
       className = className.replace('\\', '.').replace('/', '.');
       final ClassData classData = data.getOrCreateClassData(className);
       final Collection<IMethodCoverage> methods = classCoverage.getMethods();
-      LineData[] lines = new LineData[classCoverage.getLastLine()];
+      LineData[] lines = new LineData[classCoverage.getLastLine() + 1];
       for (IMethodCoverage method : methods) {
         final String desc = method.getName() + method.getDesc();
+        // Line numbers are 1-based here.
         final int firstLine = method.getFirstLine();
         final int lastLine = method.getLastLine();
-        for (int i = firstLine; i < lastLine; i++) {
+        for (int i = firstLine; i <= lastLine; i++) {
           final ILine methodLine = method.getLine(i);
           final int methodLineStatus = methodLine.getStatus();
           final LineData lineData = new LineData(i , desc) {
