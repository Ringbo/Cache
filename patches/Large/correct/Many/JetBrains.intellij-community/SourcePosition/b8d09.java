diff --git a/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java b/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java
index 662976e..2bf52d1 100644
--- a/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java
+++ b/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java
@@ -55,7 +55,7 @@
 
   private abstract static class SourcePositionCache extends SourcePosition {
     @NotNull private final PsiFile myFile;
-    @NotNull private final SmartPsiElementPointer<PsiFile> myFilePointer;
+    @Nullable private final SmartPsiElementPointer<PsiFile> myFilePointer;
     private long myModificationStamp = -1L;
 
     private WeakReference<PsiElement> myPsiElementRef;
@@ -64,14 +64,15 @@
 
     public SourcePositionCache(@NotNull PsiFile file) {
       myFile = file;
-      myFilePointer = SmartPointerManager.getInstance(file.getProject()).createSmartPsiElementPointer(file);
+      myFilePointer = ReadAction.compute(
+        () -> file.isValid() ? SmartPointerManager.getInstance(file.getProject()).createSmartPsiElementPointer(file) : null);
       updateData();
     }
 
     @Override
     @NotNull
     public PsiFile getFile() {
-      PsiFile file = myFilePointer.getElement();
+      PsiFile file = myFilePointer != null ? myFilePointer.getElement() : null;
       return file != null ? file : myFile; // in case of full invalidation, rollback to the original psiFile
     }
 
