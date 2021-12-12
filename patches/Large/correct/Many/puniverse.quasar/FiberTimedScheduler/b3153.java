diff --git a/quasar-core/src/main/java/co/paralleluniverse/fibers/FiberTimedScheduler.java b/quasar-core/src/main/java/co/paralleluniverse/fibers/FiberTimedScheduler.java
index 0b251fd..f15cd4f 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/fibers/FiberTimedScheduler.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/fibers/FiberTimedScheduler.java
@@ -438,7 +438,7 @@
             Thread t = f.getRunningThread();
             if (t == null)
                 System.err.println("WARNING: fiber " + f + " is hogging the CPU or blocking a thread.");
-            else if(t.getState() != Thread.State.RUNNABLE)
+            else if(t.getState() == Thread.State.RUNNABLE)
                 System.err.println("WARNING: fiber " + f + " is hogging the CPU (" + t + ").");
             else
                 System.err.println("WARNING: fiber " + f + " is blocking a thread (" + t + ").");
