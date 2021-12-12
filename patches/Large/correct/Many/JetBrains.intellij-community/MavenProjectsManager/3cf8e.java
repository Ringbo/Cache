diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
index 643792f..3ac377f 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
@@ -722,7 +722,7 @@
     wrapper.set(new Runnable() {
       public void run() {
         if (!StartupManagerEx.getInstanceEx(myProject).postStartupActivityPassed()) {
-          mySchedulesQueue.queue(new Update(MavenProjectsManager.this) {
+          mySchedulesQueue.queue(new Update(runnable) { // should not remove previously schedules tasks
             public void run() {
               wrapper.get().run();
             }
