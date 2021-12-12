diff --git a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JSCompilerMojo.java b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JSCompilerMojo.java
index 74377f8..cc4106e 100644
--- a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JSCompilerMojo.java
+++ b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JSCompilerMojo.java
@@ -131,7 +131,7 @@
             }
         }
 
-        arguments.setSourceMapSourceRoots(sourceMapSourceRoots.toString());
+        arguments.setSourceMapBaseDirs(sourceMapSourceRoots.toString());
     }
 
     protected List<String> getClassPathElements() throws DependencyResolutionRequiredException {
