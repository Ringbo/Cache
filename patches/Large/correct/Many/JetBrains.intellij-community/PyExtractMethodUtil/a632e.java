diff --git a/python/src/com/jetbrains/python/refactoring/extractmethod/PyExtractMethodUtil.java b/python/src/com/jetbrains/python/refactoring/extractmethod/PyExtractMethodUtil.java
index ae3fa54..3d48e54 100644
--- a/python/src/com/jetbrains/python/refactoring/extractmethod/PyExtractMethodUtil.java
+++ b/python/src/com/jetbrains/python/refactoring/extractmethod/PyExtractMethodUtil.java
@@ -168,10 +168,9 @@
       }
     }
     ExtractMethodHelper.processDuplicates(callElement, generatedMethod, scope, finder, editor,
-                                          new Consumer<Pair<Match, PsiElement>>() {
+                                          new Consumer<Pair<SimpleMatch, PsiElement>>() {
                                             @Override
-                                            public void consume(Pair<Match, PsiElement> pair) {
-
+                                            public void consume(Pair<SimpleMatch, PsiElement> pair) {
                                               replaceElements(pair.first, pair.second.copy());
                                             }
                                           }, PyTokenTypes.IDENTIFIER
@@ -328,7 +327,7 @@
     return callElement;
   }
 
-  private static PsiElement replaceElements(@NotNull final Match match, @NotNull final PsiElement callElement) {
+  private static PsiElement replaceElements(@NotNull final SimpleMatch match, @NotNull final PsiElement callElement) {
     final List<PsiElement> elementsRange = PyPsiUtils.collectElements(match.getStartElement(), match.getEndElement());
     final Map<String, String> changedParameters = match.getChangedParameters();
     if (callElement instanceof PyExpressionStatement) {
