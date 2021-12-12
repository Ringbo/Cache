diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index d19433e..8315ac4 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -1600,7 +1600,7 @@
                     ApplicationInfo ai = mIPackageManager.getApplicationInfo(imm.getPackageName(),
                             PackageManager.GET_DISABLED_UNTIL_USED_COMPONENTS,
                             mSettings.getCurrentUserId());
-                    if (ai.enabledSetting
+                    if (ai != null && ai.enabledSetting
                             == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED) {
                         mIPackageManager.setApplicationEnabledSetting(imm.getPackageName(),
                                 PackageManager.COMPONENT_ENABLED_STATE_DEFAULT,
