diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
index 5da3a10..4f30fb7 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
@@ -292,7 +292,7 @@
         int panelGravity = getResources().getInteger(R.integer.notification_panel_layout_gravity);
         FrameLayout.LayoutParams lp =
                 (FrameLayout.LayoutParams) mQsFrame.getLayoutParams();
-        if (lp.width != panelWidth) {
+        if (lp.width != panelWidth || lp.gravity != panelGravity) {
             lp.width = panelWidth;
             lp.gravity = panelGravity;
             mQsFrame.setLayoutParams(lp);
@@ -300,7 +300,7 @@
         }
 
         lp = (FrameLayout.LayoutParams) mNotificationStackScroller.getLayoutParams();
-        if (lp.width != panelWidth) {
+        if (lp.width != panelWidth || lp.gravity != panelGravity) {
             lp.width = panelWidth;
             lp.gravity = panelGravity;
             mNotificationStackScroller.setLayoutParams(lp);
