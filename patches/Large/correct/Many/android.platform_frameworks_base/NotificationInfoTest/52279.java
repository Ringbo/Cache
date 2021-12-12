diff --git a/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java b/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java
index cb509e0..bdeb8bc 100644
--- a/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java
+++ b/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java
@@ -314,12 +314,11 @@
 
     @Test
     public void testLogBlockingHelperCounter_logsForBlockingHelper() throws Exception {
-        // Bind notification logs an event, so this counts as one invocation for the metrics logger.
         mNotificationInfo.bindNotification(mMockPackageManager, mMockINotificationManager,
                 TEST_PACKAGE_NAME, mNotificationChannel, 1, mSbn, null, null, null, false, true,
                 true);
         mNotificationInfo.logBlockingHelperCounter("HowCanNotifsBeRealIfAppsArent");
-        verify(mMetricsLogger, times(2)).count(anyString(), anyInt());
+        verify(mMetricsLogger, times(1)).count(anyString(), anyInt());
     }
 
     @Test
