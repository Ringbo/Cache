diff --git a/refactoring/impl/com/intellij/refactoring/inline/InlineLocalHandler.java b/refactoring/impl/com/intellij/refactoring/inline/InlineLocalHandler.java
index e851f36..437520e 100644
--- a/refactoring/impl/com/intellij/refactoring/inline/InlineLocalHandler.java
+++ b/refactoring/impl/com/intellij/refactoring/inline/InlineLocalHandler.java
@@ -54,7 +54,7 @@
       return;
     }
 
-    final Collection<PsiReference> refs = ReferencesSearch.search(local, GlobalSearchScope.projectScope(project), false).findAll();
+    final Collection<PsiReference> refs = ReferencesSearch.search(local, GlobalSearchScope.allScope(project), false).findAll();
 
     if (refs.isEmpty()){
       LOG.assertTrue(refExpr == null);
