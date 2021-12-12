diff --git a/src/main/java/spark/Service.java b/src/main/java/spark/Service.java
index eb29136..0b42b05 100644
--- a/src/main/java/spark/Service.java
+++ b/src/main/java/spark/Service.java
@@ -540,11 +540,11 @@
      * @param exceptionClass the exception class
      * @param handler        The handler
      */
-    public synchronized void exception(Class<? extends Exception> exceptionClass, ExceptionHandler handler) {
+    public synchronized <T extends Exception> void exception(Class<T> exceptionClass, ExceptionHandler<? super T> handler) {
         // wrap
-        ExceptionHandlerImpl wrapper = new ExceptionHandlerImpl(exceptionClass) {
+        ExceptionHandlerImpl wrapper = new ExceptionHandlerImpl<T>(exceptionClass) {
             @Override
-            public void handle(Exception exception, Request request, Response response) {
+            public void handle(T exception, Request request, Response response) {
                 handler.handle(exception, request, response);
             }
         };
