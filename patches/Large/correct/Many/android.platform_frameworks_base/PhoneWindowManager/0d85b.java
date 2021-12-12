diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 60fbabf..9ce147d 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -7392,8 +7392,8 @@
     }
 
     private boolean areSystemNavigationKeysEnabled() {
-        return Settings.Secure.getInt(mContext.getContentResolver(),
-                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 0) == 1;
+        return Settings.Secure.getIntForUser(mContext.getContentResolver(),
+                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 0, UserHandle.USER_CURRENT) == 1;
     }
 
     @Override
