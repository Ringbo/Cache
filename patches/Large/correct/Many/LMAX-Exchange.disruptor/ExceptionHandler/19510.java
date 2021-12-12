diff --git a/src/main/java/com/lmax/disruptor/ExceptionHandler.java b/src/main/java/com/lmax/disruptor/ExceptionHandler.java
index 0ffa097..bf02d68 100644
--- a/src/main/java/com/lmax/disruptor/ExceptionHandler.java
+++ b/src/main/java/com/lmax/disruptor/ExceptionHandler.java
@@ -18,7 +18,7 @@
 /**
  * Callback handler for uncaught exceptions in the event processing cycle of the {@link BatchEventProcessor}
  */
-public interface ExceptionHandler
+public interface ExceptionHandler<T>
 {
     /**
      * <p>Strategy for handling uncaught exceptions when processing an event.</p>
@@ -30,7 +30,7 @@
      * @param sequence of the event which cause the exception.
      * @param event being processed when the exception occurred.  This can be null.
      */
-    void handleEventException(Throwable ex, long sequence, Object event);
+    void handleEventException(Throwable ex, long sequence, T event);
 
     /**
      * Callback to notify of an exception during {@link LifecycleAware#onStart()}
