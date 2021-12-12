diff --git a/src/edu/stanford/nlp/pipeline/Annotator.java b/src/edu/stanford/nlp/pipeline/Annotator.java
index 5204baa..b5e9161 100644
--- a/src/edu/stanford/nlp/pipeline/Annotator.java
+++ b/src/edu/stanford/nlp/pipeline/Annotator.java
@@ -130,7 +130,7 @@
     put(STANFORD_ENTITY_MENTIONS,          new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER)));
     put(STANFORD_GENDER,                   new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER)));
     put(STANFORD_TRUECASE,                 new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT)));
-    put(STANFORD_PARSE,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT)));
+    put(STANFORD_PARSE,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS)));
     put(STANFORD_DETERMINISTIC_COREF,      new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_MENTION, STANFORD_PARSE)));
     put(STANFORD_COREF,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_MENTION)));
     put(STANFORD_MENTION,                  new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_DEPENDENCIES)));
