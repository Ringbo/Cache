diff --git a/src/edu/stanford/nlp/pipeline/SentenceAnnotator.java b/src/edu/stanford/nlp/pipeline/SentenceAnnotator.java
index 5599ea4..46db206 100644
--- a/src/edu/stanford/nlp/pipeline/SentenceAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/SentenceAnnotator.java
@@ -59,7 +59,7 @@
             } catch (RejectedExecutionException e) {
               // If we time out, for now, we just throw away all jobs which were running at the time.
               // Note that in order for this to be useful, the underlying job needs to handle Thread.interrupted()
-              List<CoreMap> failedSentences = wrapper.shutdownNow();
+              List<CoreMap> failedSentences = wrapper.joinWithTimeout();
               for (CoreMap failed : failedSentences) {
                 doOneFailedSentence(annotation, failed);
               }
