diff --git a/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/DashboardController.java b/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/DashboardController.java
index ce2f98b..791d081 100644
--- a/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/DashboardController.java
+++ b/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/DashboardController.java
@@ -114,7 +114,7 @@
         model.put("statisticsEndpointEnabled",
                 isEndpointCapable(casProperties.getMonitor().getEndpoints().getStatistics(), casProperties));
         model.put("singleSignOnStatusEndpointEnabled",
-                isEndpointCapable(casProperties.getMonitor().getEndpoints().getSingleSignOnReport(), casProperties));
+                isEndpointCapable(casProperties.getMonitor().getEndpoints().getSingleSignOnStatus(), casProperties));
         model.put("springWebflowEndpointEnabled",
                 isEndpointCapable(casProperties.getMonitor().getEndpoints().getSpringWebflowReport(), casProperties));
         model.put("auditLogEndpointEnabled",
