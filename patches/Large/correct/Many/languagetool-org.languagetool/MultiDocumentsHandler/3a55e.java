diff --git a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/MultiDocumentsHandler.java b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/MultiDocumentsHandler.java
index ac58e35..4ab82f4 100644
--- a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/MultiDocumentsHandler.java
+++ b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/MultiDocumentsHandler.java
@@ -113,7 +113,7 @@
     }
     
     docNum = getNumDoc(paRes.aDocumentIdentifier);
-    paRes = documents.get(docNum).getCheckResults(paraText, locale, paRes, footnotePositions, isParallelThread);
+    paRes = documents.get(docNum).getCheckResults(paraText, paRes, footnotePositions, isParallelThread);
     
     if(isParallelThread) {
       isParallelThread = false;
