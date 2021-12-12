diff --git a/core/java/android/preference/SeekBarVolumizer.java b/core/java/android/preference/SeekBarVolumizer.java
index 1ec00db..11b9606 100644
--- a/core/java/android/preference/SeekBarVolumizer.java
+++ b/core/java/android/preference/SeekBarVolumizer.java
@@ -142,13 +142,13 @@
         final boolean zenMuted = isZenMuted();
         mSeekBar.setEnabled(!zenMuted);
         if (zenMuted) {
-            mSeekBar.setProgress(mLastAudibleStreamVolume);
+            mSeekBar.setProgress(mLastAudibleStreamVolume, true);
         } else if (mNotificationOrRing && mRingerMode == AudioManager.RINGER_MODE_VIBRATE) {
-            mSeekBar.setProgress(0);
+            mSeekBar.setProgress(0, true);
         } else if (mMuted) {
-            mSeekBar.setProgress(0);
+            mSeekBar.setProgress(0, true);
         } else {
-            mSeekBar.setProgress(mLastProgress > -1 ? mLastProgress : mOriginalStreamVolume);
+            mSeekBar.setProgress(mLastProgress > -1 ? mLastProgress : mOriginalStreamVolume, true);
         }
     }
 
@@ -313,13 +313,13 @@
 
     public void muteVolume() {
         if (mVolumeBeforeMute != -1) {
-            mSeekBar.setProgress(mVolumeBeforeMute);
+            mSeekBar.setProgress(mVolumeBeforeMute, true);
             postSetVolume(mVolumeBeforeMute);
             postStartSample();
             mVolumeBeforeMute = -1;
         } else {
             mVolumeBeforeMute = mSeekBar.getProgress();
-            mSeekBar.setProgress(0);
+            mSeekBar.setProgress(0, true);
             postStopSample();
             postSetVolume(0);
         }
