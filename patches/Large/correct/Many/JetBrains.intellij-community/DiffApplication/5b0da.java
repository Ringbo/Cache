diff --git a/platform/platform-api/src/com/intellij/openapi/diff/DiffApplication.java b/platform/platform-api/src/com/intellij/openapi/diff/DiffApplication.java
index eacb902..9c87b23 100644
--- a/platform/platform-api/src/com/intellij/openapi/diff/DiffApplication.java
+++ b/platform/platform-api/src/com/intellij/openapi/diff/DiffApplication.java
@@ -88,7 +88,7 @@
   }
 
   private static VirtualFile findFile(final String path1) throws FileNotFoundException {
-    final VirtualFile vFile = LocalFileSystem.getInstance().findFileByIoFile(new File(path1));
+    final VirtualFile vFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(new File(path1));
     if (vFile == null) {
       throw new FileNotFoundException(DiffBundle.message("cannot.file.file.error.message", path1));
     }
