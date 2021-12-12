diff --git a/openapi/src/com/intellij/openapi/vcs/AbstractVcs.java b/openapi/src/com/intellij/openapi/vcs/AbstractVcs.java
index 4f0f135..5ae7909 100644
--- a/openapi/src/com/intellij/openapi/vcs/AbstractVcs.java
+++ b/openapi/src/com/intellij/openapi/vcs/AbstractVcs.java
@@ -192,7 +192,7 @@
     return myStatusOption;
   }
 
-  public final void loadSettings() {
+  public void loadSettings() {
     final ProjectLevelVcsManager vcsManager = ProjectLevelVcsManager.getInstance(myProject);
 
     if (getCheckinEnvironment() != null) {
