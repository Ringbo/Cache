diff --git a/packages/SystemUI/src/com/android/systemui/qs/QSPanel.java b/packages/SystemUI/src/com/android/systemui/qs/QSPanel.java
index d216069..1173053 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/QSPanel.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/QSPanel.java
@@ -49,7 +49,7 @@
     private final View mDetailSettingsButton;
     private final View mDetailDoneButton;
     private final View mBrightnessView;
-    private final CircularClipper mClipper;
+    private final QSDetailClipper mClipper;
     private final H mHandler = new H();
 
     private int mColumns;
@@ -85,7 +85,7 @@
                 R.layout.quick_settings_brightness_dialog, this, false);
         addView(mDetail);
         addView(mBrightnessView);
-        mClipper = new CircularClipper(mDetail);
+        mClipper = new QSDetailClipper(mDetail);
         updateResources();
 
         mBrightnessController = new BrightnessController(getContext(),
