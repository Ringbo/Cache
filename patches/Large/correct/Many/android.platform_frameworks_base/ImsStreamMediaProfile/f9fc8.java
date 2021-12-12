diff --git a/telephony/java/com/android/ims/ImsStreamMediaProfile.java b/telephony/java/com/android/ims/ImsStreamMediaProfile.java
index 359b270..5a99212 100644
--- a/telephony/java/com/android/ims/ImsStreamMediaProfile.java
+++ b/telephony/java/com/android/ims/ImsStreamMediaProfile.java
@@ -76,7 +76,7 @@
     }
 
     public ImsStreamMediaProfile() {
-        mAudioQuality = AUDIO_QUALITY_AMR_WB;
+        mAudioQuality = AUDIO_QUALITY_NONE;
         mAudioDirection = DIRECTION_SEND_RECEIVE;
         mVideoQuality = VIDEO_QUALITY_NONE;
         mVideoDirection = DIRECTION_INVALID;
