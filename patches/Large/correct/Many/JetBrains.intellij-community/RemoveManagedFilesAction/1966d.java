diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/actions/RemoveManagedFilesAction.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/actions/RemoveManagedFilesAction.java
index 37ea7d5..bb30581 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/actions/RemoveManagedFilesAction.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/actions/RemoveManagedFilesAction.java
@@ -78,7 +78,7 @@
   private static void notifyUser(DataContext context, MavenProject mavenProject, MavenProject aggregator) {
     String aggregatorDescription = " (" + aggregator.getMavenId().getDisplayString() + ')';
     Notification notification = new Notification(MavenUtil.MAVEN_NOTIFICATION_GROUP, "Failed to remove project",
-                                                 "You can not remove " + mavenProject.getName() + " because it's " +
+                                                 "You can not remove " + mavenProject.getDisplayName() + " because it's " +
                                                  "imported as a module of another project" +
                                                  aggregatorDescription
                                                  + ". You can use Ignore action. Only root project can be removed.",
