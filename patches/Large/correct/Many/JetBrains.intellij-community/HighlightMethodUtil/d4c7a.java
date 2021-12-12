diff --git a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
index b779d89..1fe2bfe 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
@@ -1123,7 +1123,7 @@
 
       String description = JavaErrorMessages.message("missing.method.body");
       errorResult = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(start, end).descriptionAndTooltip(description).create();
-      if (HighlightUtil.getIncompatibleModifier(PsiModifier.ABSTRACT, method.getModifierList()) == null) {
+      if (HighlightUtil.getIncompatibleModifier(PsiModifier.ABSTRACT, method.getModifierList()) == null && !(aClass instanceof PsiAnonymousClass)) {
         QuickFixAction.registerQuickFixAction(errorResult,
                                               QUICK_FIX_FACTORY.createModifierListFix(method, PsiModifier.ABSTRACT, true, false));
       }
