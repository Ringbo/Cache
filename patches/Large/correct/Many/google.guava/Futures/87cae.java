diff --git a/guava/src/com/google/common/util/concurrent/Futures.java b/guava/src/com/google/common/util/concurrent/Futures.java
index 554ce58..effddda 100644
--- a/guava/src/com/google/common/util/concurrent/Futures.java
+++ b/guava/src/com/google/common/util/concurrent/Futures.java
@@ -580,9 +580,11 @@
    * @param time when to timeout the future
    * @param unit the time unit of the time parameter
    * @param scheduledExecutor The executor service to enforce the timeout.
+   *
+   * @since 19.0
    */
   @GwtIncompatible("java.util.concurrent.ScheduledExecutorService")
-  static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> delegate,
+  public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> delegate,
       long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
     TimeoutFuture<V> result = new TimeoutFuture<V>(delegate);
     TimeoutFuture.Fire<V> fire = new TimeoutFuture.Fire<V>(result);
