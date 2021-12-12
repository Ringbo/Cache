diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/taskprocessor/CeProcessingSchedulerImplMultiThreadTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/taskprocessor/CeProcessingSchedulerImplMultiThreadTest.java
index 2d3eabe..b01e67c 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/taskprocessor/CeProcessingSchedulerImplMultiThreadTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/taskprocessor/CeProcessingSchedulerImplMultiThreadTest.java
@@ -40,7 +40,7 @@
 
   @Test
   public void when_workerCount_is_more_than_1_CeWorkerCallable_runs_on_as_many_different_threads() throws InterruptedException {
-    int workerCount = 4;
+    int workerCount = 2;
 
     ceConfiguration
         .setWorkerCount(workerCount)
@@ -55,8 +55,8 @@
 
       underTest.startScheduling();
 
-      // scheduling starts only after 10ms, leave 100ms for the tasks to run
-      Thread.sleep(100);
+      // scheduling starts only after 10ms, leave 500ms for the tasks to run and make use of all available threads
+      Thread.sleep(500);
 
       assertThat(ceWorkerRunnable.getThreadNames()).hasSize(workerCount);
     }
@@ -72,7 +72,7 @@
 
   private static class ThreadNameRecordingCeWorkerCallable implements CeWorkerCallable {
     private final Set<String> threadNames = new HashSet<>();
-    private final int maxCallCount = 10;
+    private final int maxCallCount = 100;
     private int callCount = 0;
 
     @Override
