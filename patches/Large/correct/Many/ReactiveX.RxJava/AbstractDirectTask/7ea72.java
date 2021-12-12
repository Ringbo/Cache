diff --git a/src/main/java/io/reactivex/internal/schedulers/AbstractDirectTask.java b/src/main/java/io/reactivex/internal/schedulers/AbstractDirectTask.java
index ef6c57c..cd278fe 100644
--- a/src/main/java/io/reactivex/internal/schedulers/AbstractDirectTask.java
+++ b/src/main/java/io/reactivex/internal/schedulers/AbstractDirectTask.java
@@ -40,7 +40,7 @@
 
     protected static final FutureTask<Void> DISPOSED = new FutureTask<Void>(Functions.EMPTY_RUNNABLE, null);
 
-    public AbstractDirectTask(Runnable runnable) {
+    AbstractDirectTask(Runnable runnable) {
         this.runnable = runnable;
     }
 
