diff --git a/core/java/android/app/KeyguardManager.java b/core/java/android/app/KeyguardManager.java
index 036b47c..6793c90 100644
--- a/core/java/android/app/KeyguardManager.java
+++ b/core/java/android/app/KeyguardManager.java
@@ -322,7 +322,7 @@
      * password.
      */
     public boolean isDeviceLocked() {
-        return isDeviceLocked(UserHandle.getCallingUserId());
+        return isDeviceLocked(UserHandle.myUserId());
     }
 
     /**
@@ -347,7 +347,7 @@
      * @return true if a PIN, pattern or password was set.
      */
     public boolean isDeviceSecure() {
-        return isDeviceSecure(UserHandle.getCallingUserId());
+        return isDeviceSecure(UserHandle.myUserId());
     }
 
     /**
