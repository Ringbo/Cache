diff --git a/servlet/src/test/java/io/undertow/servlet/test/streams/ContentLengthCloseFlushServlet.java b/servlet/src/test/java/io/undertow/servlet/test/streams/ContentLengthCloseFlushServlet.java
index ce852fe..2ed3bc5 100644
--- a/servlet/src/test/java/io/undertow/servlet/test/streams/ContentLengthCloseFlushServlet.java
+++ b/servlet/src/test/java/io/undertow/servlet/test/streams/ContentLengthCloseFlushServlet.java
@@ -16,7 +16,7 @@
     private boolean completed = false;
 
     @Override
-    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
+    protected synchronized void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
         if (completed) {
             resp.getWriter().write("OK");
         } else {
