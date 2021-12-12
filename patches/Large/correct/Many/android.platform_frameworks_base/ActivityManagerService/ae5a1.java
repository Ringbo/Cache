diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 08b204a..c124e5d 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -9077,7 +9077,8 @@
     }
 
     @Override
-    public List<ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum, int flags, int userId) {
+    public ParceledListSlice<ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum, int flags,
+            int userId) {
         final int callingUid = Binder.getCallingUid();
         userId = mUserController.handleIncomingUser(Binder.getCallingPid(), callingUid, userId,
                 false, ALLOW_FULL_ONLY, "getRecentTasks", null);
@@ -9093,7 +9094,7 @@
 
             if (!isUserRunning(userId, ActivityManager.FLAG_AND_UNLOCKED)) {
                 Slog.i(TAG, "user " + userId + " is still locked. Cannot load recents");
-                return Collections.emptyList();
+                return ParceledListSlice.emptyList();
             }
             mRecentTasks.loadUserRecentsLocked(userId);
 
@@ -9192,7 +9193,7 @@
                     maxNum--;
                 }
             }
-            return res;
+            return new ParceledListSlice<>(res);
         }
     }
 
