diff --git a/subprojects/plugins/src/main/java/org/gradle/api/distribution/plugins/DistributionPlugin.java b/subprojects/plugins/src/main/java/org/gradle/api/distribution/plugins/DistributionPlugin.java
index c2be297..431206c 100644
--- a/subprojects/plugins/src/main/java/org/gradle/api/distribution/plugins/DistributionPlugin.java
+++ b/subprojects/plugins/src/main/java/org/gradle/api/distribution/plugins/DistributionPlugin.java
@@ -97,21 +97,21 @@
         distributions.create(MAIN_DISTRIBUTION_NAME);
     }
 
-    private <T extends AbstractArchiveTask> TaskProvider<T> configureArchiveTask(Project project, String taskName, final Distribution distribution, Class<T> type) {
+    private <T extends AbstractArchiveTask> TaskProvider<T> configureArchiveTask(final Project project, String taskName, final Distribution distribution, Class<T> type) {
         final TaskProvider<T> archiveTask = project.getTasks().register(taskName, type, new Action<T>() {
             @Override
             public void execute(T archiveTask) {
                 archiveTask.setDescription("Bundles the project as a distribution.");
                 archiveTask.setGroup(DISTRIBUTION_GROUP);
-                archiveTask.getConventionMapping().map("baseName", new Callable<Object>() {
+                archiveTask.getArchiveBaseName().set(project.provider(new Callable<String>() {
                     @Override
-                    public Object call() throws Exception {
+                    public String call() throws Exception {
                         if (distribution.getBaseName() == null || distribution.getBaseName().equals("")) {
                             throw new GradleException("Distribution baseName must not be null or empty! Check your configuration of the distribution plugin.");
                         }
                         return distribution.getBaseName();
                     }
-                });
+                }));
             }
         });
 
