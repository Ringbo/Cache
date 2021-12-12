diff --git a/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java b/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java
index d8650ba..4ac5449 100644
--- a/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java
+++ b/dropwizard-core/src/main/java/com/yammer/dropwizard/tasks/TaskServlet.java
@@ -33,7 +33,7 @@
     public TaskServlet(Iterable<Task> tasks) {
         final ImmutableMap.Builder<String, Task> builder = ImmutableMap.builder();
         for (Task task : tasks) {
-            builder.put("/tasks/" + task.getName(), task);
+            builder.put("/" + task.getName(), task);
         }
         this.tasks = builder.build();
     }
@@ -41,7 +41,7 @@
     @Override
     protected void doPost(HttpServletRequest req,
                           HttpServletResponse resp) throws ServletException, IOException {
-        final Task task = tasks.get(req.getServletPath());
+        final Task task = tasks.get(req.getPathInfo());
         if (task != null) {
             try {
                 resp.setContentType(MediaType.TEXT_PLAIN);
