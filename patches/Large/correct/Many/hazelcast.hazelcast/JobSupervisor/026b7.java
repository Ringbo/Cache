diff --git a/hazelcast/src/main/java/com/hazelcast/mapreduce/impl/task/JobSupervisor.java b/hazelcast/src/main/java/com/hazelcast/mapreduce/impl/task/JobSupervisor.java
index 8f232e4..ca91859 100644
--- a/hazelcast/src/main/java/com/hazelcast/mapreduce/impl/task/JobSupervisor.java
+++ b/hazelcast/src/main/java/com/hazelcast/mapreduce/impl/task/JobSupervisor.java
@@ -382,7 +382,7 @@
         String jobId = getConfiguration().getJobId();
         for (Address address : addresses) {
             try {
-                CancelJobSupervisorOperation operation = new CancelJobSupervisorOperation(name, jobId, jobOwner);
+                CancelJobSupervisorOperation operation = new CancelJobSupervisorOperation(name, jobId);
                 mapReduceService.processRequest(address, operation, name);
             } catch (Exception ignore) {
                 // We can ignore this exception since we just want to cancel the job
