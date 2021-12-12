diff --git a/platform/core-impl/src/com/intellij/psi/impl/file/impl/FileManagerImpl.java b/platform/core-impl/src/com/intellij/psi/impl/file/impl/FileManagerImpl.java
index 7b4e9ec..c048204 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/file/impl/FileManagerImpl.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/file/impl/FileManagerImpl.java
@@ -408,7 +408,7 @@
     PsiDirectory psiDir = myVFileToPsiDirMap.get(vFile);
     if (psiDir != null) return psiDir;
 
-    if (Registry.is("ide.hide.excluded.files")) {
+    if (Registry.is("ide.hide.excluded.files", true)) {
       if (myFileIndex.isExcludedFile(vFile)) return null;
     }
     else {
