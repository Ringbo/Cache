diff --git a/src/edu/stanford/nlp/pipeline/TokensRegexNERAnnotator.java b/src/edu/stanford/nlp/pipeline/TokensRegexNERAnnotator.java
index 7df4f7d..16c9a06 100644
--- a/src/edu/stanford/nlp/pipeline/TokensRegexNERAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/TokensRegexNERAnnotator.java
@@ -247,7 +247,7 @@
       }
     }
     boolean overwriteOriginalNer = false;
-    if (prevNerEndIndex != (start-1) || nextNerStartIndex != end) {
+    if (prevNerEndIndex != (start-1) && nextNerStartIndex != end) {
       // Cutting across already recognized NEs don't disturb
     } else if (startNer == null) {
       // No old ner, okay to replace
