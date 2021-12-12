diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/dashboards/ProjectIssuesDashboard.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/dashboards/ProjectIssuesDashboard.java
index 0df89cb..1f15bdf 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/dashboards/ProjectIssuesDashboard.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/dashboards/ProjectIssuesDashboard.java
@@ -46,7 +46,7 @@
 
   private void addFirstColumn(Dashboard dashboard) {
     dashboard.addWidget("unresolved_issues_statuses", 1);
-    dashboard.addWidget("issues_action_plans", 2);
+    dashboard.addWidget("issues_action_plans", 1);
   }
 
   private void addSecondColumn(Dashboard dashboard) {
