diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/scheduler/memory/InMemoryJobScheduler.java b/activemq-broker/src/main/java/org/apache/activemq/broker/scheduler/memory/InMemoryJobScheduler.java
index 3e07770..3113a05 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/scheduler/memory/InMemoryJobScheduler.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/scheduler/memory/InMemoryJobScheduler.java
@@ -223,7 +223,8 @@
         long startTime = System.currentTimeMillis();
         long executionTime = 0;
         // round startTime - so we can schedule more jobs at the same time
-        startTime = ((startTime + 500) / 1000) * 1000;
+        startTime = ((startTime + 500) / 500) * 500;
+
         if (cronEntry != null && cronEntry.length() > 0) {
             try {
                 executionTime = CronParser.getNextScheduledTime(cronEntry, startTime);
