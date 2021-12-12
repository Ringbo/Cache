diff --git a/src/main/java/org/elasticsearch/common/util/concurrent/PrioritizedEsThreadPoolExecutor.java b/src/main/java/org/elasticsearch/common/util/concurrent/PrioritizedEsThreadPoolExecutor.java
index 29f3f3e..e51a97b 100644
--- a/src/main/java/org/elasticsearch/common/util/concurrent/PrioritizedEsThreadPoolExecutor.java
+++ b/src/main/java/org/elasticsearch/common/util/concurrent/PrioritizedEsThreadPoolExecutor.java
@@ -49,7 +49,7 @@
 
     @Override
     public void execute(Runnable command) {
-        if (!(command instanceof PrioritizedRunnable)) {
+        if (!(command instanceof Comparable)) {
             command = PrioritizedRunnable.wrap(command, Priority.NORMAL);
         }
         super.execute(command);
