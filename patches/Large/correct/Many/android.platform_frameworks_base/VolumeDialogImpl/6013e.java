diff --git a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
index c8fcfce..b08cdef 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
@@ -411,7 +411,7 @@
 
     public void initSettingsH() {
         mSettingsView.setVisibility(
-                mDeviceProvisionedController.isDeviceProvisioned() ? VISIBLE : GONE);
+                mDeviceProvisionedController.isCurrentUserSetup() ? VISIBLE : GONE);
         mSettingsIcon.setOnClickListener(v -> {
             Events.writeEvent(mContext, Events.EVENT_SETTINGS_CLICK);
             Intent intent = new Intent(Settings.ACTION_SOUND_SETTINGS);
