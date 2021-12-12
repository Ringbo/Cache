diff --git a/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/cache/MatricesCache.java b/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/cache/MatricesCache.java
index 51770d6..d85f1c6 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/cache/MatricesCache.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/cache/MatricesCache.java
@@ -59,7 +59,7 @@
   class Syncer extends Thread {
     @Override
     public void run() {
-      while (stopped.get() && !Thread.interrupted()) {
+      while (!stopped.get() && !Thread.interrupted()) {
         syncPolicy.sync(PSAgentContext.get().getMatricesCache());
         try {
           Thread.sleep(syncTimeIntervalMS);
