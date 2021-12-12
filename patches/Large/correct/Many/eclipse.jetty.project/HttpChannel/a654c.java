diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
index feb8eba..6bac773 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
@@ -344,7 +344,7 @@
                     {
                         try
                         {
-                            _response.reset();
+                            _response.reset(true);
                             Integer icode = (Integer)_request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
                             int code = icode != null ? icode : HttpStatus.INTERNAL_SERVER_ERROR_500;
                             _response.setStatus(code);
@@ -528,7 +528,7 @@
         try
         {
             Integer code=(Integer)_request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
-            _response.reset();
+            _response.reset(true);
             _response.setStatus(code == null ? 500 : code);
             _response.flushBuffer();
         }
