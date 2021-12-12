diff --git a/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java b/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java
index b8f91b8..436591c 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java
@@ -146,7 +146,7 @@
 
   private static boolean isIdentifierPart(@Nullable PsiFile file, CharSequence text, int offset) {
     if (file != null) {
-      TargetElementEvaluatorEx evaluator = getInstance().getElementEvaluatorsEx(file.getLanguage());
+      TargetElementEvaluatorEx evaluator = getElementEvaluatorsEx(file.getLanguage());
       if (evaluator != null && evaluator.isIdentifierPart(file, text, offset)) return true;
     }
     return Character.isJavaIdentifierPart(text.charAt(offset));
@@ -279,7 +279,7 @@
   @Nullable
   public PsiElement adjustReference(@NotNull PsiReference ref) {
     PsiElement element = ref.getElement();
-    TargetElementEvaluatorEx2 evaluator = element != null ? getElementEvaluatorsEx2(element.getLanguage()) : null;
+    TargetElementEvaluatorEx2 evaluator = getElementEvaluatorsEx2(element.getLanguage());
     return evaluator != null ? evaluator.adjustReference(ref) : null;
   }
 
@@ -322,7 +322,7 @@
 
 
   @Nullable
-  private PsiElement getNamedElement(@Nullable final PsiElement element) {
+  private static PsiElement getNamedElement(@Nullable final PsiElement element) {
     if (element == null) return null;
 
     TargetElementEvaluatorEx2 evaluator = getElementEvaluatorsEx2(element.getLanguage());
@@ -345,7 +345,7 @@
   }
 
   @Nullable
-  private PsiElement getReferenceOrReferencedElement(PsiFile file, Editor editor, int flags, int offset) {
+  private static PsiElement getReferenceOrReferencedElement(PsiFile file, Editor editor, int flags, int offset) {
     PsiElement result = doGetReferenceOrReferencedElement(editor, flags, offset);
     PsiElement languageElement = file.findElementAt(offset);
     Language language = languageElement != null ? languageElement.getLanguage() : file.getLanguage();
@@ -375,7 +375,7 @@
   @NotNull
   public Collection<PsiElement> getTargetCandidates(@NotNull PsiReference reference) {
     PsiElement refElement = reference.getElement();
-    TargetElementEvaluatorEx2 evaluator = refElement != null ? getElementEvaluatorsEx2(refElement.getLanguage()) : null;
+    TargetElementEvaluatorEx2 evaluator = getElementEvaluatorsEx2(refElement.getLanguage());
     if (evaluator != null) {
       Collection<PsiElement> candidates = evaluator.getTargetCandidates(reference);
       if (candidates != null) return candidates;
@@ -442,12 +442,12 @@
   protected static final LanguageExtension<TargetElementEvaluator> targetElementEvaluator =
     new LanguageExtension<>("com.intellij.targetElementEvaluator");
   @Nullable
-  private TargetElementEvaluatorEx getElementEvaluatorsEx(@NotNull Language language) {
+  private static TargetElementEvaluatorEx getElementEvaluatorsEx(@NotNull Language language) {
     TargetElementEvaluator result = targetElementEvaluator.forLanguage(language);
     return result instanceof TargetElementEvaluatorEx ? (TargetElementEvaluatorEx)result : null;
   }
   @Nullable
-  private TargetElementEvaluatorEx2 getElementEvaluatorsEx2(@NotNull Language language) {
+  private static TargetElementEvaluatorEx2 getElementEvaluatorsEx2(@NotNull Language language) {
     TargetElementEvaluator result = targetElementEvaluator.forLanguage(language);
     return result instanceof TargetElementEvaluatorEx2 ? (TargetElementEvaluatorEx2)result : null;
   }
