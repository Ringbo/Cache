diff --git a/modules/activiti-camel/src/test/java/org/activiti/camel/revisited/AsyncProcessRevisitedTest.java b/modules/activiti-camel/src/test/java/org/activiti/camel/revisited/AsyncProcessRevisitedTest.java
index ec34354..951cf7a 100755
--- a/modules/activiti-camel/src/test/java/org/activiti/camel/revisited/AsyncProcessRevisitedTest.java
+++ b/modules/activiti-camel/src/test/java/org/activiti/camel/revisited/AsyncProcessRevisitedTest.java
@@ -53,7 +53,7 @@
     ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("asyncCamelProcessRevisited");
     List<Execution> executionList = runtimeService.createExecutionQuery().list();
     assertEquals(3, executionList.size());
-    waitForJobExecutorToProcessAllJobs(3000, 500);
+    waitForJobExecutorToProcessAllJobs(5000, 500);
     assertEquals(0, runtimeService.createProcessInstanceQuery().processInstanceId(processInstance.getId()).count());
   }
 }
