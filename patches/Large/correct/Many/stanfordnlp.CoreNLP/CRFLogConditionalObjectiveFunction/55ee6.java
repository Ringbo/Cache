diff --git a/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java b/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java
index 25e8792..3680c4e 100644
--- a/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java
+++ b/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java
@@ -1528,7 +1528,7 @@
 
       empiricalCountsForADoc(eHat4Update, ind);
       // TODO(mengqiu) broken, does not do E calculation
-      expectedCountsForADoc(weights, ind);
+      expectedCountsForADoc(weights, e4Update, ind);
 
       /* the commented out code below is to iterate over the batch docs instead of iterating over all
          parameters at the end, which is more efficient; but it would also require us to clearUpdateEs()
