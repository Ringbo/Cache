diff --git a/openapi/src/com/intellij/openapi/vcs/changes/ChangesUtil.java b/openapi/src/com/intellij/openapi/vcs/changes/ChangesUtil.java
index e40ebfe..45d6328 100644
--- a/openapi/src/com/intellij/openapi/vcs/changes/ChangesUtil.java
+++ b/openapi/src/com/intellij/openapi/vcs/changes/ChangesUtil.java
@@ -63,7 +63,7 @@
   public static Navigatable[] getNavigatableArray(final Project project, final VirtualFile[] selectedFiles) {
     Navigatable[] navigatables = new Navigatable[selectedFiles.length];
     for (int i = 0; i < selectedFiles.length; i++) {
-    navigatables[i] = new OpenFileDescriptor(project, selectedFiles[i], 0);
+      navigatables[i] = new OpenFileDescriptor(project, selectedFiles[i]);
   }
     return navigatables;
   }
