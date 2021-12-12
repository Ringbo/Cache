diff --git a/plugins/devkit/devkit-core/src/testAssistant/TestDataGuessByExistingFilesUtil.java b/plugins/devkit/devkit-core/src/testAssistant/TestDataGuessByExistingFilesUtil.java
index 92c4ff9..4aba3cf 100644
--- a/plugins/devkit/devkit-core/src/testAssistant/TestDataGuessByExistingFilesUtil.java
+++ b/plugins/devkit/devkit-core/src/testAssistant/TestDataGuessByExistingFilesUtil.java
@@ -344,7 +344,7 @@
       int currentWordsIndex = currentLcDir.lastIndexOf(currentNameLcSubstring);
       if (currentWordsIndex > 0) {
         currentWordsMatched = i + 1;
-        candidateMatchPosition = currentWordsIndex;
+        currentMatchPosition = currentWordsIndex;
       }
 
       if (candidateWordsMatched != currentWordsMatched) {
