diff --git a/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java b/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
index 3e92920..01e6c8d 100644
--- a/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
+++ b/vcs-impl/src/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
@@ -428,7 +428,8 @@
   public void addMessageToConsoleWindow(final String message, final TextAttributes attributes) {
     ApplicationManager.getApplication().invokeLater(new Runnable() {
       public void run() {
-        if (myProject.isDisposed()) return;
+        // for default and disposed projects the ContentManager is not available.
+        if (myProject.isDisposed() || myProject.isDefault()) return;
         getOrCreateConsoleContent(getContentManager());
         myEditorAdapter.appendString(message, attributes);
       }
