diff --git a/src/main/java/spark/ExceptionHandlerImpl.java b/src/main/java/spark/ExceptionHandlerImpl.java
index 30e1136..d50c68d 100644
--- a/src/main/java/spark/ExceptionHandlerImpl.java
+++ b/src/main/java/spark/ExceptionHandlerImpl.java
@@ -16,18 +16,19 @@
  */
 package spark;
 
-public abstract class ExceptionHandlerImpl implements ExceptionHandler {
+public abstract class ExceptionHandlerImpl<T extends Exception> implements ExceptionHandler<T> {
+
     /**
      * Holds the type of exception that this filter will handle
      */
-    protected Class<? extends Exception> exceptionClass;
+    protected Class<? extends T> exceptionClass;
 
     /**
      * Initializes the filter with the provided exception type
      *
      * @param exceptionClass Type of exception
      */
-    public ExceptionHandlerImpl(Class<? extends Exception> exceptionClass) {
+    public ExceptionHandlerImpl(Class<T> exceptionClass) {
         this.exceptionClass = exceptionClass;
     }
 
@@ -36,7 +37,7 @@
      *
      * @return Type of exception
      */
-    public Class<? extends Exception> exceptionClass() {
+    public Class<? extends T> exceptionClass() {
         return this.exceptionClass;
     }
 
@@ -45,7 +46,7 @@
      *
      * @param exceptionClass Type of exception
      */
-    public void exceptionClass(Class<? extends Exception> exceptionClass) {
+    public void exceptionClass(Class<? extends T> exceptionClass) {
         this.exceptionClass = exceptionClass;
     }
 
@@ -56,5 +57,5 @@
      * @param request   The request object providing information about the HTTP request
      * @param response  The response object providing functionality for modifying the response
      */
-    public abstract void handle(Exception exception, Request request, Response response);
+    public abstract void handle(T exception, Request request, Response response);
 }
