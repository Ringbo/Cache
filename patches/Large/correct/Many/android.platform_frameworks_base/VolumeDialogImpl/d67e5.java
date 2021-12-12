diff --git a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
index 5a19a76..9041d5a 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
@@ -368,16 +368,16 @@
                 mController.setActiveStream(row.stream);
                 if (row.stream == AudioManager.STREAM_RING) {
                     final boolean hasVibrator = mController.hasVibrator();
-                    if (mState.ringerModeInternal == AudioManager.RINGER_MODE_NORMAL) {
+                    if (mState.ringerModeExternal == AudioManager.RINGER_MODE_NORMAL) {
                         if (hasVibrator) {
-                            mController.setRingerMode(AudioManager.RINGER_MODE_VIBRATE, false);
+                            mController.setRingerMode(AudioManager.RINGER_MODE_VIBRATE, true);
                         } else {
                             final boolean wasZero = row.ss.level == 0;
                             mController.setStreamVolume(stream,
                                     wasZero ? row.lastAudibleLevel : 0);
                         }
                     } else {
-                        mController.setRingerMode(AudioManager.RINGER_MODE_NORMAL, false);
+                        mController.setRingerMode(AudioManager.RINGER_MODE_NORMAL, true);
                         if (row.ss.level == 0) {
                             mController.setStreamVolume(stream, 1);
                         }
@@ -403,15 +403,15 @@
                 return;
             }
             final boolean hasVibrator = mController.hasVibrator();
-            if (mState.ringerModeInternal == AudioManager.RINGER_MODE_NORMAL) {
+            if (mState.ringerModeExternal == AudioManager.RINGER_MODE_NORMAL) {
                 if (hasVibrator) {
-                    mController.setRingerMode(AudioManager.RINGER_MODE_VIBRATE, false);
+                    mController.setRingerMode(AudioManager.RINGER_MODE_VIBRATE, true);
                 } else {
                     final boolean wasZero = ss.level == 0;
                     mController.setStreamVolume(AudioManager.STREAM_RING, wasZero ? 1 : 0);
                 }
             } else {
-                mController.setRingerMode(AudioManager.RINGER_MODE_NORMAL, false);
+                mController.setRingerMode(AudioManager.RINGER_MODE_NORMAL, true);
                 if (ss.level == 0) {
                     mController.setStreamVolume(AudioManager.STREAM_RING, 1);
                 }
@@ -552,7 +552,7 @@
             if (ss == null) {
                 return;
             }
-            switch (mState.ringerModeInternal) {
+            switch (mState.ringerModeExternal) {
                 case AudioManager.RINGER_MODE_VIBRATE:
                     mRingerStatus.setText(R.string.volume_ringer_status_vibrate);
                     mRingerIcon.setImageResource(R.drawable.ic_volume_ringer_vibrate);
@@ -653,9 +653,9 @@
         final boolean isAlarmStream = row.stream == AudioManager.STREAM_ALARM;
         final boolean isMusicStream = row.stream == AudioManager.STREAM_MUSIC;
         final boolean isRingVibrate = isRingStream
-                && mState.ringerModeInternal == AudioManager.RINGER_MODE_VIBRATE;
+                && mState.ringerModeExternal == AudioManager.RINGER_MODE_VIBRATE;
         final boolean isRingSilent = isRingStream
-                && mState.ringerModeInternal == AudioManager.RINGER_MODE_SILENT;
+                && mState.ringerModeExternal == AudioManager.RINGER_MODE_SILENT;
         final boolean isZenAlarms = mState.zenMode == Global.ZEN_MODE_ALARMS;
         final boolean isZenNone = mState.zenMode == Global.ZEN_MODE_NO_INTERRUPTIONS;
         final boolean zenMuted = isZenAlarms ? (isRingStream || isSystemStream)
