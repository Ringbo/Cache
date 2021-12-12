diff --git a/tests/src/com/intellij/tapestry/tests/TapestryFindUsagesTest.java b/tests/src/com/intellij/tapestry/tests/TapestryFindUsagesTest.java
index c472000..4495187 100644
--- a/tests/src/com/intellij/tapestry/tests/TapestryFindUsagesTest.java
+++ b/tests/src/com/intellij/tapestry/tests/TapestryFindUsagesTest.java
@@ -47,7 +47,7 @@
     final GlobalSearchScope scope = GlobalSearchScope.projectScope(myFixture.getProject());
     Query<PsiReference> query = referenceTo instanceof PsiMethod
                                 ? MethodReferencesSearch.search((PsiMethod)referenceTo, scope, false)
-                                : ReferencesSearch.search(referenceTo, scope, false);
+                                : ReferencesSearch.search(referenceTo, scope, true);
     return query.toArray(new PsiReference[0]);
   }
 
