diff --git a/src/edu/stanford/nlp/pipeline/Annotator.java b/src/edu/stanford/nlp/pipeline/Annotator.java
index 91c72f6..0975f1c 100644
--- a/src/edu/stanford/nlp/pipeline/Annotator.java
+++ b/src/edu/stanford/nlp/pipeline/Annotator.java
@@ -132,7 +132,7 @@
     put(STANFORD_TRUECASE,                 new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT)));
     put(STANFORD_PARSE,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS)));
     put(STANFORD_DETERMINISTIC_COREF,      new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_PARSE)));
-    put(STANFORD_COREF,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER)));
+    put(STANFORD_COREF,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_DEPENDENCIES)));
     put(STANFORD_COREF_MENTION,                  new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_DEPENDENCIES)));
     put(STANFORD_RELATION,                 new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_PARSE, STANFORD_DEPENDENCIES)));
     put(STANFORD_SENTIMENT,                new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_PARSE)));
