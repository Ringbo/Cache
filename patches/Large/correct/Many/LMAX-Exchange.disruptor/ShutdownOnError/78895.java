diff --git a/src/test/java/com/lmax/disruptor/example/ShutdownOnError.java b/src/test/java/com/lmax/disruptor/example/ShutdownOnError.java
index 96cd38f..ab5e4a5 100644
--- a/src/test/java/com/lmax/disruptor/example/ShutdownOnError.java
+++ b/src/test/java/com/lmax/disruptor/example/ShutdownOnError.java
@@ -16,7 +16,7 @@
     {
         public long value;
 
-        public static EventFactory<Event> FACTORY = new EventFactory<Event>()
+        public static final EventFactory<Event> FACTORY = new EventFactory<Event>()
         {
             @Override
             public Event newInstance()
@@ -44,11 +44,11 @@
         }
     }
 
-    private static class ErrorHandler implements ExceptionHandler<Event>
+    private static final class ErrorHandler implements ExceptionHandler<Event>
     {
         private final AtomicBoolean running;
 
-        public ErrorHandler(AtomicBoolean running)
+        private ErrorHandler(AtomicBoolean running)
         {
             this.running = running;
         }
