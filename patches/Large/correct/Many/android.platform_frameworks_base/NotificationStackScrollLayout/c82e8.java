diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
index f078b53..8f9a224 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
@@ -3045,7 +3045,7 @@
             disableClipOptimization();
         }
         handleDismissAllClipping();
-        if (mCurrIconRow != null & mCurrIconRow.isVisible()) {
+        if (mCurrIconRow != null && mCurrIconRow.isVisible()) {
             mCurrIconRow.getNotificationParent().animateTranslateNotification(0 /* left target */);
         }
     }
