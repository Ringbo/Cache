diff --git a/platform/lang-impl/src/com/intellij/lang/javascript/boilerplate/AbstractGithubTagDownloadedProjectGenerator.java b/platform/lang-impl/src/com/intellij/lang/javascript/boilerplate/AbstractGithubTagDownloadedProjectGenerator.java
index 7534df4..5af6db0 100644
--- a/platform/lang-impl/src/com/intellij/lang/javascript/boilerplate/AbstractGithubTagDownloadedProjectGenerator.java
+++ b/platform/lang-impl/src/com/intellij/lang/javascript/boilerplate/AbstractGithubTagDownloadedProjectGenerator.java
@@ -64,7 +64,7 @@
       unpackToDir(project, new File(baseDir.getPath()), tag);
     }
     catch (GeneratorException e) {
-      showErrorMessage(null, e.getMessage());
+      showErrorMessage(project, e.getMessage());
     }
     ApplicationManager.getApplication().runWriteAction(new Runnable() {
       @Override
@@ -149,7 +149,7 @@
     return GithubDownloadUtil.findCacheFile(getGithubUserName(), getGithubRepositoryName(), fileName);
   }
 
-  private void showErrorMessage(@Nullable Project project, @NotNull String message) {
+  private void showErrorMessage(@NotNull Project project, @NotNull String message) {
     String fullMessage = "Error creating " + getDisplayName() + " project. " + message;
     String title = "Create " + getDisplayName() + " Project";
     Messages.showErrorDialog(project, fullMessage, title);
