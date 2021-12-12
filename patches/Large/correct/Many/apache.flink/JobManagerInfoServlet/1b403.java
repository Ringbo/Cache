diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/web/JobManagerInfoServlet.java b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/web/JobManagerInfoServlet.java
index 961a464..ffb0dd4 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/web/JobManagerInfoServlet.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/web/JobManagerInfoServlet.java
@@ -127,10 +127,10 @@
 					throw new RuntimeException("RequestJob requires a response of type JobResponse. " +
 							"Instead the response is of type " + result.getClass());
 				}else {
-					final JobResponse jobResponse = (JobResponse) response;
+					final JobResponse jobResponse = (JobResponse) result;
 
 					if(jobResponse instanceof JobFound){
-						ExecutionGraph archivedJob = ((JobFound)response).executionGraph();
+						ExecutionGraph archivedJob = ((JobFound)result).executionGraph();
 						writeJsonForArchivedJob(resp.getWriter(), archivedJob);
 				} else {
 						LOG.warn("DoGet:job: Could not find job for job ID " + jobId);
