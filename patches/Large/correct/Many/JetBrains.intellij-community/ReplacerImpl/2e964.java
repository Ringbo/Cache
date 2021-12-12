diff --git a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java
index 9da2448..cf2c846 100644
--- a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java
+++ b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java
@@ -337,7 +337,8 @@
         PsiElement replacement = getMatchExpr(statements[i], elementToReplace);
 
         if (replacement instanceof PsiStatement &&
-            !(replacement.getLastChild() instanceof PsiJavaToken)
+            !(replacement.getLastChild() instanceof PsiJavaToken) &&
+            !(replacement.getLastChild() instanceof PsiComment)
            ) {
           // assert w/o ;
           final PsiElement prevLastChildInParent = replacement.getLastChild().getPrevSibling();
@@ -778,7 +779,8 @@
 
   private static PsiElement getMatchExpr(PsiElement replacement, PsiElement elementToReplace) {
     if (replacement instanceof PsiExpressionStatement &&
-        !(replacement.getLastChild() instanceof PsiJavaToken)
+        !(replacement.getLastChild() instanceof PsiJavaToken) &&
+        !(replacement.getLastChild() instanceof PsiComment)
        ) {
       // replacement is expression (and pattern should be so)
       // assert ...
