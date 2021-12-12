diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/event/JobEventsTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/event/JobEventsTest.java
index e390609..01472b3 100755
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/event/JobEventsTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/event/JobEventsTest.java
@@ -105,7 +105,7 @@
 
     processEngineConfiguration.setClock(testClock);
 
-    testClock.setCurrentTime(new Date(0));
+    testClock.setCurrentTime(new Date(1));
     ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("testRepetitionJobEvents");
     Job theJob = managementService.createJobQuery().processInstanceId(processInstance.getId()).singleResult();
     assertNotNull(theJob);
@@ -156,7 +156,7 @@
 
     processEngineConfiguration.setClock(testClock);
 
-    testClock.setCurrentTime(new Date(0));
+    testClock.setCurrentTime(new Date(1));
     runtimeService.startProcessInstanceByKey("testTimerCancelledEvent");
     listener.clearEventsReceived();
 
@@ -170,7 +170,7 @@
   @Deployment(resources = "org/activiti/engine/test/api/event/JobEventsTest.testJobCanceledEventOnBoundaryEvent.bpmn20.xml")
   public void testJobCanceledEventByManagementService() throws Exception {
     // GIVEN
-    processEngineConfiguration.getClock().setCurrentTime(new Date(0));
+    processEngineConfiguration.getClock().setCurrentTime(new Date(1));
     ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("testTimerCancelledEvent");
     listener.clearEventsReceived();
 
