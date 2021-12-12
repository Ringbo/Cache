diff --git a/java/java-impl/src/com/intellij/refactoring/util/RefactoringConflictsUtil.java b/java/java-impl/src/com/intellij/refactoring/util/RefactoringConflictsUtil.java
index 4e908ea..9605fb7 100644
--- a/java/java-impl/src/com/intellij/refactoring/util/RefactoringConflictsUtil.java
+++ b/java/java-impl/src/com/intellij/refactoring/util/RefactoringConflictsUtil.java
@@ -243,7 +243,7 @@
     final GlobalSearchScope resolveScope = GlobalSearchScope.moduleWithDependenciesAndLibrariesScope(targetModule);
     final HashSet<PsiElement> reported = new HashSet<>();
     for (final PsiElement scope : scopes) {
-      scope.accept(new JavaRecursiveElementVisitor() {
+      scope.accept(new JavaRecursiveElementWalkingVisitor() {
         @Override public void visitReferenceElement(PsiJavaCodeReferenceElement reference) {
           super.visitReferenceElement(reference);
           final PsiElement resolved = reference.resolve();
