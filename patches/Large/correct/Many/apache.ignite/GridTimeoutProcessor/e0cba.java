diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/timeout/GridTimeoutProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/timeout/GridTimeoutProcessor.java
index 405e321..7efcea9 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/timeout/GridTimeoutProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/timeout/GridTimeoutProcessor.java
@@ -144,15 +144,15 @@
     /**
      * Wait for a future (listen with timeout).
      * @param fut Future.
-     * @param timeout Timeout millis. -1 means expired timeout, 0 - no timeout.
+     * @param timeout Timeout millis. -1 means expired timeout, 0 means waiting without timeout.
      * @param clo Finish closure. First argument contains error on future or null if no errors,
-     * second is {@code true} if wait timed out.
+     * second is {@code true} if wait timed out or passed timeout argument means expired timeout.
      */
     public void waitAsync(final IgniteInternalFuture<?> fut,
         long timeout,
         IgniteBiInClosure<IgniteCheckedException, Boolean> clo) {
         if (timeout == -1) {
-            clo.apply(null, false);
+            clo.apply(null, true);
 
             return;
         }
