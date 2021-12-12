diff --git a/core-job/src/test/java/org/apache/kylin/job/impl/threadpool/DefaultSchedulerTest.java b/core-job/src/test/java/org/apache/kylin/job/impl/threadpool/DefaultSchedulerTest.java
index d1b7d96..c7c69cd 100644
--- a/core-job/src/test/java/org/apache/kylin/job/impl/threadpool/DefaultSchedulerTest.java
+++ b/core-job/src/test/java/org/apache/kylin/job/impl/threadpool/DefaultSchedulerTest.java
@@ -175,15 +175,15 @@
     }
 
     @Test
-    public void tesMetaStoreRecover() throws Exception {
+    public void testMetaStoreRecover() throws Exception {
         logger.info("tesMetaStoreRecover");
         NoErrorStatusExecutable job = new NoErrorStatusExecutable();
         ErrorTestExecutable task = new ErrorTestExecutable();
         job.addTask(task);
         execMgr.addJob(job);
-        Thread.sleep(2000);
+        Thread.sleep(2500);
         runningJobToError(job.getId());
-        Thread.sleep(2000);
+        Thread.sleep(2500);
         Assert.assertEquals(ExecutableState.ERROR, execMgr.getOutput(job.getId()).getState());
     }
 
