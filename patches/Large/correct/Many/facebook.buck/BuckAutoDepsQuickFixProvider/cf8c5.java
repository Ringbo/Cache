diff --git a/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/autodeps/BuckAutoDepsQuickFixProvider.java b/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/autodeps/BuckAutoDepsQuickFixProvider.java
index cdf7ac6..3ab1c25 100644
--- a/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/autodeps/BuckAutoDepsQuickFixProvider.java
+++ b/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/autodeps/BuckAutoDepsQuickFixProvider.java
@@ -77,12 +77,12 @@
     if (className != null) {
       GlobalSearchScope scope = GlobalSearchScope.everythingScope(project);
       for (PsiClass psiClass : JavaPsiFacade.getInstance(project).findClasses(className, scope)) {
-        Optional.of(BuckAddDependencyIntention.create(referenceElement, psiClass))
+        Optional.ofNullable(BuckAddDependencyIntention.create(referenceElement, psiClass))
             .ifPresent(results::add);
       }
       for (PsiClass psiClass :
           PsiShortNamesCache.getInstance(project).getClassesByName(className, scope)) {
-        Optional.of(BuckAddDependencyIntention.create(referenceElement, psiClass))
+        Optional.ofNullable(BuckAddDependencyIntention.create(referenceElement, psiClass))
             .ifPresent(results::add);
       }
     }
