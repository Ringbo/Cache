diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java
index 32af5e3..8c390c8 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettings.java
@@ -291,7 +291,7 @@
                 mBar.collapseAllPanels(true);
                 final UserManager um =
                         (UserManager) mContext.getSystemService(Context.USER_SERVICE);
-                if (um.getUsers().size() > 1) {
+                if (um.getUsers(true).size() > 1) {
                     try {
                         WindowManagerGlobal.getWindowManagerService().lockNow(
                                 LockPatternUtils.USER_SWITCH_LOCK_OPTIONS);
