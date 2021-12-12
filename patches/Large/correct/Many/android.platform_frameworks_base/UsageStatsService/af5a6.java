diff --git a/services/usage/java/com/android/server/usage/UsageStatsService.java b/services/usage/java/com/android/server/usage/UsageStatsService.java
index 36a2a95..3b0fd1f 100644
--- a/services/usage/java/com/android/server/usage/UsageStatsService.java
+++ b/services/usage/java/com/android/server/usage/UsageStatsService.java
@@ -654,7 +654,7 @@
         public boolean isAppInactive(String packageName, int userId) {
             try {
                 userId = ActivityManager.getService().handleIncomingUser(Binder.getCallingPid(),
-                        Binder.getCallingUid(), userId, false, true, "isAppInactive", null);
+                        Binder.getCallingUid(), userId, false, false, "isAppInactive", null);
             } catch (RemoteException re) {
                 throw re.rethrowFromSystemServer();
             }
