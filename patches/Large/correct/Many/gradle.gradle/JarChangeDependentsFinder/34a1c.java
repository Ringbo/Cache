diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/jar/JarChangeDependentsFinder.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/jar/JarChangeDependentsFinder.java
index dfe765a..ad85e88 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/jar/JarChangeDependentsFinder.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/jar/JarChangeDependentsFinder.java
@@ -34,9 +34,12 @@
     //TODO SF coverage
     public DependentsSet getActualDependents(InputFileDetails jarChangeDetails, JarArchive jarArchive) {
         if (jarChangeDetails.isAdded()) {
-            //TODO SF consider the case where newly added jar contains a duplicate class and the new jar ends up higher on the classpath
-            //we should probably fix the tests and rebuild everything in case a jar is added.
-            return new DefaultDependentsSet();
+            //TODO - potentially
+            //the new jar may contain a duplicate class and appear earlier on the classpath, for safety, we'll rebuild everything
+            //this can be improved - we can snapshot the jars on classpath beforehand and keep track of duplicate classes or model the classpath snapshot
+            //this way we will know if the new jar with duplicate class is earlier or later on the classpath.
+            //If later, we would not recompile, if earlier, we would recompile only classes that depend on duplicate classes
+            return new DefaultDependentsSet(true);
         }
         JarSnapshot existing = previousCompilation.getJarSnapshot(jarChangeDetails.getFile());
 
