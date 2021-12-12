diff --git a/servers/src/main/java/tachyon/web/WebInterfaceWorkersServlet.java b/servers/src/main/java/tachyon/web/WebInterfaceWorkersServlet.java
index 6523077..6963250 100644
--- a/servers/src/main/java/tachyon/web/WebInterfaceWorkersServlet.java
+++ b/servers/src/main/java/tachyon/web/WebInterfaceWorkersServlet.java
@@ -35,7 +35,7 @@
 /**
  * Servlet that provides data for displaying detail info of all workers.
  */
-final class WebInterfaceWorkersServlet extends HttpServlet {
+public final class WebInterfaceWorkersServlet extends HttpServlet {
   /**
    * Class to make referencing worker nodes more intuitive. Mainly to avoid implicit association by
    * array indexes.
