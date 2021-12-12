diff --git a/source/com/intellij/ide/structureView/impl/java/PsiMethodTreeElement.java b/source/com/intellij/ide/structureView/impl/java/PsiMethodTreeElement.java
index e546139..d2f6104 100644
--- a/source/com/intellij/ide/structureView/impl/java/PsiMethodTreeElement.java
+++ b/source/com/intellij/ide/structureView/impl/java/PsiMethodTreeElement.java
@@ -28,7 +28,7 @@
     if (range == null) return result;
 
     final PsiFile psiFile = element.getContainingFile();
-    if (psiFile == null) return result;
+    if (psiFile == null || psiFile instanceof PsiCompiledElement) return result;
 
     final String fileText = psiFile.getText();
     if (fileText == null) return result;
