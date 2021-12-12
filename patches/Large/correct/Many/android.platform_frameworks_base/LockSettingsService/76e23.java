diff --git a/services/core/java/com/android/server/LockSettingsService.java b/services/core/java/com/android/server/LockSettingsService.java
index c318140..e442d0e 100644
--- a/services/core/java/com/android/server/LockSettingsService.java
+++ b/services/core/java/com/android/server/LockSettingsService.java
@@ -345,9 +345,9 @@
                     final int userId = users.get(user).id;
                     final String OWNER_INFO = Secure.LOCK_SCREEN_OWNER_INFO;
                     String ownerInfo = Settings.Secure.getStringForUser(cr, OWNER_INFO, userId);
-                    if (ownerInfo != null) {
+                    if (!TextUtils.isEmpty(ownerInfo)) {
                         setString(OWNER_INFO, ownerInfo, userId);
-                        Settings.Secure.putStringForUser(cr, ownerInfo, "", userId);
+                        Settings.Secure.putStringForUser(cr, OWNER_INFO, "", userId);
                     }
 
                     // Migrate owner info enabled.  Note there was a bug where older platforms only
