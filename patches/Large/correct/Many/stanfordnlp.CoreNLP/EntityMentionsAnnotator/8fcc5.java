diff --git a/src/edu/stanford/nlp/pipeline/EntityMentionsAnnotator.java b/src/edu/stanford/nlp/pipeline/EntityMentionsAnnotator.java
index ced9ab5..c67b645 100644
--- a/src/edu/stanford/nlp/pipeline/EntityMentionsAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/EntityMentionsAnnotator.java
@@ -233,7 +233,7 @@
       Map<String,Double> labelProbsForToken =
           token.get(CoreAnnotations.NamedEntityTagProbsAnnotation.class);
       for (String label : labelProbsForToken.keySet()) {
-        if (labelProbsForToken.get(label) < entityLabelProbVals.get(label))
+        if (entityLabelProbVals.containsKey(label) && labelProbsForToken.get(label) < entityLabelProbVals.get(label))
           entityLabelProbVals.put(label, labelProbsForToken.get(label));
       }
     }
