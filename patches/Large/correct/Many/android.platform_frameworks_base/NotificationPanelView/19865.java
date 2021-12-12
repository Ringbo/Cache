diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
index 553d7f8..e5e3caf 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
@@ -277,7 +277,8 @@
     public void updateResources() {
         int panelWidth = getResources().getDimensionPixelSize(R.dimen.notification_panel_width);
         int panelGravity = getResources().getInteger(R.integer.notification_panel_layout_gravity);
-        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) mQsContainer.getLayoutParams();
+        FrameLayout.LayoutParams lp =
+                (FrameLayout.LayoutParams) mQsDensityContainer.getLayoutParams();
         if (lp.width != panelWidth) {
             lp.width = panelWidth;
             lp.gravity = panelGravity;
