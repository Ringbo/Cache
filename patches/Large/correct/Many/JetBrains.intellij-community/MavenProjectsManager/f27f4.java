diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
index 3dba83e..8698bcf 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
@@ -247,7 +247,7 @@
     myImportingQueue.makeDumbAware(myProject);
 
     mySchedulesQueue = new MavenMergingUpdateQueue(getComponentName() + ": Schedules queue", 1000, true, myProject);
-    mySchedulesQueue.setPassThrough(true);
+    mySchedulesQueue.setPassThrough(false);
   }
 
   private void listenForSettingsChanges() {
@@ -632,7 +632,7 @@
     wrapper.set(new Runnable() {
       public void run() {
         if (!StartupManagerEx.getInstanceEx(myProject).postStartupActivityPassed()) {
-          mySchedulesQueue.queue(new Update(this) {
+          mySchedulesQueue.queue(new Update(MavenProjectsManager.this) {
             public void run() {
               wrapper.get().run();
             }
