diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/GeneralHighlightingPass.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/GeneralHighlightingPass.java
index c79a379..12eb84f 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/GeneralHighlightingPass.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/GeneralHighlightingPass.java
@@ -299,7 +299,7 @@
 
     for (PsiElement element : hosts) {
       progress.checkCanceled();
-      final List<PsiFile> destination = myPriorityRange.contains(element.getTextRange()) ? inside : outside;
+      final List<PsiFile> destination = myPriorityRange.intersects(element.getTextRange()) ? inside : outside;
       InjectedLanguageUtil.enumerate(element, myFile, new PsiLanguageInjectionHost.InjectedPsiVisitor() {
         public void visit(@NotNull PsiFile injectedPsi, @NotNull List<PsiLanguageInjectionHost.Shred> places) {
           destination.add(injectedPsi); // for concatenations there can be many injection hosts with only one injected PSI
