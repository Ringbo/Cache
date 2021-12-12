diff --git a/modules/activiti5-test/src/test/java/org/activiti5/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java b/modules/activiti5-test/src/test/java/org/activiti5/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java
index ebf8114..ed39b9f 100644
--- a/modules/activiti5-test/src/test/java/org/activiti5/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java
+++ b/modules/activiti5-test/src/test/java/org/activiti5/engine/test/bpmn/event/timer/compatibility/StartTimerEventRepeatCompatibilityTest.java
@@ -88,7 +88,7 @@
     // advance the clock after 9 days from starting the process ->
     // the system will execute the pending job and will create a new one (day by day)
     moveByMinutes(9 * 60 * 24);
-    waitForJobExecutorToProcessAllJobsAndExecutableTimerJobs(10000, 200);
+    executeJobExecutorForTime(10000, 200);
     
     // there must be a pending job because the endDate is not reached yet
 
