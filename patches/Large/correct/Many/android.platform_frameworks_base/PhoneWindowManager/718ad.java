diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index be64a47..adf6453 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -7391,8 +7391,8 @@
     }
 
     private boolean areSystemNavigationKeysEnabled() {
-        return Settings.Secure.getInt(mContext.getContentResolver(),
-                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 0) == 1;
+        return Settings.Secure.getIntForUser(mContext.getContentResolver(),
+                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 0, UserHandle.USER_CURRENT) == 1;
     }
 
     @Override
