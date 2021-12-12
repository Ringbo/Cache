diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
index 0c55528..0fd65ed 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsGuess.java
@@ -41,7 +41,7 @@
 
   @Nullable
   public AbstractVcs getVcsForDirty(final VirtualFile file) {
-    if (!file.isInLocalFileSystem()) {
+    if (!file.isInLocalFileSystem() || myExcludedFileIndex == null) {
       return null;
     }
     if (myExcludedFileIndex.isInContent(file) || isFileInBaseDir(file) ||
