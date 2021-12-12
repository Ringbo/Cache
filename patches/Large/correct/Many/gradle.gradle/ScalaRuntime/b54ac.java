diff --git a/subprojects/scala/src/main/groovy/org/gradle/api/tasks/ScalaRuntime.java b/subprojects/scala/src/main/groovy/org/gradle/api/tasks/ScalaRuntime.java
index 83a2dbc..0f43b56 100644
--- a/subprojects/scala/src/main/groovy/org/gradle/api/tasks/ScalaRuntime.java
+++ b/subprojects/scala/src/main/groovy/org/gradle/api/tasks/ScalaRuntime.java
@@ -53,10 +53,9 @@
 public class ScalaRuntime {
     private static final Pattern SCALA_JAR_PATTERN = Pattern.compile("scala-(\\w.*?)-(\\d.*).jar");
 
-    // should be private but Groovy can't handle this
-    protected final Project project;
+    private final Project project;
 
-    ScalaRuntime(Project project) {
+    public ScalaRuntime(Project project) {
         this.project = project;
     }
 
@@ -127,7 +126,7 @@
     public File findScalaJar(Iterable<File> classpath, String appendix) {
         for (File file : classpath) {
             Matcher matcher = SCALA_JAR_PATTERN.matcher(file.getName());
-            if (matcher.matches() && matcher.group(1) == appendix) {
+            if (matcher.matches() && matcher.group(1).equals(appendix)) {
                 return file;
             }
         }
