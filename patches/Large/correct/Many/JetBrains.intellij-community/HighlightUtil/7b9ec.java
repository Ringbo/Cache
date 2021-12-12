diff --git a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java
index 55055c9..94508df 100644
--- a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java
+++ b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java
@@ -1937,7 +1937,9 @@
           return null;
         }
 
-        if (expression instanceof PsiJavaCodeReferenceElement && !aClass.equals(PsiTreeUtil.getParentOfType(expression, PsiClass.class))) {
+        if (expression instanceof PsiJavaCodeReferenceElement &&
+            !aClass.equals(PsiTreeUtil.getParentOfType(expression, PsiClass.class)) &&
+            PsiTreeUtil.getParentOfType(expression, PsiTypeElement.class) != null) {
           return null;
         }
 
