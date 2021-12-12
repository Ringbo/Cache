diff --git a/services/core/java/com/android/server/pm/LauncherAppsService.java b/services/core/java/com/android/server/pm/LauncherAppsService.java
index 71bfa64..e1426fd 100644
--- a/services/core/java/com/android/server/pm/LauncherAppsService.java
+++ b/services/core/java/com/android/server/pm/LauncherAppsService.java
@@ -245,9 +245,12 @@
 
                     // STOPSHIP Remove the whitelist.
                     if ("com.google.android.talk".equals(callingPackage)
-                            || "com.google.android.quicksearchbox".equals(callingPackage)) {
+                            || "com.google.android.quicksearchbox".equals(callingPackage)
+                            || "com.google.android.googlequicksearchbox".equals(callingPackage)
+                            ) {
                         return false;
                     }
+                    // STOPSHIP Change it to 'e'.
                     Slog.wtfStack(TAG, message + " by " + callingPackage + " for another profile "
                             + targetUserId + " from " + callingUserId);
 
