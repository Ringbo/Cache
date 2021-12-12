diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
index 775210e..39086f3 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
@@ -78,7 +78,7 @@
         final boolean inContent = myVcsManager.isFileInContent(validParent);
         if (inContent) return true;
         if (filePath != null) {
-          return isFileInBaseDir(filePath, myProject.getBaseDir()) && ! ! myExcludedFileIndex.isExcludedFile(validParent);
+          return isFileInBaseDir(filePath, myProject.getBaseDir()) && ! myExcludedFileIndex.isExcludedFile(validParent);
         }
         return false;
       }
