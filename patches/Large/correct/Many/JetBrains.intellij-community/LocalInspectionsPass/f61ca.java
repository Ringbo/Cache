diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java
index 63f309d..344810e 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java
@@ -542,13 +542,13 @@
       outInfos.add(info);
       return;
     }
-    injectToHost(outInfos, ilManager, file, (DocumentWindow)documentRange, toolWrapper, element, fixes, info);
+    injectToHost(outInfos, ilManager, file, documentRange, toolWrapper, element, fixes, info);
   }
 
   private static void injectToHost(@NotNull List<HighlightInfo> outInfos,
                                    @NotNull InjectedLanguageManager ilManager,
                                    @NotNull PsiFile file,
-                                   @NotNull DocumentWindow documentRange,
+                                   @NotNull Document documentRange,
                                    @NotNull LocalInspectionToolWrapper toolWrapper,
                                    @NotNull PsiElement element, 
                                    @NotNull List<IntentionAction> fixes, 
@@ -557,7 +557,7 @@
     // todo in the latter case the errors should be highlighted, otherwise not
     List<TextRange> editables = ilManager.intersectWithAllEditableFragments(file, new TextRange(info.startOffset, info.endOffset));
     for (TextRange editable : editables) {
-      TextRange hostRange = documentRange.injectedToHost(editable);
+      TextRange hostRange = ((DocumentWindow)documentRange).injectedToHost(editable);
       int start = hostRange.getStartOffset();
       int end = hostRange.getEndOffset();
       HighlightInfo.Builder builder = HighlightInfo.newHighlightInfo(info.type).range(element, start, end);
