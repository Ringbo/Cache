diff --git a/src/main/org/codehaus/groovy/tools/javac/JavacJavaCompiler.java b/src/main/org/codehaus/groovy/tools/javac/JavacJavaCompiler.java
index d63aba5..380c496 100644
--- a/src/main/org/codehaus/groovy/tools/javac/JavacJavaCompiler.java
+++ b/src/main/org/codehaus/groovy/tools/javac/JavacJavaCompiler.java
@@ -128,7 +128,7 @@
         // append classpath if not already defined
         if (!hadClasspath) {
             // add all classpaths that compilation unit sees
-            StringBuffer resultPath = new StringBuffer(DefaultGroovyMethods.join(config.getClasspath(), File.pathSeparator));
+            StringBuilder resultPath = new StringBuilder(DefaultGroovyMethods.join(config.getClasspath(), File.pathSeparator));
             ClassLoader cl = parentClassLoader;
             while (cl != null) {
                 if (cl instanceof URLClassLoader) {
