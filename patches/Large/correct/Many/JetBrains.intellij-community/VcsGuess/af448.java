diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
index be7d09d..8941491 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
@@ -53,7 +53,7 @@
       return null;
     }
     if (myExcludedFileIndex.isInContent(validParent) || isFileInBaseDir(filePath) ||
-        myVcsManager.hasExplicitMapping(filePath) || isInDirectoryBasedRoot(validParent)) {
+        myVcsManager.hasExplicitMapping(validParent) || isInDirectoryBasedRoot(validParent)) {
       if (myExcludedFileIndex.isExcludedFile(validParent)) {
         return null;
       }
