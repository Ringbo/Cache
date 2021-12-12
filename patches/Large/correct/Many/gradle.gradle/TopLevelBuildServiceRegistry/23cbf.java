diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/project/TopLevelBuildServiceRegistry.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/project/TopLevelBuildServiceRegistry.java
index 83495bc..747dc67 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/project/TopLevelBuildServiceRegistry.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/project/TopLevelBuildServiceRegistry.java
@@ -225,7 +225,7 @@
     protected ProjectAccessListener createProjectAccessListener() {
         return new ProjectAccessListener() {
             public void beforeRequestingTaskByPath(ProjectInternal targetProject) {
-                targetProject.evaluate();
+                targetProject.ensureEvaluated();
             }
 
             public void beforeResolvingProjectDependency(ProjectInternal dependencyProject) {
