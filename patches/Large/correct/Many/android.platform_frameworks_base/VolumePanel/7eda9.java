diff --git a/core/java/android/view/VolumePanel.java b/core/java/android/view/VolumePanel.java
index 48fe0df..1072953 100644
--- a/core/java/android/view/VolumePanel.java
+++ b/core/java/android/view/VolumePanel.java
@@ -400,7 +400,10 @@
         if (LOGD) Log.d(TAG, "onVolumeChanged(streamType: " + streamType + ", flags: " + flags + ")");
 
         if ((flags & AudioManager.FLAG_SHOW_UI) != 0) {
-            if (mActiveStreamType == -1) {
+                // If the activePanel is none - or - the one we are updating is not the current active panel
+                // then it is likely that the audio stream being updated has been swapped by an app
+                // we need to reorder the sliders to bring the new active one to the front
+            if (mActiveStreamType == -1 || streamType != mActiveStreamType) {
                 reorderSliders(streamType);
             }
             onShowVolumeChanged(streamType, flags);
