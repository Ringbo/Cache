diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index a28c387..f872cc3 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -1595,7 +1595,7 @@
                     ApplicationInfo ai = mIPackageManager.getApplicationInfo(imm.getPackageName(),
                             PackageManager.GET_DISABLED_UNTIL_USED_COMPONENTS,
                             mSettings.getCurrentUserId());
-                    if (ai.enabledSetting
+                    if (ai != null && ai.enabledSetting
                             == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED) {
                         mIPackageManager.setApplicationEnabledSetting(imm.getPackageName(),
                                 PackageManager.COMPONENT_ENABLED_STATE_DEFAULT,
