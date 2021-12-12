diff --git a/src/edu/stanford/nlp/pipeline/Annotator.java b/src/edu/stanford/nlp/pipeline/Annotator.java
index 1f216f3..65d08f1 100644
--- a/src/edu/stanford/nlp/pipeline/Annotator.java
+++ b/src/edu/stanford/nlp/pipeline/Annotator.java
@@ -140,7 +140,7 @@
     put(STANFORD_DEPENDENCIES,             new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS)));
     put(STANFORD_NATLOG,                   new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_DEPENDENCIES)));
     put(STANFORD_OPENIE,                   new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_DEPENDENCIES, STANFORD_NATLOG)));
-    put(STANFORD_QUOTE,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT)));
+    put(STANFORD_QUOTE,                    new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER)));
     put(STANFORD_QUOTE_ATTRIBUTION,        new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_LEMMA, STANFORD_NER, STANFORD_COREF_MENTION, STANFORD_DEPENDENCIES, STANFORD_QUOTE)));
     put(STANFORD_UD_FEATURES,              new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_DEPENDENCIES)));
     put(STANFORD_LINK,                     new LinkedHashSet<>(Arrays.asList(STANFORD_TOKENIZE, STANFORD_SSPLIT, STANFORD_POS, STANFORD_DEPENDENCIES, STANFORD_LEMMA, STANFORD_NER, STANFORD_ENTITY_MENTIONS)));
