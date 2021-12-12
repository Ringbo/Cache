diff --git a/packages/SystemUI/src/com/android/systemui/OverviewProxyService.java b/packages/SystemUI/src/com/android/systemui/OverviewProxyService.java
index 8d8b726..b7e1d67 100644
--- a/packages/SystemUI/src/com/android/systemui/OverviewProxyService.java
+++ b/packages/SystemUI/src/com/android/systemui/OverviewProxyService.java
@@ -199,7 +199,7 @@
         launcherServiceIntent.setComponent(mLauncherComponentName);
         boolean bound = mContext.bindServiceAsUser(launcherServiceIntent,
                 mOverviewServiceConnection, Context.BIND_AUTO_CREATE,
-                UserHandle.getUserHandleForUid(mDeviceProvisionedController.getCurrentUser()));
+                UserHandle.of(mDeviceProvisionedController.getCurrentUser()));
         if (!bound) {
             // Retry after exponential backoff timeout
             final long timeoutMs = (long) Math.scalb(BACKOFF_MILLIS, mConnectionBackoffAttempts);
