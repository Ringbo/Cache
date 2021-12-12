diff --git a/refactoring/impl/com/intellij/refactoring/move/moveFilesOrDirectories/MoveFilesOrDirectoriesUtil.java b/refactoring/impl/com/intellij/refactoring/move/moveFilesOrDirectories/MoveFilesOrDirectoriesUtil.java
index 469a278..d25bd38 100644
--- a/refactoring/impl/com/intellij/refactoring/move/moveFilesOrDirectories/MoveFilesOrDirectoriesUtil.java
+++ b/refactoring/impl/com/intellij/refactoring/move/moveFilesOrDirectories/MoveFilesOrDirectoriesUtil.java
@@ -60,7 +60,7 @@
     }
 
     final PsiDirectory targetDirectory = resolveToDirectory(project, initialTargetElement);
-    if ( targetDirectory == null ) return;
+    if ( initialTargetElement != null && targetDirectory == null ) return;
     
     final PsiDirectory initialTargetDirectory = getInitialTargetDirectory(targetDirectory, elements);
 
