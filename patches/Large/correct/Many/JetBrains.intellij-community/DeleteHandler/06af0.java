diff --git a/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java b/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java
index 068323f..ab42c13 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java
@@ -174,7 +174,7 @@
         }
       }
 
-      if (safeDeleteApplicable && dumb) {
+      if (safeDeleteApplicable) {
         warningMessage += "\n\nWarning:\n  Safe delete is not available while " +
                           ApplicationNamesInfo.getInstance().getFullProductName() +
                           " updates indices,\n  no usages will be checked.";
@@ -210,7 +210,7 @@
 
       for (SmartPsiElementPointer pointer : pointers) {
         PsiElement elementToDelete = pointer.getElement();
-        if (elementsToDelete == null) continue; //was already deleted
+        if (elementToDelete == null) continue; //was already deleted
 
         if (elementToDelete instanceof PsiDirectory) {
           VirtualFile virtualFile = ((PsiDirectory)elementToDelete).getVirtualFile();
