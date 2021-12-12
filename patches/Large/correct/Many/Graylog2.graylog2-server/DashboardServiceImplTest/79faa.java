diff --git a/graylog2-server/src/test/java/org/graylog2/dashboards/DashboardServiceImplTest.java b/graylog2-server/src/test/java/org/graylog2/dashboards/DashboardServiceImplTest.java
index 3baa30d..d078cf7 100644
--- a/graylog2-server/src/test/java/org/graylog2/dashboards/DashboardServiceImplTest.java
+++ b/graylog2-server/src/test/java/org/graylog2/dashboards/DashboardServiceImplTest.java
@@ -60,7 +60,7 @@
 
     @Before
     public void setUpService() throws Exception {
-        this.dashboardService = new DashboardServiceImpl(mongoRule.getMongoConnection(), metricRegistry, searches, dashboardWidgetCreator);
+        this.dashboardService = new DashboardServiceImpl(mongoRule.getMongoConnection(), dashboardWidgetCreator);
     }
 
     @Test
