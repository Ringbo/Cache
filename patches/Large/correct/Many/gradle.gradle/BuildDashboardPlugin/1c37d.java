diff --git a/subprojects/reporting/src/main/java/org/gradle/api/reporting/plugins/BuildDashboardPlugin.java b/subprojects/reporting/src/main/java/org/gradle/api/reporting/plugins/BuildDashboardPlugin.java
index 621cba4..35d8541 100644
--- a/subprojects/reporting/src/main/java/org/gradle/api/reporting/plugins/BuildDashboardPlugin.java
+++ b/subprojects/reporting/src/main/java/org/gradle/api/reporting/plugins/BuildDashboardPlugin.java
@@ -67,7 +67,7 @@
         };
 
         for (Project aProject : project.getAllprojects()) {
-            aProject.getTasks().all(captureReportingTasks);
+            aProject.getTasks().configureEach(captureReportingTasks);
         }
     }
 
