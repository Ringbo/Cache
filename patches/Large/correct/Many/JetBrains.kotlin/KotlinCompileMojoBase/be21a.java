diff --git a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/KotlinCompileMojoBase.java b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/KotlinCompileMojoBase.java
index 9bdbecd..041b04b 100644
--- a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/KotlinCompileMojoBase.java
+++ b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/KotlinCompileMojoBase.java
@@ -197,7 +197,7 @@
 
     @Override
     public void execute() throws MojoExecutionException, MojoFailureException {
-        getLog().info("Kotlin version " + KotlinCompilerVersion.VERSION +
+        getLog().debug("Kotlin version " + KotlinCompilerVersion.VERSION +
                 " (JRE " + System.getProperty("java.runtime.version") + ")");
 
         if (!hasKotlinFilesInSources()) {
@@ -433,7 +433,7 @@
         if (sourceRoots.isEmpty()) {
             throw new MojoExecutionException("No source roots to compile");
         }
-        getLog().info("Compiling Kotlin sources from " + sourceRoots);
+        getLog().debug("Compiling Kotlin sources from " + sourceRoots);
         return sourceRoots;
     }
 
