diff --git a/java/java-impl/src/com/intellij/codeInsight/editorActions/JavaTypedHandler.java b/java/java-impl/src/com/intellij/codeInsight/editorActions/JavaTypedHandler.java
index 6237cfd..38b70ed 100644
--- a/java/java-impl/src/com/intellij/codeInsight/editorActions/JavaTypedHandler.java
+++ b/java/java-impl/src/com/intellij/codeInsight/editorActions/JavaTypedHandler.java
@@ -76,7 +76,7 @@
         do {
           parent = parent.getParent();
         } while(parent instanceof PsiJavaCodeReferenceElement || parent instanceof PsiTypeElement);
-        if (parent instanceof PsiParameterList) return false;
+        if (parent instanceof PsiParameterList || parent instanceof PsiParameter) return false;
 
         if (!".".equals(lastElement.getText()) && !"#".equals(lastElement.getText())) {
           return false;
