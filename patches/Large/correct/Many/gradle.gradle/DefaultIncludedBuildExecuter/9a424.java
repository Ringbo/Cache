diff --git a/subprojects/composite-builds/src/main/java/org/gradle/composite/internal/DefaultIncludedBuildExecuter.java b/subprojects/composite-builds/src/main/java/org/gradle/composite/internal/DefaultIncludedBuildExecuter.java
index a828faf..62a2a0d 100644
--- a/subprojects/composite-builds/src/main/java/org/gradle/composite/internal/DefaultIncludedBuildExecuter.java
+++ b/subprojects/composite-builds/src/main/java/org/gradle/composite/internal/DefaultIncludedBuildExecuter.java
@@ -43,9 +43,8 @@
         this.includedBuilds = includedBuilds;
     }
 
-    // TODO Allow parallel execution of different included builds
     @Override
-    public synchronized void execute(ProjectComponentIdentifier buildIdentifier, Iterable<String> taskNames) {
+    public void execute(ProjectComponentIdentifier buildIdentifier, Iterable<String> taskNames) {
         String buildName = getBuildName(buildIdentifier);
         buildStarted(buildName);
         try {
@@ -62,14 +61,16 @@
         return buildIdentifier.getProjectPath().split("::", 2)[0];
     }
 
-    private void buildStarted(String build) {
+    private synchronized void buildStarted(String build) {
+        // Ensure that a particular build is never executing concurrently
+        // TODO:DAZ We might need to hold a lock per-build for the parallel build case
         if (!executingBuilds.add(build)) {
             ProjectComponentSelector selector = DefaultProjectComponentSelector.newSelector(build + "::");
             throw new ModuleVersionResolveException(selector, "Dependency cycle including project " + selector.getProjectPath());
         }
     }
 
-    private void buildCompleted(String project) {
+    private synchronized void buildCompleted(String project) {
         executingBuilds.remove(project);
     }
 
