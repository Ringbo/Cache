diff --git a/plugins/android/src/org/jetbrains/android/newProject/AndroidModuleBuilder.java b/plugins/android/src/org/jetbrains/android/newProject/AndroidModuleBuilder.java
index 4e85f29..4f7b52e44 100644
--- a/plugins/android/src/org/jetbrains/android/newProject/AndroidModuleBuilder.java
+++ b/plugins/android/src/org/jetbrains/android/newProject/AndroidModuleBuilder.java
@@ -231,7 +231,7 @@
                       createChildDirectoryIfNotExist(project, contentRoot, SdkConstants.FD_NATIVE_LIBS);
                     }
                     VirtualFile srcDir = contentRoot.findChild(SdkConstants.FD_SOURCES);
-                    if (srcDir != sourceRoot) {
+                    if (srcDir != sourceRoot && sourceRoot != null) {
                       moveContentAndRemoveDir(project, srcDir, sourceRoot);
                     }
                   }
@@ -254,7 +254,7 @@
     return true;
   }
 
-  private static void moveContentAndRemoveDir(Project project, VirtualFile from, VirtualFile to) throws IOException {
+  private static void moveContentAndRemoveDir(Project project, VirtualFile from, @NotNull VirtualFile to) throws IOException {
     for (VirtualFile child : from.getChildren()) {
       child.move(project, to);
     }
