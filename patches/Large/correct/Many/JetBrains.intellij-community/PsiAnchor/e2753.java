diff --git a/platform/lang-impl/src/com/intellij/psi/PsiAnchor.java b/platform/lang-impl/src/com/intellij/psi/PsiAnchor.java
index 3acb9d2..c9955a3 100644
--- a/platform/lang-impl/src/com/intellij/psi/PsiAnchor.java
+++ b/platform/lang-impl/src/com/intellij/psi/PsiAnchor.java
@@ -222,7 +222,7 @@
     }
 
     public PsiFile getFile() {
-      if (myProject.isDisposed()) return null;
+      if (myProject.isDisposed() || !myVirtualFile.isValid()) return null;
       return PsiManager.getInstance(myProject).findFile(myVirtualFile);
     }
 
