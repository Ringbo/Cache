diff --git a/source/com/intellij/psi/impl/file/impl/FileManagerImpl.java b/source/com/intellij/psi/impl/file/impl/FileManagerImpl.java
index 26e7869..0e5a1ed 100644
--- a/source/com/intellij/psi/impl/file/impl/FileManagerImpl.java
+++ b/source/com/intellij/psi/impl/file/impl/FileManagerImpl.java
@@ -378,10 +378,10 @@
 
   public PsiDirectory findDirectory(VirtualFile vFile) {
     LOG.assertTrue(myInitialized, "Access to psi files should be performed only after startup activity");
-    LOG.assertTrue(!myDisposed);
+    LOG.assertTrue(!myDisposed, "Access to psi files should not be performed after disposal");
 
     ApplicationManager.getApplication().assertReadAccessAllowed();
-    LOG.assertTrue(vFile.isValid(), vFile.getName());
+    LOG.assertTrue(vFile.isValid(), "File is not valid:" + vFile.getName());
 
     if (!vFile.isDirectory()) return null;
 
