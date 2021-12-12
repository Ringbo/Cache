diff --git a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/JavaLineMarkerProvider.java b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/JavaLineMarkerProvider.java
index 0d9a717..3be71c4 100644
--- a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/JavaLineMarkerProvider.java
+++ b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/JavaLineMarkerProvider.java
@@ -120,7 +120,7 @@
   }
 
   protected static int getCategory(PsiElement element) {
-    if (element instanceof PsiField) return 1;
+    if (element instanceof PsiField || element instanceof PsiTypeParameter) return 1;
     if (element instanceof PsiClass || element instanceof PsiClassInitializer) return 2;
     if (element instanceof PsiMethod) {
       if (((PsiMethod)element).hasModifierProperty(PsiModifier.ABSTRACT)) {
