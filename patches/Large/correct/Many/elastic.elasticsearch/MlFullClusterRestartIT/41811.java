diff --git a/plugin/src/test/java/org/elasticsearch/xpack/ml/integration/MlFullClusterRestartIT.java b/plugin/src/test/java/org/elasticsearch/xpack/ml/integration/MlFullClusterRestartIT.java
index b2d78b4..fa26fdb 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/ml/integration/MlFullClusterRestartIT.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/ml/integration/MlFullClusterRestartIT.java
@@ -40,7 +40,7 @@
         indexDocs("data", numDocs1, twoWeeksAgo, weekAgo);
 
         Job.Builder job = createScheduledJob("job_id");
-        PutJobAction.Request putJobRequest = new PutJobAction.Request(job.build(true, job.getId()));
+        PutJobAction.Request putJobRequest = new PutJobAction.Request(job.build());
         PutJobAction.Response putJobResponse = client().execute(PutJobAction.INSTANCE, putJobRequest).actionGet();
         assertTrue(putJobResponse.isAcknowledged());
 
