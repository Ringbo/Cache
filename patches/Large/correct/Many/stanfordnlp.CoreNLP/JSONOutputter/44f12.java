diff --git a/src/edu/stanford/nlp/pipeline/JSONOutputter.java b/src/edu/stanford/nlp/pipeline/JSONOutputter.java
index b66d3ad..6ba7b41 100644
--- a/src/edu/stanford/nlp/pipeline/JSONOutputter.java
+++ b/src/edu/stanford/nlp/pipeline/JSONOutputter.java
@@ -94,7 +94,7 @@
           Tree sentimentTree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
           if (sentimentTree != null) {
             int sentiment = RNNCoreAnnotations.getPredictedClass(sentimentTree);
-            List<String> sentimentPredictions =
+            List<Double> sentimentPredictions =
                 RNNCoreAnnotations.getPredictionsAsStringList(sentimentTree);
             String sentimentClass = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
             l2.set("sentimentValue", Integer.toString(sentiment));
