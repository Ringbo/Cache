diff --git a/community/server/src/main/java/org/neo4j/server/RoundRobinJobScheduler.java b/community/server/src/main/java/org/neo4j/server/RoundRobinJobScheduler.java
index 6f9de2a..632f872 100644
--- a/community/server/src/main/java/org/neo4j/server/RoundRobinJobScheduler.java
+++ b/community/server/src/main/java/org/neo4j/server/RoundRobinJobScheduler.java
@@ -30,9 +30,9 @@
 
     private List<ScheduledJob> scheduledJobs = new LinkedList<ScheduledJob>();
 
-    public void scheduleAtFixedRate( Runnable job, String jobName, long period )
+    public void scheduleAtFixedRate( Runnable job, String jobName, long delay, long period )
     {
-        ScheduledJob scheduledJob = new ScheduledJob( job, jobName, period );
+        ScheduledJob scheduledJob = new ScheduledJob( job, jobName, delay, period );
         scheduledJobs.add( scheduledJob );
     }
 
