diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java
index fe86a06..1f4b24b 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java
@@ -320,7 +320,7 @@
     PsiFile psiFile = element.getContainingFile();
     if (psiFile == null) return null;
 
-    VirtualFile file = psiFile.getVirtualFile();
+    final VirtualFile file = psiFile.getVirtualFile();
     if (file == null) return null;
 
     final SmartPsiElementPointer<PsiElement> pointer =
@@ -355,7 +355,7 @@
       @NotNull
       @Override
       public VirtualFile getFile() {
-        return getDelegate().getFile();
+        return file;
       }
 
       @NotNull
