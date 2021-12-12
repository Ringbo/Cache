diff --git a/packages/SystemUI/src/com/android/systemui/globalactions/GlobalActionsDialog.java b/packages/SystemUI/src/com/android/systemui/globalactions/GlobalActionsDialog.java
index 087d481..ea3f95e 100644
--- a/packages/SystemUI/src/com/android/systemui/globalactions/GlobalActionsDialog.java
+++ b/packages/SystemUI/src/com/android/systemui/globalactions/GlobalActionsDialog.java
@@ -344,8 +344,8 @@
             } else if (GLOBAL_ACTION_KEY_SETTINGS.equals(actionKey)) {
                 mItems.add(getSettingsAction());
             } else if (GLOBAL_ACTION_KEY_LOCKDOWN.equals(actionKey)) {
-                if (Settings.Secure.getInt(mContext.getContentResolver(),
-                            Settings.Secure.LOCKDOWN_IN_POWER_MENU, 0) != 0
+                if (Settings.Secure.getIntForUser(mContext.getContentResolver(),
+                            Settings.Secure.LOCKDOWN_IN_POWER_MENU, 0, getCurrentUser().id) != 0
                         && shouldDisplayLockdown()) {
                     mItems.add(getLockdownAction());
                     mHasLockdownButton = true;
