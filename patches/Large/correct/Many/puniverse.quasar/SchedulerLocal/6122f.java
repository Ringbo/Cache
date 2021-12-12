diff --git a/quasar-core/src/main/java/co/paralleluniverse/fibers/SchedulerLocal.java b/quasar-core/src/main/java/co/paralleluniverse/fibers/SchedulerLocal.java
index ed65139..d83dd9b 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/fibers/SchedulerLocal.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/fibers/SchedulerLocal.java
@@ -39,8 +39,7 @@
     /**
      * Returns the scheduler-local value of this {@code SchedulerLocal}.
      */
-    @Suspendable
-    public final T get() {
+    public final T get() throws SuspendExecution {
         final FiberScheduler scheduler = currentScheduler();
         final ConcurrentMap<SchedulerLocal, Entry<?>> map = scheduler.schedLocals;
         Entry<T> entry = (Entry<T>) map.get(this);
