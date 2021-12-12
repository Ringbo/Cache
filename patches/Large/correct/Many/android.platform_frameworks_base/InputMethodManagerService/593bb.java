diff --git a/services/core/java/com/android/server/InputMethodManagerService.java b/services/core/java/com/android/server/InputMethodManagerService.java
index 71ac544..8ae4917 100644
--- a/services/core/java/com/android/server/InputMethodManagerService.java
+++ b/services/core/java/com/android/server/InputMethodManagerService.java
@@ -822,7 +822,7 @@
         public void onUnlockUser(final @UserIdInt int userHandle) {
             // Called on ActivityManager thread.
             mService.mHandler.sendMessage(mService.mHandler.obtainMessage(MSG_SYSTEM_UNLOCK_USER,
-                    userHandle));
+                    userHandle /* arg1 */, 0 /* arg2 */));
         }
     }
 
