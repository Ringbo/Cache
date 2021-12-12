diff --git a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/process/normalizer/ScoresUpdaterTests.java b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/process/normalizer/ScoresUpdaterTests.java
index ee7b231..8cbd149 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/process/normalizer/ScoresUpdaterTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/process/normalizer/ScoresUpdaterTests.java
@@ -233,7 +233,7 @@
     }
 
     public void testUpdate_GivenShutdown() throws IOException {
-        Influencer influencer = new Influencer(JOB_ID, "n", "v", new Date(DEFAULT_START_TIME), 600, 1);
+        Influencer influencer = new Influencer(JOB_ID, "n", "v", new Date(DEFAULT_START_TIME), 600);
 
         Deque<Influencer> influencers = new ArrayDeque<>();
         influencers.add(influencer);
