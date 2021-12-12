diff --git a/source/com/intellij/psi/impl/compiled/ClsFileImpl.java b/source/com/intellij/psi/impl/compiled/ClsFileImpl.java
index d90d0fd..e168c91 100644
--- a/source/com/intellij/psi/impl/compiled/ClsFileImpl.java
+++ b/source/com/intellij/psi/impl/compiled/ClsFileImpl.java
@@ -272,7 +272,7 @@
     ((ClsClassImpl)aClass).appendMirrorText(0, buffer);
   }
 
-  public void setMirror(TreeElement element) {
+  public void setMirror(@NotNull TreeElement element) {
     LOG.assertTrue(myMirror == null);
     myMirror = element;
 
@@ -388,7 +388,7 @@
   }
 
   public static String decompile(PsiManager manager, VirtualFile file) {
-    final FileViewProvider provider = ((PsiManagerImpl)manager).getFileManager().findCachedViewProvider(file);
+    final FileViewProvider provider = ((PsiManagerImpl)manager).getFileManager().findViewProvider(file);
     ClsFileImpl psiFile = null;
     if (provider != null) {
       psiFile = (ClsFileImpl)provider.getPsi(provider.getBaseLanguage());
