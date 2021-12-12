diff --git a/platform/structuralsearch/source/com/intellij/structuralsearch/impl/matcher/handlers/SubstitutionHandler.java b/platform/structuralsearch/source/com/intellij/structuralsearch/impl/matcher/handlers/SubstitutionHandler.java
index 557e443..f0b76d4 100644
--- a/platform/structuralsearch/source/com/intellij/structuralsearch/impl/matcher/handlers/SubstitutionHandler.java
+++ b/platform/structuralsearch/source/com/intellij/structuralsearch/impl/matcher/handlers/SubstitutionHandler.java
@@ -136,7 +136,7 @@
   }
 
   public boolean validate(final PsiElement match, int start, int end, MatchContext context) {
-    if (predicate != null && !predicate.match(match, start, end, context)) {
+    if (match == null || predicate != null && !predicate.match(match, start, end, context)) {
       return false;
     }
 
