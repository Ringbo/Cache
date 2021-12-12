diff --git a/src/edu/stanford/nlp/parser/tools/ParseAndSetLabels.java b/src/edu/stanford/nlp/parser/tools/ParseAndSetLabels.java
index ded5110..08bc8b8 100644
--- a/src/edu/stanford/nlp/parser/tools/ParseAndSetLabels.java
+++ b/src/edu/stanford/nlp/parser/tools/ParseAndSetLabels.java
@@ -259,7 +259,7 @@
     Map<String, String> labelMap = readLabelMap(labelsFile, separator, remapLabels);
 
     List<String> sentences;
-    if (sentencesFile == null) {
+    if (sentencesFile != null) {
       sentences = readSentences(sentencesFile);
     } else {
       sentences = new ArrayList<String>(labelMap.keySet());
