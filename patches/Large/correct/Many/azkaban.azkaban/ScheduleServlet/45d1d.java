diff --git a/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java b/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java
index 55f42b8..7b61833 100644
--- a/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java
+++ b/azkaban-web-server/src/main/java/azkaban/webapp/servlet/ScheduleServlet.java
@@ -718,7 +718,7 @@
     if (flow == null) {
       ret.put("status", "error");
       ret.put("message", "Flow " + flowName + " cannot be found in project "
-          + project);
+          + projectName);
       return;
     }
 
