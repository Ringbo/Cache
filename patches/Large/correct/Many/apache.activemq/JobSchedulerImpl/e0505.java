diff --git a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl.java b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl.java
index d49acaf..4a0fbc4 100644
--- a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl.java
+++ b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl.java
@@ -227,9 +227,9 @@
 
     private void doSchedule(final String jobId, final ByteSequence payload, final String cronEntry, long delay, long period, int repeat) throws IOException {
         long startTime = System.currentTimeMillis();
-        // round startTime - so we can schedule more jobs
-        // at the same time
-        startTime = ((startTime + 500) / 1000) * 1000;
+        // round startTime - so we can schedule more jobs at the same time
+        startTime = ((startTime + 500) / 500) * 500;
+
         long time = 0;
         if (cronEntry != null && cronEntry.length() > 0) {
             try {
