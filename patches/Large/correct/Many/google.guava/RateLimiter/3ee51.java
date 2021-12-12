diff --git a/guava/src/com/google/common/util/concurrent/RateLimiter.java b/guava/src/com/google/common/util/concurrent/RateLimiter.java
index eb4ef4e..bba3a84 100644
--- a/guava/src/com/google/common/util/concurrent/RateLimiter.java
+++ b/guava/src/com/google/common/util/concurrent/RateLimiter.java
@@ -248,6 +248,10 @@
     return create(SleepingStopwatch.createFromSystemTimer(), permitsPerSecond);
   }
 
+  /*
+   * TODO(cpovirk): make SleepingStopwatch the last parameter throughout the class so that the
+   * overloads follow the usual convention: Foo(int), Foo(int, SleepingStopwatch)
+   */
   @VisibleForTesting
   static RateLimiter create(SleepingStopwatch stopwatch, double permitsPerSecond) {
     RateLimiter rateLimiter = new SmoothBursty(stopwatch, 1.0 /* maxBurstSeconds */);
@@ -490,7 +494,7 @@
     return true;
   }
 
-  private final boolean canAcquire(long nowMicros, long timeoutMicros) {
+  private boolean canAcquire(long nowMicros, long timeoutMicros) {
     return earliestAvailable(nowMicros) - timeoutMicros <= nowMicros;
   }
 
