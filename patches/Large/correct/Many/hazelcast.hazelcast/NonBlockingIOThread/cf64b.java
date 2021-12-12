diff --git a/hazelcast/src/main/java/com/hazelcast/nio/tcp/nonblocking/NonBlockingIOThread.java b/hazelcast/src/main/java/com/hazelcast/nio/tcp/nonblocking/NonBlockingIOThread.java
index 2b16b67..201989e 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/tcp/nonblocking/NonBlockingIOThread.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/tcp/nonblocking/NonBlockingIOThread.java
@@ -138,7 +138,7 @@
      * @param task the task to add.
      * @throws NullPointerException if task is null
      */
-    public final void addTaskAndWakeup(Runnable task) {
+    public void addTaskAndWakeup(Runnable task) {
         taskQueue.add(task);
         if (!selectNow) {
             selector.wakeup();
@@ -235,7 +235,7 @@
         if (target == this) {
             task.run();
         } else {
-            target.addTask(task);
+            target.addTaskAndWakeup(task);
         }
     }
 
