diff --git a/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java b/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java
index cc01ded..84cc1cdc 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java
@@ -659,7 +659,7 @@
 
     public void postZenModeChanged(boolean zen) {
         removeMessages(MSG_ZEN_MODE_CHANGED);
-        obtainMessage(MSG_ZEN_MODE_CHANGED, zen ? 1 : 0).sendToTarget();
+        obtainMessage(MSG_ZEN_MODE_CHANGED, zen ? 1 : 0, 0).sendToTarget();
     }
 
     public void postVolumeChanged(int streamType, int flags) {
@@ -737,7 +737,7 @@
 
     public void postLayoutDirection(int layoutDirection) {
         removeMessages(MSG_LAYOUT_DIRECTION);
-        obtainMessage(MSG_LAYOUT_DIRECTION, layoutDirection).sendToTarget();
+        obtainMessage(MSG_LAYOUT_DIRECTION, layoutDirection, 0).sendToTarget();
     }
 
     /**
