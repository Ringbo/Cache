diff --git a/subprojects/docs/src/samples/toolingApi/composite-tasks/src/main/java/org/gradle/sample/Main.java b/subprojects/docs/src/samples/toolingApi/composite-tasks/src/main/java/org/gradle/sample/Main.java
index 4c3c6ba..616b31c 100644
--- a/subprojects/docs/src/samples/toolingApi/composite-tasks/src/main/java/org/gradle/sample/Main.java
+++ b/subprojects/docs/src/samples/toolingApi/composite-tasks/src/main/java/org/gradle/sample/Main.java
@@ -85,7 +85,7 @@
         for (ModelResult<GradleProject> gradleProjectModelResult : gradleProjects) {
             GradleProject gradleProject = gradleProjectModelResult.getModel();
             if (gradleProject.getProjectDirectory().equals(interestingProjectDir)) {
-                buildIdentifier = gradleProject.getIdentifier().getBuildIdentifier();
+                buildIdentifier = gradleProject.getProjectIdentifier().getBuildIdentifier();
             }
         }
         return buildIdentifier;
@@ -93,7 +93,7 @@
 
     private static boolean interestedInProject(GradleProject gradleProject, BuildIdentifier buildIdentifier) {
         // Gradle project is a member of the build we're interested in
-        return gradleProject.getIdentifier().getBuildIdentifier().equals(buildIdentifier);
+        return gradleProject.getProjectIdentifier().getBuildIdentifier().equals(buildIdentifier);
     }
 
     private static List<Launchable> getBuildTasksFromGradleProject(GradleProject gradleProject) {
