diff --git a/service-monitor/src/test/java/com/yahoo/vespa/service/monitor/internal/DuperModelTest.java b/service-monitor/src/test/java/com/yahoo/vespa/service/monitor/internal/DuperModelTest.java
index 2385cca..c9d19d0 100644
--- a/service-monitor/src/test/java/com/yahoo/vespa/service/monitor/internal/DuperModelTest.java
+++ b/service-monitor/src/test/java/com/yahoo/vespa/service/monitor/internal/DuperModelTest.java
@@ -41,7 +41,7 @@
     @Test
     public void toApplicationInstanceInSingleTenantMode() {
         when(statusProvider.getStatus(any(), any(), any(), any())).thenReturn(ServiceStatus.NOT_CHECKED);
-        ConfigserverConfig config = ConfigserverUtil.createExampleConfigserverConfig();
+        ConfigserverConfig config = ConfigserverUtil.createExampleConfigserverConfig(true, false);
         DuperModel duperModel = new DuperModel(config);
         SuperModel superModel = mock(SuperModel.class);
         ApplicationInfo superModelApplicationInfo = mock(ApplicationInfo.class);
