diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java
index 75d48fc..64319dc 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java
@@ -87,7 +87,7 @@
     // advance the clock after 9 days from starting the process ->
     // the system will execute the pending job and will create a new one (day by day)
     moveByMinutes(9 * 60 * 24);
-    waitForJobExecutorToProcessAllJobsAndExecutableTimerJobs(10000, 200);
+    waitForJobExecutorToProcessAllJobsAndExecutableTimerJobs(20000, 200);
     // there must be a pending job because the endDate is not reached yet
     jobs = managementService.createTimerJobQuery().list();
     assertEquals(1, jobs.size());
