diff --git a/src/test/java/org/altbeacon/beacon/service/MonitoringStatusTest.java b/src/test/java/org/altbeacon/beacon/service/MonitoringStatusTest.java
index 3cb74f8..585a718 100644
--- a/src/test/java/org/altbeacon/beacon/service/MonitoringStatusTest.java
+++ b/src/test/java/org/altbeacon/beacon/service/MonitoringStatusTest.java
@@ -75,7 +75,8 @@
             monitoringStatus.addRegion(region);
         }
         monitoringStatus.saveMonitoringStatusIfOn();
-        monitoringStatus.updateMonitoringStatusTime();
+        // Set update time to one hour ago
+        monitoringStatus.updateMonitoringStatusTime(System.currentTimeMillis() - 1000*3600l);
         MonitoringStatus monitoringStatus2 = new MonitoringStatus(context);
         assertEquals("restored regions should be none", 0, monitoringStatus2.regions().size());
     }
