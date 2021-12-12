diff --git a/src/com/facebook/buck/util/DefaultProcessExecutor.java b/src/com/facebook/buck/util/DefaultProcessExecutor.java
index d32f906..691f21c 100644
--- a/src/com/facebook/buck/util/DefaultProcessExecutor.java
+++ b/src/com/facebook/buck/util/DefaultProcessExecutor.java
@@ -301,7 +301,7 @@
       if (timeOutMs.isPresent()) {
         timedOut = waitForTimeoutInternal(process, timeOutMs.get(), timeOutHandler);
         if (!processHelper.hasProcessFinished(process)) {
-          process.destroy();
+          process.destroyForcibly();
         }
       } else {
         process.waitFor();
