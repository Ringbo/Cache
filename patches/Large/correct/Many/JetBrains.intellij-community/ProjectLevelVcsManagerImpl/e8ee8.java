diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
index b99b6e1..109f6f7 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
@@ -574,7 +574,7 @@
     if (haveNonEmptyMappings || !defaultProject) {
       myMappingsLoaded = true;
     }
-    StartupManager.getInstance(myProject).registerStartupActivity(new Runnable() {
+    StartupManager.getInstance(myProject).runWhenProjectIsInitialized(new Runnable() {
       public void run() {
         myMappings.setDirectoryMappings(mappingsList);
       }
