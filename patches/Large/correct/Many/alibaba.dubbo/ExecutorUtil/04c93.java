diff --git a/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ExecutorUtil.java b/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ExecutorUtil.java
index 19d581f..6b07cc8 100644
--- a/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ExecutorUtil.java
+++ b/dubbo-common/src/main/java/com/alibaba/dubbo/common/utils/ExecutorUtil.java
@@ -34,9 +34,9 @@
             new LinkedBlockingQueue<Runnable>(100),
             new NamedThreadFactory("Close-ExecutorService-Timer", true));
 
-    public static boolean isShutdown(Executor executor) {
+    public static boolean isTerminated(Executor executor) {
         if (executor instanceof ExecutorService) {
-            if (((ExecutorService) executor).isShutdown()) {
+            if (((ExecutorService) executor).isTerminated()) {
                 return true;
             }
         }
@@ -44,7 +44,7 @@
     }
 
     public static void gracefulShutdown(Executor executor, int timeout) {
-        if (!(executor instanceof ExecutorService) || isShutdown(executor)) {
+        if (!(executor instanceof ExecutorService) || isTerminated(executor)) {
             return;
         }
         final ExecutorService es = (ExecutorService) executor;
@@ -63,13 +63,13 @@
             es.shutdownNow();
             Thread.currentThread().interrupt();
         }
-        if (!isShutdown(es)) {
+        if (!isTerminated(es)) {
             newThreadToCloseExecutor(es);
         }
     }
 
     public static void shutdownNow(Executor executor, final int timeout) {
-        if (!(executor instanceof ExecutorService) || isShutdown(executor)) {
+        if (!(executor instanceof ExecutorService) || isTerminated(executor)) {
             return;
         }
         final ExecutorService es = (ExecutorService) executor;
@@ -85,13 +85,13 @@
         } catch (InterruptedException ex) {
             Thread.currentThread().interrupt();
         }
-        if (!isShutdown(es)) {
+        if (!isTerminated(es)) {
             newThreadToCloseExecutor(es);
         }
     }
 
     private static void newThreadToCloseExecutor(final ExecutorService es) {
-        if (!isShutdown(es)) {
+        if (!isTerminated(es)) {
             shutdownExecutor.execute(new Runnable() {
                 @Override
                 public void run() {
