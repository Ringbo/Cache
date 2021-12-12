diff --git a/reactor-core/src/test/java/reactor/core/scheduler/InstantPeriodicWorkerTaskTest.java b/reactor-core/src/test/java/reactor/core/scheduler/InstantPeriodicWorkerTaskTest.java
index fbb74f5..859fe66 100644
--- a/reactor-core/src/test/java/reactor/core/scheduler/InstantPeriodicWorkerTaskTest.java
+++ b/reactor-core/src/test/java/reactor/core/scheduler/InstantPeriodicWorkerTaskTest.java
@@ -38,11 +38,11 @@
     @Test
     public void taskCrash() {
         ExecutorService exec = Executors.newSingleThreadExecutor();
-        Disposable.Composite composit = Disposables.composite();
+        Disposable.Composite composite = Disposables.composite();
         List<Throwable> throwables = prepareErrorHook();
 
         try {
-            InstantPeriodicWorkerTask task = new InstantPeriodicWorkerTask(errorRunnable, exec, composit);
+            InstantPeriodicWorkerTask task = new InstantPeriodicWorkerTask(errorRunnable, exec, composite);
 
             assertThat(task.call()).isNull();
             assertThat(throwables).containsOnly(exception);
