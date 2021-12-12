diff --git a/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java b/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java
index 1991182..ebe269e 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java
@@ -345,7 +345,7 @@
         final ThreadInfo[] threads = this.threads.dumpAllThreads(true, true);
         final PrintWriter writer = new PrintWriter(out, true);
 
-        for (int ti = threads.length - 1; ti > 0; ti--) {
+        for (int ti = threads.length - 1; ti >= 0; ti--) {
             final ThreadInfo t = threads[ti];
             writer.printf("%s id=%d state=%s",
                           t.getThreadName(),
