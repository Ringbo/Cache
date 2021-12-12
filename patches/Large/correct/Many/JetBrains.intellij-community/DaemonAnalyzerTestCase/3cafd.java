diff --git a/codeInsight/tests/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java b/codeInsight/tests/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java
index fe560cc..77ef95d 100644
--- a/codeInsight/tests/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java
+++ b/codeInsight/tests/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java
@@ -118,7 +118,7 @@
   }
 
   protected Collection<HighlightInfo> doDoTest(boolean checkWarnings, boolean checkInfos, boolean checkWeakWarnings) {
-    ExpectedHighlightingData data = new ExpectedHighlightingData(myEditor.getDocument(),checkWarnings, checkInfos, checkWeakWarnings);
+    ExpectedHighlightingData data = new ExpectedHighlightingData(myEditor.getDocument(),checkWarnings, checkWeakWarnings, checkInfos);
 
     PsiDocumentManager.getInstance(myProject).commitAllDocuments();
     
