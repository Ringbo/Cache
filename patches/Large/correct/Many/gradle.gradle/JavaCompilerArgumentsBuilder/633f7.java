diff --git a/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JavaCompilerArgumentsBuilder.java b/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JavaCompilerArgumentsBuilder.java
index 6451718..b231b18 100644
--- a/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JavaCompilerArgumentsBuilder.java
+++ b/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JavaCompilerArgumentsBuilder.java
@@ -155,7 +155,7 @@
         }
 
         FileCollection sourcepath = compileOptions.getSourcepath();
-        if (!noEmptySourcePath || sourcepath != null && sourcepath.isEmpty()) {
+        if (!noEmptySourcePath || sourcepath != null && !sourcepath.isEmpty()) {
             args.add("-sourcepath");
             args.add(sourcepath == null ? "" : sourcepath.getAsPath());
         }
