diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 09c2b27..e502764 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -7306,7 +7306,7 @@
 
     private boolean areSystemNavigationKeysEnabled() {
         return Settings.Secure.getInt(mContext.getContentResolver(),
-                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 1) == 1;
+                Settings.Secure.SYSTEM_NAVIGATION_KEYS_ENABLED, 0) == 1;
     }
 
     @Override
