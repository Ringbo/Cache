diff --git a/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java b/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java
index e90ddbf..ea11200 100644
--- a/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java
+++ b/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java
@@ -852,7 +852,7 @@
         @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
                 throws ServletException, IOException {
-            boolean notify = Boolean.valueOf(request.getParameter("notify"));
+            boolean notify = Boolean.parseBoolean(request.getParameter("notify"));
             AsyncContext ctx = request.startAsync();
             ctx.setTimeout(1000);
             if (!notify) {
