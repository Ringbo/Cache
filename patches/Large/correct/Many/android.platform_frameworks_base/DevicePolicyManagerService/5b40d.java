diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index d0128b7..c59c5f3 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -2658,7 +2658,7 @@
             int userHandle = params[0];
 
             if (userHandle == UserHandle.USER_ALL) {
-                for (UserInfo userInfo : mUserManager.getUsers()) {
+                for (UserInfo userInfo : mUserManager.getUsers(true)) {
                     manageNotification(userInfo.getUserHandle());
                 }
             } else {
@@ -2668,7 +2668,7 @@
         }
 
         private void manageNotification(UserHandle userHandle) {
-            if (!mUserManager.isUserRunning(userHandle)) {
+            if (!mUserManager.isUserUnlocked(userHandle)) {
                 return;
             }
 
