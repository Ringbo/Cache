diff --git a/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java b/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java
index d514c99..99cba4d 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/VolumePanel.java
@@ -455,7 +455,7 @@
             if (sc.controller != null) {
                 sc.controller.setVolumeTo(index, flags);
             } else {
-                Log.wtf(mTag, "Adjusting remote volume without a controller!");
+                Log.w(mTag, "Adjusting remote volume without a controller!");
             }
         } else if (getStreamVolume(sc.streamType) != index) {
             if (sc.streamType == STREAM_MASTER) {
