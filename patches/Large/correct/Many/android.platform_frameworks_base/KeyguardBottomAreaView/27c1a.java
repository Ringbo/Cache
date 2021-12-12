diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/KeyguardBottomAreaView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/KeyguardBottomAreaView.java
index accfa5b..4da9acd 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/KeyguardBottomAreaView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/KeyguardBottomAreaView.java
@@ -374,7 +374,7 @@
         Intent intent = getCameraIntent();
         ActivityInfo targetInfo = PreviewInflater.getTargetActivityInfo(mContext, intent,
                 KeyguardUpdateMonitor.getCurrentUser());
-        if (targetInfo != null) {
+        if (targetInfo != null && targetInfo.metaData != null) {
             String clazz = targetInfo.metaData.getString(
                     MediaStore.META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE);
             if (clazz != null) {
