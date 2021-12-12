diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java
index b8e069d..dc7e9fc 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java
@@ -57,7 +57,7 @@
     protected View mSettingsContainer;
 
     private TextView mAlarmStatus;
-    private TextView mAlarmStatusCollapsed;
+    private View mAlarmStatusCollapsed;
 
     private QSPanel mQsPanel;
 
@@ -117,7 +117,7 @@
         mSettingsContainer = findViewById(R.id.settings_button_container);
         mSettingsButton.setOnClickListener(this);
 
-        mAlarmStatusCollapsed = (TextView) findViewById(R.id.alarm_status_collapsed);
+        mAlarmStatusCollapsed = findViewById(R.id.alarm_status_collapsed);
         mAlarmStatus = (TextView) findViewById(R.id.alarm_status);
         mAlarmStatus.setOnClickListener(this);
 
