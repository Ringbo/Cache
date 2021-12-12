diff --git a/src/main/java/spark/ExceptionHandler.java b/src/main/java/spark/ExceptionHandler.java
index 4650688..f30004d 100644
--- a/src/main/java/spark/ExceptionHandler.java
+++ b/src/main/java/spark/ExceptionHandler.java
@@ -4,7 +4,7 @@
  * Created by Per Wendel on 2014-05-10.
  */
 @FunctionalInterface
-public interface ExceptionHandler {
+public interface ExceptionHandler<T extends Exception> {
 
     /**
      * Invoked when an exception that is mapped to this handler occurs during routing
@@ -13,5 +13,5 @@
      * @param request   The request object providing information about the HTTP request
      * @param response  The response object providing functionality for modifying the response
      */
-    void handle(Exception exception, Request request, Response response);
+    void handle(T exception, Request request, Response response);
 }
