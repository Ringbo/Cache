diff --git a/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java b/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java
index 32a4f4a..55f42b8 100644
--- a/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java
+++ b/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java
@@ -637,7 +637,7 @@
     if (flow == null) {
       ret.put("status", "error");
       ret.put("message", "Flow " + flowName + " cannot be found in project "
-          + project);
+          + projectName);
       return;
     }
 
