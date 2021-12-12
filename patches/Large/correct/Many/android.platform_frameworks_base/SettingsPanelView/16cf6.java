diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/SettingsPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/SettingsPanelView.java
index a58eb22..bbb8455 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/SettingsPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/SettingsPanelView.java
@@ -41,7 +41,7 @@
     private QuickSettingsContainerView mQSContainer;
 
     Drawable mHandleBar;
-    float mHandleBarHeight;
+    int mHandleBarHeight;
     View mHandleView;
 
     public SettingsPanelView(Context context, AttributeSet attrs) {
@@ -56,7 +56,7 @@
 
         Resources resources = getContext().getResources();
         mHandleBar = resources.getDrawable(R.drawable.status_bar_close);
-        mHandleBarHeight = resources.getDimension(R.dimen.close_handle_height);
+        mHandleBarHeight = resources.getDimensionPixelSize(R.dimen.close_handle_height);
         mHandleView = findViewById(R.id.handle);
 
         setContentDescription(resources.getString(R.string.accessibility_desc_quick_settings));
