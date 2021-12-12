diff --git a/services/usage/java/com/android/server/usage/UsageStatsService.java b/services/usage/java/com/android/server/usage/UsageStatsService.java
index 878fbed..0572771 100644
--- a/services/usage/java/com/android/server/usage/UsageStatsService.java
+++ b/services/usage/java/com/android/server/usage/UsageStatsService.java
@@ -683,7 +683,7 @@
             final int callingUid = Binder.getCallingUid();
             try {
                 userId = ActivityManager.getService().handleIncomingUser(
-                        Binder.getCallingPid(), callingUid, userId, false, true,
+                        Binder.getCallingPid(), callingUid, userId, false, false,
                         "getAppStandbyBucket", null);
             } catch (RemoteException re) {
                 throw re.rethrowFromSystemServer();
