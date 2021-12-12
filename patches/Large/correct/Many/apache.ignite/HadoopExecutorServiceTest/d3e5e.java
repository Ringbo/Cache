diff --git a/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/taskexecutor/HadoopExecutorServiceTest.java b/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/taskexecutor/HadoopExecutorServiceTest.java
index aa50fa9..4b5e91f 100644
--- a/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/taskexecutor/HadoopExecutorServiceTest.java
+++ b/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/taskexecutor/HadoopExecutorServiceTest.java
@@ -39,7 +39,7 @@
             final int loops = 5000;
             int threads = 17;
 
-            final LongAdder sum = new LongAdder();
+            final LongAdder8 sum = new LongAdder8();
 
             multithreaded(new Callable<Object>() {
                 @Override public Object call() throws Exception {
@@ -79,7 +79,7 @@
         for (int i = 0; i < 5; i++) {
             final HadoopExecutorService exec = new HadoopExecutorService(log, "_GRID_NAME_", 10, 5);
 
-            final LongAdder sum = new LongAdder();
+            final LongAdder8 sum = new LongAdder8();
 
             final AtomicBoolean finish = new AtomicBoolean();
 
