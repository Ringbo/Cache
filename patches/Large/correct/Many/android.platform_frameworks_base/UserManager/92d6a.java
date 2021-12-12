diff --git a/core/java/android/os/UserManager.java b/core/java/android/os/UserManager.java
index 6a4f970..63de9a0 100644
--- a/core/java/android/os/UserManager.java
+++ b/core/java/android/os/UserManager.java
@@ -492,8 +492,7 @@
         ArrayList<UserHandle> profiles = new ArrayList<UserHandle>();
         List<UserInfo> users = new ArrayList<UserInfo>();
         try {
-            // TODO: Switch enabledOnly to true once client apps are updated
-            users = mService.getProfiles(UserHandle.myUserId(), false /* enabledOnly */);
+            users = mService.getProfiles(UserHandle.myUserId(), true /* enabledOnly */);
         } catch (RemoteException re) {
             Log.w(TAG, "Could not get user list", re);
             return null;
