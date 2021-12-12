diff --git a/src/main/org/codehaus/groovy/ant/Groovyc.java b/src/main/org/codehaus/groovy/ant/Groovyc.java
index ad7d930..9903bf5 100644
--- a/src/main/org/codehaus/groovy/ant/Groovyc.java
+++ b/src/main/org/codehaus/groovy/ant/Groovyc.java
@@ -380,9 +380,9 @@
             }
 
             try {
-                String classpath = getClasspath().toString();
+                Path classpath = getClasspath();
                 if (classpath != null) {
-                    compiler.setClasspath(classpath);
+                    compiler.setClasspath(classpath.toString());
                 }
                 compiler.setOutputDir(destDir);
                 compiler.compile(compileList);
