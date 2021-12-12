diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/project/DefaultProject.java b/subprojects/core/src/main/java/org/gradle/api/internal/project/DefaultProject.java
index 2a5592e..33f1a47 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/project/DefaultProject.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/project/DefaultProject.java
@@ -610,7 +610,7 @@
 
     @Override
     public void subprojects(Action<? super Project> action) {
-        new ProjectConfigureBlockBuildOperation("subprojects", getAllprojects(), gradle.getBuildOperationExecutor()).runConfigureAction(action);
+        new ProjectConfigureBlockBuildOperation("subprojects", getSubprojects(), gradle.getBuildOperationExecutor()).runConfigureAction(action);
     }
 
     @Override
@@ -1085,7 +1085,7 @@
 
     @Override
     public void subprojects(Closure configureClosure) {
-        new ProjectConfigureBlockBuildOperation("subprojects", getAllprojects(), gradle.getBuildOperationExecutor()).runConfigureClosure(configureClosure);
+        new ProjectConfigureBlockBuildOperation("subprojects", getSubprojects(), gradle.getBuildOperationExecutor()).runConfigureClosure(configureClosure);
     }
 
     @Override
