diff --git a/java/java-indexing-impl/src/com/intellij/psi/impl/search/VariableInIncompleteCodeSearcher.java b/java/java-indexing-impl/src/com/intellij/psi/impl/search/VariableInIncompleteCodeSearcher.java
index d96ad75..a96f773 100644
--- a/java/java-indexing-impl/src/com/intellij/psi/impl/search/VariableInIncompleteCodeSearcher.java
+++ b/java/java-indexing-impl/src/com/intellij/psi/impl/search/VariableInIncompleteCodeSearcher.java
@@ -42,7 +42,7 @@
     SearchScope scope = p.getEffectiveSearchScope();
     if (!(scope instanceof LocalSearchScope)) {
       final PsiFile file = refElement.getContainingFile();
-      if (file == null) return;
+      if (file == null || file instanceof PsiCompiledElement) return;
       //process incomplete references to the 'field' in the same file only
       scope = new LocalSearchScope(new PsiElement[]{file}, null, !PsiSearchHelperImpl.shouldProcessInjectedPsi(p.getScopeDeterminedByUser()));
     }
