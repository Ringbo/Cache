diff --git a/platform/lang-impl/src/com/intellij/codeInsight/navigation/actions/GotoDeclarationAction.java b/platform/lang-impl/src/com/intellij/codeInsight/navigation/actions/GotoDeclarationAction.java
index 380470b..76db56e 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/navigation/actions/GotoDeclarationAction.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/navigation/actions/GotoDeclarationAction.java
@@ -136,7 +136,7 @@
 
     final PsiReference reference = TargetElementUtilBase.findReference(editor, offset);
 
-    if (elements == null) {
+    if (elements == null || elements.length == 0) {
       final Collection<PsiElement> candidates = suggestCandidates(reference);
       elements = PsiUtilBase.toPsiElementArray(candidates);
     }
