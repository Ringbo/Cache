diff --git a/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LifecycleBasePlugin.java b/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LifecycleBasePlugin.java
index 0aa0580..ec2b676 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LifecycleBasePlugin.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LifecycleBasePlugin.java
@@ -57,7 +57,7 @@
             @Override
             public void execute(Delete clean) {
                 clean.setDescription("Deletes the build directory.");
-                clean.setGroup(VERIFICATION_GROUP);
+                clean.setGroup(BUILD_GROUP);
                 clean.delete(new Callable<File>() {
                     public File call() throws Exception {
                         return project.getBuildDir();
