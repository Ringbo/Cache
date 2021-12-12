diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
index 1c4556f..e490359 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
@@ -1625,7 +1625,7 @@
                 }
             }
             boolean showOnKeyguard = shouldShowOnKeyguard(entry.notification);
-            if ((isLockscreenPublicMode() && !showOnKeyguard) ||
+            if ((isLockscreenPublicMode() && !mShowLockscreenNotifications) ||
                     (onKeyguard && (visibleNotifications >= maxKeyguardNotifications
                             || !showOnKeyguard))) {
                 entry.row.setVisibility(View.GONE);
