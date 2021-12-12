diff --git a/src/main/java/spark/Route.java b/src/main/java/spark/Route.java
index 601efa3..0aa82fd 100644
--- a/src/main/java/spark/Route.java
+++ b/src/main/java/spark/Route.java
@@ -12,6 +12,6 @@
      * @param response The response object providing functionality for modifying the response
      * @return The content to be set in the response
      */
-    Object handle(Request request, Response response);
+    Object handle(Request request, Response response)  throws Exception;
 
 }
