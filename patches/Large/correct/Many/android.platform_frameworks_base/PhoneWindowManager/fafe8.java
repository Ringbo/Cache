diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index f9f0fd9..ea47303 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -7268,7 +7268,7 @@
 
     private boolean areSystemNavigationKeysEnabled() {
         return Settings.Global.getInt(mContext.getContentResolver(),
-                Settings.Global.SYSTEM_NAVIGATION_KEYS_ENABLED, 0) == 1;
+                Settings.Global.SYSTEM_NAVIGATION_KEYS_ENABLED, 1) == 1;
     }
 
     @Override
