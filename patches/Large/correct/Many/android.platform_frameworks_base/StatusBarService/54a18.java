diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarService.java b/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarService.java
index 4ddd45c..07bcce7 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarService.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarService.java
@@ -584,7 +584,7 @@
         }
         if (expanded == null) {
             String ident = notification.pkg + "/0x" + Integer.toHexString(notification.id);
-            Slog.e(TAG, "couldn't inflate view for notification " + ident);
+            Slog.e(TAG, "couldn't inflate view for notification " + ident, exception);
             return null;
         } else {
             content.addView(expanded);
