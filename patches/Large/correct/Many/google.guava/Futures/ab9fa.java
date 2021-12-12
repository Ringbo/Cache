diff --git a/guava/src/com/google/common/util/concurrent/Futures.java b/guava/src/com/google/common/util/concurrent/Futures.java
index 9987593..2334773 100644
--- a/guava/src/com/google/common/util/concurrent/Futures.java
+++ b/guava/src/com/google/common/util/concurrent/Futures.java
@@ -851,7 +851,7 @@
       if (super.cancel(mayInterruptIfRunning)) {
         ListenableFuture<? extends I> localInputFuture = inputFuture;
         if (localInputFuture != null) {
-          inputFuture.cancel(mayInterruptIfRunning);
+          localInputFuture.cancel(mayInterruptIfRunning);
         }
         return true;
       }
