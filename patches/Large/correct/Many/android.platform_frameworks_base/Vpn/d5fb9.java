diff --git a/services/core/java/com/android/server/connectivity/Vpn.java b/services/core/java/com/android/server/connectivity/Vpn.java
index a07591c9..ac55292 100644
--- a/services/core/java/com/android/server/connectivity/Vpn.java
+++ b/services/core/java/com/android/server/connectivity/Vpn.java
@@ -488,7 +488,8 @@
         try {
             // Restricted users are not allowed to create VPNs, they are tied to Owner
             UserInfo user = mgr.getUserInfo(mUserHandle);
-            if (user.isRestricted() || mgr.hasUserRestriction(UserManager.DISALLOW_CONFIG_VPN)) {
+            if (user.isRestricted() || mgr.hasUserRestriction(UserManager.DISALLOW_CONFIG_VPN,
+                    new UserHandle(mUserHandle))) {
                 throw new SecurityException("Restricted users cannot establish VPNs");
             }
 
@@ -896,7 +897,8 @@
         }
         UserManager mgr = UserManager.get(mContext);
         UserInfo user = mgr.getUserInfo(mUserHandle);
-        if (user.isRestricted() || mgr.hasUserRestriction(UserManager.DISALLOW_CONFIG_VPN)) {
+        if (user.isRestricted() || mgr.hasUserRestriction(UserManager.DISALLOW_CONFIG_VPN,
+                    new UserHandle(mUserHandle))) {
             throw new SecurityException("Restricted users cannot establish VPNs");
         }
 
