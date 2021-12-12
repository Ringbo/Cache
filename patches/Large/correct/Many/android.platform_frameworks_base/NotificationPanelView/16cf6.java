diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
index 248a516..2bad353 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
@@ -31,7 +31,7 @@
 public class NotificationPanelView extends PanelView {
 
     Drawable mHandleBar;
-    float mHandleBarHeight;
+    int mHandleBarHeight;
     View mHandleView;
     int mFingers;
     PhoneStatusBar mStatusBar;
@@ -51,7 +51,7 @@
 
         Resources resources = getContext().getResources();
         mHandleBar = resources.getDrawable(R.drawable.status_bar_close);
-        mHandleBarHeight = resources.getDimension(R.dimen.close_handle_height);
+        mHandleBarHeight = resources.getDimensionPixelSize(R.dimen.close_handle_height);
         mHandleView = findViewById(R.id.handle);
 
         setContentDescription(resources.getString(R.string.accessibility_desc_notification_shade));
