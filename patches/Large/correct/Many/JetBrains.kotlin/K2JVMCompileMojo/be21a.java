diff --git a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JVMCompileMojo.java b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JVMCompileMojo.java
index 92ca920..70c36bf 100644
--- a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JVMCompileMojo.java
+++ b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/K2JVMCompileMojo.java
@@ -168,7 +168,7 @@
         arguments.setDestination(output);
 
         arguments.setModuleName(moduleName);
-        getLog().info("Module name is " + moduleName);
+        getLog().debug("Module name is " + moduleName);
 
         if (arguments.getNoOptimize()) {
             getLog().info("Optimization is turned off");
