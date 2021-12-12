diff --git a/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java b/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java
index da3b8f8..d8650ba 100644
--- a/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java
+++ b/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java
@@ -41,7 +41,7 @@
     @Override
     protected void doPost(HttpServletRequest req,
                           HttpServletResponse resp) throws ServletException, IOException {
-        final Task task = tasks.get(req.getRequestURI());
+        final Task task = tasks.get(req.getServletPath());
         if (task != null) {
             try {
                 resp.setContentType(MediaType.TEXT_PLAIN);
