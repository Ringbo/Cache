diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index b507df0..ddc1ba0 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -7512,7 +7512,7 @@
 
     private boolean areSystemNavigationKeysEnabled() {
         return Settings.Secure.getIntForUser(mContext.getContentResolver(),
-                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 0, UserHandle.USER_CURRENT) == 1;
+                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 1, UserHandle.USER_CURRENT) == 1;
     }
 
     @Override
