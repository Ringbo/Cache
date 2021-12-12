diff --git a/python/src/main/java/org/apache/zeppelin/python/PythonInterpreter.java b/python/src/main/java/org/apache/zeppelin/python/PythonInterpreter.java
index 46dc1b2..b1da981 100644
--- a/python/src/main/java/org/apache/zeppelin/python/PythonInterpreter.java
+++ b/python/src/main/java/org/apache/zeppelin/python/PythonInterpreter.java
@@ -161,8 +161,8 @@
 
   @Override
   public Scheduler getScheduler() {
-    return SchedulerFactory.singleton().createOrGetParallelScheduler(
-        PythonInterpreter.class.getName() + this.hashCode(), 10);
+    return SchedulerFactory.singleton().createOrGetFIFOScheduler(
+        PythonInterpreter.class.getName() + this.hashCode());
   }
 
   @Override
